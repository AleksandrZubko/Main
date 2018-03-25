package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        //map.put("Surname", "FirstName0");
        for (int i = 0; i < 10; i++){
            map.put("Surname" + i, "FirstName" + i);
        }
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код

        ArrayList<String> dubl = new ArrayList<>();
        String[] values = new String[map.size()];
        int t = 0;
        for (String s:map.values()) {

            values[t] = s;
            t++;
        }


        for (int i = 0; i < values.length; i ++){
            for (int j = i + 1; j < values.length; j ++){
                if (values[i].equals(values[j])){
                    dubl.add(values[i]);
                    break;
                }
            }
        }

        for (String value: dubl) {
            removeItemFromMapByValue(map, value);
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {

        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
/*
        HashMap<String, String> map;
        map = createMap();

        removeTheFirstNameDuplicates(map);


        System.out.println(map);
*/
    }
}
