package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();      //считываем с ввода путь к файлу для чтения
        InputStream inStream = new FileInputStream(sourceFileName);
        while (inStream.available() > 0) { //available - определяет кол-во байт в файле (из класса FileInputStream)
            char body = (char)inStream.read(); // считываем содержимое файла
            System.out.print(body); //выводим содержимое файла на экран
        }
        inStream.close(); //закрываем потоки FileInputStream
        reader.close(); //закрываем потоки BufferedReader
        
    }
}