package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.*;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try
        {
            //Statics.FILE_NAME = "/home/alex/forTest/1" - путь к файлу
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));  //считываем данные с файла
            String line = null;
            while ((line = reader.readLine())!= null) { //построчно считываем данные с файла, если закончится вернёт null
                lines.add(line);    //запись данных в лист
            }
            reader.close(); //закрываем BufferedReader
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException{

        System.out.println(lines);
    }
}
