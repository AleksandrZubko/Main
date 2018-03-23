package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int indexMin = 0;
        int indexBig = 0;
        int[] size = new int[10];
        for (int i = 0; i < 10; i ++){
            arr.add(reader.readLine());
            size[i] = arr.get(i).length();
        }
        int[] copy = new int[size.length];
        for(int i = 0; i < size.length; i++){
            copy[i] = size[i];
        }


        //сортируем массив с длинной строк, чтоб определить минимальную и максимальную длинну
        for (int i = 0; i < size.length; i++) {
            int min = size[i];
            int min_i = i;

            for (int j = i+1; j < size.length; j++) {
                //Если находим, запоминаем его индекс
                if (size[j] < min) {
                    min = size[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = size[i];
                size[i] = size[min_i];
                size[min_i] = tmp;
            }
        }



        for (int i = 0; i < copy.length; i++){
            if (copy[i]==size[0]){
                indexMin = i;
                break;
            }
        }
        for (int i = 0; i < copy.length; i++){
            if (copy[i]==size[9]){
                indexBig = i;
                break;
            }
        }



        if (indexMin<indexBig){
            System.out.println(arr.get(indexMin));
        }else {
            System.out.println(arr.get(indexBig));
        }

    }
}
