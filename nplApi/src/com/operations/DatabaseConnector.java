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
        String query = "select date_calc, rp, msb_all, msb_probl, msb_npl, corp_all, corp_probl, corp_npl from stat_portal.sp_cor_riskapp_api where date_calc = '" + dateCalc + "';";
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
                            rs.getString("msb_all"),
                            rs.getString("msb_probl"),
                            rs.getString("msb_npl"),
                            rs.getString("corp_all"),
                            rs.getString("corp_probl"),
                            rs.getString("corp_npl")
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

    public static boolean checkPermission(String login) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        int count = 0;
        String query = "select count(*) as cnt from public.data_i_java_services where upper(login) = upper('" + login + "') and service_name = 'NPL';";
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            ;
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                count = rs.getInt("cnt");
            }

            if (count > 0) {
                return true;
            } else {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
                return false;
            }
        } catch (org.postgresql.util.PSQLException e) {
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}
