package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        //Arrays.sort(array);
        String first = null;
        int indexFirst = 0;
        for (int i = 0; i < array.length-1; i ++){
            first = array[i];
            indexFirst = i;
            for (int j = i+1; j < array.length; j ++){
                if (isGreaterThan(first, array[j])){
                    first = array[j];
                    indexFirst = j;
                }
            }
            if (i != indexFirst){
                String tmp = array[i];
                array[i] = array[indexFirst];
                array[indexFirst] = tmp;
            }
        }
    }


    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
