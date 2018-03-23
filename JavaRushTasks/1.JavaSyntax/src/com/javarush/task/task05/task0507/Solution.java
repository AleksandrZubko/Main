package com.javarush.task.task05.task0507;

import java.io.*;
import java.util.ArrayList;
/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int counter = 0;
        int sum = 0;
        while (i == 0){
            int s = Integer.parseInt(reader.readLine());
            if (s != -1){
                counter ++;
                sum = sum + s;
            }else {
                i++;
            }
        }
        System.out.println(sum * 1.0/counter);
    }
}

