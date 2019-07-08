package createXML;

import java.sql.*;
import java.util.ArrayList;

public class PostgreSQLConnect {
    //  Database credentials
    static final String DB_URL = "jdbc:postgresql://10.61.12.90:5432/stat";
    static final String USER = "stat_web";
    static final String PASS = "$Tat!st:kI";


    public static void main(String[] argv) {
        String dateCalc = "2018-12-29";
        //dateCalc = "2018-11-30";

        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;
        Statement statement = null;
        String query = "select date_calc, rp, msb_all, msb_probl, msb_npl, corp_all, corp_probl, corp_npl from stat_portal.sp_cor_riskapp_api where date_calc = '" + dateCalc + "';";
        ResultSet rs = null;
        ArrayList<DataNPL> listNLP = new ArrayList<>();
        System.out.println(new ValidatorParam().checkDate(dateCalc));
        if (new ValidatorParam().checkDate(dateCalc)) {
            try {
                connection = DriverManager.getConnection(DB_URL, USER, PASS);
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

                //System.out.println(connection.toString());
                //System.out.println(statement.toString());
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                System.out.println("Connection Failed");
                e.printStackTrace();
                return;
            }
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }

        XMLCreator xmlCreator = new XMLCreator(listNLP);
        System.out.println(xmlCreator.getXML());



    }
}
