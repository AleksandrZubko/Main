package com.javarush.task.task14.task1420;
import java.io.*;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String volStr1 = "";
        String volStr2 = "";

            volStr1 = reader.readLine();
            volStr2 = reader.readLine();


        int volInt1 = 0;
        int volInt2 = 0;
        //try {
            volInt1 = Integer.parseInt(volStr1);
            volInt2 = Integer.parseInt(volStr2);
        //}catch (NumberFormatException e){
            //System.out.println(e);
        //}try {
            if (volInt1 < 0 || volInt2 < 0){
                int i = 1/0;
            }else {
                while (volInt1 != 0 && volInt2 != 0){
                    if (volInt1 > volInt2){
                        volInt1 = volInt1%volInt2;
                    }else {
                        volInt2 = volInt2%volInt1;
                    }
                }
                System.out.println(volInt1+ volInt2);
            }
        //}catch (Exception e){
        //    System.out.println(e);
        //}



    }
}
