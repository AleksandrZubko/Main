package com.operations;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Operations {
    public static class RunSh {

        public static String checkMongo(String procId, String tableName, int checkId) {
            String line = null;
            String answer = "{\"status\": \"fail\", \"result\":\"required parameter procId not found\" }";
            String parametrs = null;
            String[] result = new String[1];
            Process proc = null;
            int counter = 0;
            String chid = "none";

            String[] command = {"/bin/sh", "-c", ""};

            if (procId != null) {
                if (checkId != -1) {
                    chid = "" + checkId;
                }
                if (tableName != null) {
                    parametrs = " " + procId + " " + tableName + " " + chid + " " + 1;

                } else {
                    parametrs = " " + procId + " none " + chid + " " + 1;
                }
                //command[3] = "cd /DATA/script/RGL/CheckLog/; ./checksMongo.sh" + parametrs;
                command[2] = "cd /home/jupyter/; ./startCheckMongo.sh" + parametrs;
                try {
                    proc = Runtime.getRuntime().exec(command);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                try {
                    while ((line = reader.readLine()) != null) {
                        if (counter < 1) {
                            result[counter] = line;
                        }
                        counter++;
                    }
                    proc.waitFor();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                if (StringUtils.substringBetween(result[0], "{\"", "\" :").equals("procId")) {
                    answer = "{\"status\": \"access\", \"result\":\"" + result[0] + "\"}";
                } else {
                    answer = "{\"status\": \"fail\", \"result\":\"execution failure /DATA/script/RGL/CheckLog/checksMongo.sh\" }";
                }
                return answer;
            } else {
                return answer;
            }
        }

        public static String checkMongo(String procId, String tableName) {
            return checkMongo(procId, tableName, -1);
        }

        public static String checkMongo(String procId) {
            return checkMongo(procId, "none");
        }
    }

}
