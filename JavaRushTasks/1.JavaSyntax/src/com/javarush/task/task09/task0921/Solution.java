package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i > 0; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                arr.add(Integer.parseInt(reader.readLine()));
            } catch (Exception e) {
                for (int j = 0; j < arr.size(); j++){
                    System.out.println(arr.get(j));
                }
                break;
            }
        }
    }
}
