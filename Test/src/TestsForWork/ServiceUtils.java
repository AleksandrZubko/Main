package TestsForWork;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ServiceUtils {
    public static final String PROMIN_URL = "https://promin.privatbank.ua:8073/ChameleonServer/sessions/open?lang=RU";
    public static final String PROMIN_TEST_URL = "https://promin-test.it.loc/ChameleonServer/sessions/open?lang=RU";
    public static final String PROMIN_AB_URL = "https://promin.a-bank.com.ua/ChameleonServer/sessions/open?lang=RU";

/*

    public static String getKvitSidAb()
    {
        String url = PROMIN_AB_URL;

        String sid = "";
        org.json.simple.JSONObject user = new JSONObject();
        user.put("login", "INFOFORKVIT");
        user.put("auth", "EXCL");
        user.put("password", "V4tn6gepXmSK3WKpwAxh");

        org.json.simple.JSONObject full = new JSONObject();
        full.put("user", user);

        initHttpClient();
        String result = ClientHttp.postData(url,full.toJSONString(),"promin");

        org.json.simple.JSONObject res = new JSONObject();
        res = (JSONObject)JSONValue.parse(result);

        try
        {
            sid = res.get("value").toString();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            return result;
        }
        return sid;
    }



    public static String getKvitSid()
    {
        String url = PROMIN_URL;

        String sid = null;
        //sid = getCurrentSid();//////////////
        if (sid == null)
        {
            org.json.simple.JSONObject user = new JSONObject();
            user.put("login", "INFOFORKVIT");
            user.put("auth", "EXCL");
            user.put("password", "V4tn6gepXmSK3WKpwAxh");

            org.json.simple.JSONObject full = new JSONObject();
            full.put("user", user);

            initHttpClient();
            String result = ClientHttp.postData(url,full.toJSONString(),"promin");

            org.json.simple.JSONObject res = new JSONObject();
            res = (JSONObject)JSONValue.parse(result);

            try
            {
                sid = res.get("value").toString();
            }
            catch (Exception ex)
            {
                ex.printStackTrace();
                return result;
            }
            //setCurrentSid(sid);////////////
        }
        return sid;
    }
*/
    public static String getCurrentSid()
    {
        InputStreamReader iStreamReader = null;
        StringBuilder sb = new StringBuilder();
        try
        {
            File f = new File("/home/DN230483ZAV2/Trash/sid");
            System.out.println(4);
            if (!f.exists())
            {
                f.createNewFile();
                System.out.println("1");
                return null;
            }

            RandomAccessFile raFile = new RandomAccessFile(f, "r");
            byte[] b = new byte[(int)f.length()];
            raFile.read(b);

            Base64.Decoder dec = Base64.getDecoder();
            sb.append(new String(dec.decode(b)));


            int y = Integer.parseInt(sb.substring(0,4));
            int m = Integer.parseInt(sb.substring(4,6));
            int d = Integer.parseInt(sb.substring(6,8));
            int h = Integer.parseInt(sb.substring(9,11));
            int mi = Integer.parseInt(sb.substring(12,14));
            int s = Integer.parseInt(sb.substring(15,17));

            Calendar cl = new GregorianCalendar(y, m - 1, d, h, mi, s);
            Calendar cl2 = new GregorianCalendar();

            int diffMonth = cl2.get(Calendar.MONTH) - cl.get(Calendar.MONTH);
            int diffDays = cl2.get(Calendar.DAY_OF_MONTH) - cl.get(Calendar.DAY_OF_MONTH);
            int diffHours = cl2.get(Calendar.HOUR_OF_DAY) - cl.get(Calendar.HOUR_OF_DAY);
            int diffMinute = cl2.get(Calendar.MINUTE) - cl.get(Calendar.MINUTE);

            if (diffMonth >= 1 || diffDays >= 1  || diffHours >= 1 || diffMinute > 30)
            {
                System.out.println("2");
                return null;
            }
        }
        catch (Exception ex)
        {
            System.out.println("3");
            return null;
        }
        return sb.substring(18, 38);
    }

    public static void setCurrentSid(String sid)
    {
        FileOutputStream foStream = null;
        try
        {
            File f = new File("/home/DN230483ZAV2/Trash/sid");
            if (!f.exists()) {
                f.createNewFile();
            }

            foStream = new FileOutputStream(f);

            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
            Date date = new Date();

            String wrt = sdFormat.format(date) + " " + sid;

            //byte[] b = Base64.encodeBase64(wrt.getBytes());

            byte[] b = Base64.getEncoder().encode(wrt.getBytes());

            foStream.write(b);
        }
        catch (IOException ioex)
        {
            ioex.printStackTrace();
        }
        finally
        {
            try
            {
                foStream.flush();
                foStream.close();
            }
            catch (IOException ioex)
            {
                ioex.printStackTrace();
            }
        }
    }
/*
    public static JSONObject normaliseJson(String dataJson)
    {
        org.json.simple.JSONObject result = new JSONObject();
        try
        {
            org.json.simple.JSONObject json = (org.json.simple.JSONObject)org.json.simple.JSONValue.parse(dataJson);
            Set s = json.keySet();
            List listKey = getKey(s.iterator());
            result = getValue(listKey, json);
        }
        catch (Exception ex)
        {
            print(ex.toString());
            return null;
        }
        return result;
    }

    public static JSONObject getValue(List listKey, org.json.simple.JSONObject json)
    {
        JSONObject result  =  new JSONObject();
        for (Object o: listKey)
        {
            if (json.get(o) instanceof org.json.simple.JSONObject)
            {
                org.json.simple.JSONObject local = normaliseJson(o.toString());
                result.put(o.toString(), null);
                result.putAll(local);
            }
            else if (json.get(o) instanceof JSONArray)
            {
                org.json.simple.JSONObject local = getArraytoJson((org.json.simple.JSONArray)json.get(o));
                result.put(o.toString(), null);
                result.putAll(local);
            }
            else
            {
                result.put(o.toString(), json.get(o));
            }
        }

        return result;
    }

    public static org.json.simple.JSONObject getArraytoJson(org.json.simple.JSONArray arr)
    {
        org.json.simple.JSONObject local = new JSONObject();
        for (int i = 0; i < arr.size();i++)
        {
            org.json.simple.JSONObject put = normaliseJson(arr.get(i).toString());
            for (Object o: getKey(put.keySet().iterator()))
            {
                local.put(o.toString(),put.get(o));
            }
        }
        return local;
    }

    public static List getKey(Iterator i)
    {
        List list = new ArrayList();
        while (i.hasNext())
        {
            list.add(i.next());
        }
        return list;
    }

    public static String createProcRef()
    {
        String rndChars = "QWERTYUIOPASDFGHJKLZXCVBNM";

        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        SimpleDateFormat sdft = new SimpleDateFormat("yyMMdd");
        Date date = new Date();

        String refSufix = "W1";

        for (int i = 0; i < 6; i++)
        {
            sb.append(rndChars.charAt(Math.abs(rnd.nextInt(rndChars.length()))));
        }

        String millsec = String.valueOf(date.getTime());
        millsec = millsec.substring(millsec.length() - 6, millsec.length());
        String procRef = sdft.format(date) + refSufix  + millsec + sb.toString();

        return procRef;
    }
    */

}
