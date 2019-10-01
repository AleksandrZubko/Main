package createXML;

public class StartClass {
    public static void main(String[] args) {
        String dateCalc = "20181229"; //передаётся в параметрере запроса на вход, допускаются форматы 2018-12-29 и 20181229
        String cid = "190902csb3dbfanfe2on"; //передаётся в заголовках запроса
        //cid = "MTkwNjE4Y3NiMWdsd28xM3hmNm4=";
        DatabaseConnector connector = new DatabaseConnector();
        String sessionsLogin = null;

        if (CIDChecker.isBase64(cid)){
            sessionsLogin = SessionsChecker.getSessionLogin(SessionsChecker.decodeCID(cid));
        } else {
            sessionsLogin = SessionsChecker.getSessionLogin(cid);
        }
        System.out.println(sessionsLogin);

/*
        if (sessionsLogin.equals("Session UNAUTAREZATED")){
            System.out.println(sessionsLogin);
        } else {
            if (connector.checkDriver()) {
                if (connector.checkConnectToDatabase()) {
                    if (connector.checkPermission(sessionsLogin)) {
                        System.out.println(connector.getData(dateCalc));
                    } else {
                        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?><error>For login " + sessionsLogin + " there is no access to the API</error>");
                    }
                } else {
                    System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?><error>Connection to database is failed</error>");
                }
            } else {
                System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?><error>PostgreSQL JDBC Driver is not found. Include it in your library path</error>");
            }
        }
        */
    }
}
