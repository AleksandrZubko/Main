package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args){
        //reset();

    }
    
    static {
        //add your code here - добавьте код тут
        reset();

    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tmp = null;
        try {
            tmp = reader.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        if (tmp.equals("helicopter")){
            result = new Helicopter();
        }else if (tmp.equals("plane")){
            int count = 0;
            try {
                count = Integer.parseInt(reader.readLine());
            }catch (Exception e){
                e.printStackTrace();
            }
            result = new Plane(count);
        }

    }
}
