package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arId = new ArrayList<>();
        ArrayList<String> arName = new ArrayList<>();

        int i = 1;
        while (i > 0) {
            i++;
            try {

                arId.add(Integer.parseInt(reader.readLine()));
                arName.add(reader.readLine());
            }catch(Exception e) {
                break;
            }
        }

        HashMap<String,Integer> map = new HashMap<>();
        for (int j = 0; j < arId.size() ; j ++){
            map.put(arName.get(j), arId.get(j));
        }
        for (Map.Entry<String, Integer> tmp:map.entrySet()) {
            System.out.println(tmp.getValue() + " " + tmp.getKey());
        }
    }
}

