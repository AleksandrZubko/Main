package sendToCXP;

import org.apache.commons.lang3.StringUtils;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Map;

public class NRMSession {
    public static  final String UNAUTAREZATED = "Session UNAUTAREZATED";
    private static final String PROMIN_URL = "https://promin.privatbank.ua/ChameleonServer";
    private static final boolean isTurnOffSSH = false;



    public static String getSessionLogin(String cid) {

        if (cid == null) {
            return UNAUTAREZATED;
        }
        String rez = sendGet(PROMIN_URL + "/sessions/get/" + cid);;

        if (rez.toLowerCase().contains("errormessage"))
            rez = UNAUTAREZATED;

        else {
            rez = StringUtils.substringBetween(rez, "login=\"", "\" ");

        }

        return rez;
    }

    public static String decodeCID (String sidBase64) {
        if (sidBase64 == null) {
            return UNAUTAREZATED;
        } else {
            Base64.Decoder dec = Base64.getDecoder();
            String cid = new String(dec.decode(sidBase64));
            return cid;
        }
    }

    public static String sendGet(String url)
    {
        if (!isTurnOffSSH) turnOffSSH();

        String rezult = "";
        try
        {
            URL obj = new URL(url);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");


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


    public static String PostHTTPSTest(String urlStr, String xml
            , String sidKey, String sidValue
    )
    {
        //String url = Holder.URL_CXP_DOWNLOAD;

        if (!isTurnOffSSH) turnOffSSH();

        OutputStreamWriter writer = null;
        InputStream result = null;
//         String Sid = getSession();

        try
        {
            URL url = new URL(urlStr);

            HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();

            urlConnection.setUseCaches(false);
            urlConnection.setDoOutput(true); // Triggers POST.
            urlConnection.setRequestMethod("POST");

            urlConnection.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");

            urlConnection.setRequestProperty(sidKey, sidValue);
            //System.out.println(urlConnection.getRequestProperty(sidKey));


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

    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }



    public static String PostHTTPS(String urlStr, String xml)
    {
        return PostHTTPS(urlStr, xml, null);
    }

    public static String PostHTTPS(String urlStr, String xml, Map map)
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
/*
            if (map != null)
            {
                for(Map.Entry entry : map.entrySet())
                {
                    urlConnection.setRequestProperty (entry.getKey(), entry.getValue());
                }
            }
*/
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

}
