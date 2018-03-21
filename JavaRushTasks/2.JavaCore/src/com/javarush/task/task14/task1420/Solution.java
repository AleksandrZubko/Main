package com.javarush.task.task14.task1420;
import java.io.*;
/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


            int volInt1 = Integer.parseInt(reader.readLine());
            int volInt2 = Integer.parseInt(reader.readLine());
            if (volInt1 <= 0 || volInt2 <= 0) throw new Exception();

                while (volInt1 != 0 && volInt2 != 0){
                    if (volInt1 > volInt2){
                        volInt1 = volInt1%volInt2;
                    }else {
                        volInt2 = volInt2%volInt1;
                    }
                }
                System.out.println(volInt1+ volInt2);

    }
}
