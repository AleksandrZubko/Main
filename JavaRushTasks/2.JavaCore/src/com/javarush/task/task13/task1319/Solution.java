package com.javarush.task.task13.task1319;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        File file = new File(reader.readLine()); //читаем с консоли путь к файлу

        FileWriter fw = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fw);

        int i = 1;
        while (i > 0){
            String body = reader.readLine(); //считываем строки, которые нужно записать
            writer.write(body); //записываем в файл
            writer.newLine();  //перенос строки в файле
            if (body.equals( "exit")){  //выход из цикла
                i = -1;
            }
        }
        writer.close();
        reader.close();
    }
}
