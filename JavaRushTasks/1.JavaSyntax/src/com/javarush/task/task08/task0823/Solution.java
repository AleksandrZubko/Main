package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String newS = "";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        int index = 0;
        int tmp = 0;

        while (tmp > -1){
            tmp = s.indexOf(" ", index);

            if (tmp >= 0){
                index = tmp+1;
                list.add(index);
            }
        }

        ArrayList<String> listStr = new ArrayList<>();
        for (int i = 0; i < list.size(); i ++) {
            try {
                listStr.add(s.substring(list.get(i), list.get(i+1)));
            }catch (Exception e){
                listStr.add(s.substring(list.get(i)));
            }

        }
        for (String f:listStr) {
            newS = newS + f.substring(0, 1).toUpperCase() + f.substring(1);
        }
        System.out.println(newS);
    }
}
