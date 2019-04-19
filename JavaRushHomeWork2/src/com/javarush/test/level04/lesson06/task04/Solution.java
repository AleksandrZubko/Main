package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream is = System.in;
        Reader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String a = br.readLine();       //читаем строку с клавиатуры
        String b = br.readLine();       //читаем строку с клавиатуры

        if (a.equals(b))    //a.equals(b) - сравнение двух объектов
            System.out.println("Имена идентичны");
        else if (a.length() == b.length())
                System.out.println("Длины имен равны");
        }
    }


