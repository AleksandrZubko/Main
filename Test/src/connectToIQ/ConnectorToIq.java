package connectToIQ;

/**Connection to SAP IQ
 * @autor Zubko Oleksandr
 */

///10.62.11.81:2222/DATA/Gremlin/lib/jconn4.jar  -тут можно взять библиотеку com.sybase.jdbc4.jdbc.SybDriver
import com.sybase.jdbc4.jdbc.SybDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectorToIq {
    /**
     * @param login     Логин для подключения к серверу
     * @param password  Пароль подключения к серверу
     * @param url       url соединения
     * @param sqlQuery  Выполняемый запрос
     * @return          Возвращает ResultSet, который вернул запрос
     */
    public ResultSet executeSQL(String login, String password, String url, String sqlQuery) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        SybDriver sybDriver = null;
        Object res = null;

        try {
            sybDriver = (SybDriver) Class.forName("com.sybase.jdbc4.jdbc.SybDriver").newInstance();
            connection = DriverManager.getConnection(url, login, password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}


class Main {
    public static void main(String[] args) {
        String login = "rimsLoader";
        String password = "rimaserver2";
        String url = "jdbc:sybase:Tds:rims.vm.pbank.com.ua:2639?SERVICENAME=rims";
        String sqlQuery = "select 1 as res;";
        sqlQuery = "select exp(sum(log(t.value/100) )) as res from RM.IFRS9_MACRO_FACT t where t.index_ = 'Consum_price_index_prev_m'\n" +
                "and ymd(t.year,t.month, 01) > '2017-03-01';";
        ResultSet resultSet = new ConnectorToIq().executeSQL(login, password, url, sqlQuery);
        try {
            while (resultSet.next()) {
                System.out.println(resultSet.getString("res"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}