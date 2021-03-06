package com.operations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WorkWithGremlin {
    //final static String pathToGremlin = "/home/DN230483ZAV2/Gremlin_test/Gremlin/"; //для теста
    final static String pathToGremlin = "/DATA/Gremlin/";                              //боевой

    public static String distributor(String operation, String pathBsh) {

        Map<String, String> defaultAnswerMap = new HashMap<String, String>();
        defaultAnswerMap.put("status", "fail");
        defaultAnswerMap.put("result", "wrong parameters");

        if (operation.equals("list")) {
            return ResponseHandler.getJSON(listBsh());
        } else if (validatorPathBsh(pathBsh)) {
            if (operation.equals("start")) {
                return ResponseHandler.getJSON(startBsh(pathBsh));
            } else if (operation.equals("kill")) {
                return ResponseHandler.getJSON(killBsh(pathBsh));
            } else {
                return ResponseHandler.getJSON(defaultAnswerMap);
            }
        } else {
            return ResponseHandler.getJSON(defaultAnswerMap);
        }
    }

    private static boolean validatorPathBsh(String pathBsh) {
        if (pathBsh.length() > 15) {
            if (pathBsh.substring(0, 8).equals("scripts/") && pathBsh.substring(pathBsh.lastIndexOf(".")).equals(".bsh")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    //added 2019-10-07
    //https://itsm.privatbank.ua/predmine/other__tasks/issue/1289068.htm
    static boolean checkRunRgl(String path){
        boolean res = false;
        Map<String, String> listBsh = listBsh();
        String val = null;
        for (Map.Entry tmp : listBsh.entrySet()) {
            if (tmp.getKey().toString().equals("result")){
                val = tmp.getValue().toString();
                val = val.substring(1, val.length()-1);
            }
        }
        String[] valArr = val.split(", ");
        for (String s: valArr) {
            if(path.toUpperCase().equals(s.toUpperCase())){
                res = true;
                break;
            }
        }
        return res;
    }

    private static Map<String, String> startBsh(String path) {
        String line = null;
        Map<String, String> answer = new HashMap<String, String>();
        answer.put("status", "fail");
        answer.put("result", "reason not determined");

        if (WorkWithGremlin.checkRunRgl(path)){
            answer.replace("result", "regulations are already running");
            return answer;
        } else {
            String[] result = new String[2];
            Process proc = null;
            int counter = 0;
            String[] command = {"/bin/sh", "-c", "cd " + pathToGremlin + "; ./Client.sh 10.62.11.81 start " + path};  //для теста
            try {
                proc = Runtime.getRuntime().exec(command);
            } catch (IOException e) {
                e.printStackTrace();
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

            try {
                while ((line = reader.readLine()) != null) {
                    if (counter < 2) {
                        result[counter] = line;
                    }
                    counter++;
                }
                proc.waitFor();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (result[1].equals("ok")) {
                answer.clear();
                answer.put("status", "success");
            }
            answer.put("result", result[1]);
            return answer;
        }
    }

    private static Map<String, String> killBsh(String path) {
        String line = null;
        Map<String, String> answer = new HashMap<String, String>();
        answer.put("status", "fail");
        answer.put("result", "reason not determined");

        String[] result = new String[2];
        Process proc = null;
        int counter = 0;
        String[] command = {"/bin/sh", "-c", "cd " + pathToGremlin + "; ./Client.sh 10.62.11.81 kill " + path};
        try {
            proc = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        try {
            while ((line = reader.readLine()) != null) {
                if (counter < 2) {
                    result[counter] = line;
                }
                counter++;
            }
            proc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (result[1].equals("true")) {
            answer.clear();
            answer.put("status", "success");
        }
        answer.put("result", result[1]);

        return answer;
    }

    private static Map<String, String> listBsh() {
        String line = null;
        Map<String, String> answer = new HashMap<String, String>();
        answer.put("status", "fail");
        answer.put("result", "reason not determined");
        String[] result = new String[2];
        Process proc = null;
        int counter = 0;
        String[] command = {"/bin/sh", "-c", "cd " + pathToGremlin + "; ./Client.sh 10.62.11.81 list"};
        try {
            proc = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

        try {
            while ((line = reader.readLine()) != null) {
                if (counter < 2) {
                    result[counter] = line;
                }
                counter++;
            }
            proc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!result[1].substring(0, 5).equals("ERROR")) {
            answer.clear();
            answer.put("status", "success");
        }
        answer.put("result", result[1]);
        return answer;
    }
}
