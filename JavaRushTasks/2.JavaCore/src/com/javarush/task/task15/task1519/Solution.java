package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String writer;
        int writerToInt = 0;
        while (true){
            writer = reader.readLine();
            if (writer.equals("exit")) {
                reader.close();
                break;
            }else {
                try {
                    writerToInt = Integer.parseInt(writer);
                    if (writerToInt > 0 && writerToInt < 128){
                        print((short)writerToInt);
                    }else if (writerToInt <= 0 || writerToInt >= 128){
                        print(writerToInt);
                    }
                }catch (NumberFormatException e){
                    if (writer.contains(".")) {
                        try {
                            double writerToDouble = Double.parseDouble(writer);
                            print(writerToDouble);
                        } catch (NumberFormatException r) {
                            print(writer);
                        }
                    }else {
                        print(writer);
                    }
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
