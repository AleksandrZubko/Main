package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int maxSequence = 1;
        int tmp = 1;

        for (int i = 0; i < 10; i ++){
            arr.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < arr.size()-1; i ++){
            if (arr.get(i) == arr.get(i+1)){
                tmp ++;
                if (maxSequence<tmp){
                    maxSequence = tmp;
                }
            }else {
                tmp = 1;
            }
        }
        System.out.println(maxSequence);
    }
}