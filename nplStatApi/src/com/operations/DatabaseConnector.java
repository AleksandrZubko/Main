package com.operations;

import java.sql.*;
import java.util.ArrayList;


public class DatabaseConnector {
    //  Database config
    private final static String DB_URL = "jdbc:postgresql://10.61.12.90:5432/stat";
    private final static String USER = "stat_web";
    private final static String PASS = "$Tat!st:kI";
    private final static String XML_BEGIN = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";


    static ArrayList<DataNPL> listNLP = new ArrayList<>();

    public static boolean checkDriver() {
        try {
            Class.forName("org.postgresql.Driver");
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean checkConnectToDatabase() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            connection.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String getData(String dateCalc) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        String query = "select date_calc, rp, graph_value from stat_portal.sp_cor_riskapp_api_7386442 where date_calc = '" + dateCalc + "';";
        System.out.println(query);
        if (!new ValidatorParam().checkDate(dateCalc)) {
            return XML_BEGIN + "<error>Date format is not correct</error>";
        } else {
            try {
                listNLP.clear();
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
                ;
                statement = connection.createStatement();
                rs = statement.executeQuery(query);
                while (rs.next()) {
                    DataNPL nlp = new DataNPL(
                            rs.getString("date_calc"),
                            rs.getString("rp"),
                            rs.getString("graph_value")
                    );
                    listNLP.add(nlp);
                }

                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

                return new XMLCreator(listNLP).getXML();
            } catch (org.postgresql.util.PSQLException e) {
                e.printStackTrace();
                return XML_BEGIN + "<error>Problem with query execution. A non-existent date is possible</error>";
            } catch (SQLException e) {
                e.printStackTrace();
                return XML_BEGIN + "<error>Connection to DataBase is Failed</error>";
            }
        }
    }

    public static String getData(String yearDateCalc, String monthDateCalc) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        String query = "select date_calc, rp, graph_value from stat_portal.sp_cor_riskapp_api_7386442 where EXTRACT(MONTH FROM date_calc) = " + monthDateCalc +
                "and EXTRACT(YEAR FROM date_calc) = " + yearDateCalc + ";";
        System.out.println(query);
        if (!new ValidatorParam().checkYearAndMonth(yearDateCalc, monthDateCalc)) {
            return XML_BEGIN + "<error>Date format is not correct</error>";
        } else {
            try {
                listNLP.clear();
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
                ;
                statement = connection.createStatement();
                rs = statement.executeQuery(query);
                while (rs.next()) {
                    DataNPL nlp = new DataNPL(
                            rs.getString("date_calc"),
                            rs.getString("rp"),
                            rs.getString("graph_value")
                    );
                    listNLP.add(nlp);
                }

                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

                return new XMLCreator(listNLP).getXML();
            } catch (org.postgresql.util.PSQLException e) {
                e.printStackTrace();
                return XML_BEGIN + "<error>Problem with query execution. A non-existent date is possible</error>";
            } catch (SQLException e) {
                e.printStackTrace();
                return XML_BEGIN + "<error>Connection to DataBase is Failed</error>";
            }
        }
    }
}
