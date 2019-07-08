package createXML;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


//import org.bson.Document;

public class SessionsCheck {

        public static  final String UNAUTAREZATETD = "NRMSession.UNAUTAREZATETD";

        private static final String LOGIN = "NRM";
        private static final String PASSWORD = "fls45_p6#df";
        private static final String PROMIN_URL = "https://promin.privatbank.ua/ChameleonServer";
        private static final String COUNTRY = "UA";
        private static final String AUTH_TYPE = "EXCL";
        private static final String LANG = "RU";
        private static final boolean isTurnOffSSH = false;

        private static final String PARAM_LOGIN = "login=\"";
        private static final String SID_VALUE   = "value=\"";


        public static String getSession()
        {


            String url = PROMIN_URL + "/sessions/open?lang=" + LANG;

            String send =
                    "<?xml version='1.0' encoding='UTF-8' standalone='yes'?><session "
                            +"ip='" + getCurrentIP() + "'"
                            +"><user auth='" + AUTH_TYPE + "' login='" + LOGIN + "' password='" + PASSWORD + "' /></session>";

            //print(url);
            //print(send);

            //print("\n***\n" + PostHTTPS(url, send));

            String rez = PostHTTPS(url, send);
            System.out.println(rez);

            rez = rez.substring(rez.indexOf(SID_VALUE) + SID_VALUE.length());
            //print(rez);
            //rez = StringUtils.substringBefore(rez, "\"");

            return rez;
        }


        public static String getSessionLogin(String sid)
        {
            if (sid == null) return UNAUTAREZATETD;

            String rez = sendGet(PROMIN_URL + "/sessions/get/" + sid);

            if (rez.toLowerCase().contains("errormessage"))
                rez = UNAUTAREZATETD;

            else
            {
                System.out.println("rez = " + rez);
                //rez = StringUtils.substringBetween(rez, "login=\"", "\" ");

                if (!checkLdap(rez)) rez = UNAUTAREZATETD;
            }

            return rez;
        }

        private static boolean checkLdap(String ldap)
        {
            return true;
        }


        private static String getCurrentIP()
        {
            String ip = null;
            try
            {
                InetAddress IP = InetAddress.getLocalHost();
                ip = IP.getHostAddress();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }

            return ip;
        }

        public static String PostHTTPS(String urlStr, String xml, HashMap map)
        {
            //String url = Holder.URL_CXP_DOWNLOAD;

            if (!isTurnOffSSH) turnOffSSH();

            OutputStreamWriter writer = null;
            InputStream result = null;
            //String Sid = getSession();

            try
            {
                URL url = new URL(urlStr);

                HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

                urlConnection.setUseCaches(false);
                urlConnection.setDoOutput(true); // Triggers POST.
                urlConnection.setRequestMethod("POST");

                urlConnection.setRequestProperty("Content-Type", "text/xml");

                if (map != null)
                {
                    Iterator iter = (Iterator) map.keySet().iterator();

                    while(iter.hasNext()) {

                        Map.Entry entry = (Map.Entry) iter.next();
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                        urlConnection.setRequestProperty (entry.getKey().toString(), entry.getValue().toString());

                    }


                }

                urlConnection.connect();

                byte[] outputBytes = xml.getBytes("UTF-8");

                OutputStream os = urlConnection.getOutputStream();
                os.write(outputBytes);

                result = urlConnection.getInputStream();

                os.close();
            }
            catch (Exception e)
            {
                System.out.println("PostCOM1 Exception = " + e.getMessage());
            }
            finally
            {
                if (writer != null) try { writer.close(); } catch (IOException logOrIgnore) {}
            }


            if (result != null)
                return convertStreamToString(result);
            else
                return "";
        }

        public static String PostHTTPS(String urlStr, String xml)
        {
            return PostHTTPS(urlStr, xml, null);
        }


        static String convertStreamToString(java.io.InputStream is) {
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
            return s.hasNext() ? s.next() : "";
        }


        public static String sendGet(String url)
        {
            if (!isTurnOffSSH) turnOffSSH();

            String rezult = "";
            try
            {
                URL obj = new URL(url);
                //System.out.println(url);

                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("GET");
                //con.setRequestProperty("User-Agent", "Mozilla/5.0");

                BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                rezult = response.toString();
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
                rezult = "";
            }

            return rezult;
        }

        static void turnOffSSH()
        {

            // Create a trust manager that does not validate certificate chains
            TrustManager[] trustAllCerts = new TrustManager[] {new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }
                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }
            }
            };


            try {
                SSLContext sc = SSLContext.getInstance("SSL");
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            } catch (Exception e) {
                e.printStackTrace();
            }


            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, String session) {
                    return true;
                }
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };

            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        }

}
