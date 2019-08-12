package sendToCXP;

public class CXPOperation {
    private static final String URL_GET_URL_FOR_ATTACH = "https://att.privatbank.ua/all/attachmentservice/geturlforattach.xml";  //получение ссылки на файл
    private static final String URL_WRITE = "https://att.privatbank.ua/all/attachmentservice/write.xml";  //запись
    private static final String URL_OBTAIN = "https://att.privatbank.ua/all/attachmentservice/obtain.xml"; //резервирование
    private static String request = null;
    private static String result = null;
    private static String sidKey = "sid";

    public static String getUrlForAttach(String ticketId, String sidValue) {
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<cxp>\n" +
                "    <urlreq>\n" +
                "        <attachment id=\"" + ticketId + "\"/>\n" +
                "    </urlreq>\n" +
                "</cxp>";

        result = NRMSession.PostHTTPSTest(URL_GET_URL_FOR_ATTACH, request, sidKey, sidValue);
        return result;
    }

    public static String write(String dataBase64, String clientID, String groupID, String format, String sidValue) {
        request = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>" +
                "<cxp>" +
                "<writereq data=\"" + dataBase64 + "\" creator=\"NRM\" ext=\"" + format + "\" vddoc=\"3274\">" +
                "<atsr id=\"35\" value=\"" + clientID + "\"/>" +   //atsr - добавляемые реквизиты, id="35" - clientID  (динамический)
                "<atsr id=\"603\" value=\"" + groupID + "\"/>" +  //atsr - добавляемые реквизиты, id="603" - ID группы (динамический)
                "<scbo id=\"0\" srvcust=\"GSK\">" +  //бизнес-операция
                "<busop id=\"355\"/>" +  //номер бизнес-дела к бизнес-операции, в атрибуте id
                "</scbo>" +
                "</writereq>" +
                "</cxp>";

        result = NRMSession.PostHTTPSTest(URL_WRITE, request, sidKey, sidValue);
        return result;
    }
}
