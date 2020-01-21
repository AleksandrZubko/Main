

package com.operations;


import com.sybase.jdbc4.jdbc.SybDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class ConnectorToIq {
    final String LOGIN = "rimsLoader";
    final String PASSWORD = "rimaserver2";
    final String URL = "jdbc:sybase:Tds:rims.vm.pbank.com.ua:2639?SERVICENAME=rims";
    final String SQL_QUERY = "select t1.CC_APP_01, t2.CC_APP_03 from (select exp(sum(log(t1.value/100) )) as CC_APP_01 from RM.IFRS9_MACRO_FACT t1 \n" +
            "where t1.index_ = 'Consum_price_index_prev_m' and ymd(t1.year,t1.month, 01) > '2017-03-01') as t1 join \n" +
            "(select exp(sum(log(t.value/100) )) as CC_APP_03 from RM.IFRS9_MACRO_FACT t where t.index_ = 'Consum_price_index_prev_m'\n" +
            "and ymd(t.year,t.month, 01) > '2019-01-01') as t2 on 1=1;";
    /*
    final String SQL_QUERY =    "select exp(sum(log(t.value/100) )) as inflation from RM.IFRS9_MACRO_FACT t where t.index_ = 'Consum_price_index_prev_m'\n" +
            "and ymd(t.year,t.month, 01) > '2017-03-01';";
    public Map<String, String>  executeSQL() {
        Map<String, String> answer = new HashMap<String, String>();
        answer.put("status", "fail");
        answer.put("result", "reason not determined");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        SybDriver sybDriver = null;
        String res = null;

        try {
            sybDriver = (SybDriver) Class.forName("com.sybase.jdbc4.jdbc.SybDriver").newInstance();
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_QUERY);
            while (resultSet.next()) {
                res = resultSet.getString("inflation");
            }
            answer.clear();
            answer.put("status", "success");
            answer.put("result", res);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }
    */

    public Map<String, String>  executeSQL() {
        Map<String, String> answer = new HashMap<String, String>();
        answer.put("status", "fail");
        answer.put("result", "reason not determined");
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        SybDriver sybDriver = null;
        String res = null;
        String CC_APP_01 = null;
        String CC_APP_03 = null;

        try {
            sybDriver = (SybDriver) Class.forName("com.sybase.jdbc4.jdbc.SybDriver").newInstance();
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQL_QUERY);
            while (resultSet.next()) {
                CC_APP_01 = resultSet.getString("CC_APP_01");
                CC_APP_03 = resultSet.getString("CC_APP_03");
                res = "[{\"CC_APP_01\":\"" + CC_APP_01 + "\", \"CC_APP_03\":\"" + CC_APP_03 + "\"}]";
            }
            answer.clear();
            answer.put("status", "success");
            answer.put("result", res);

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }

}
