package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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

        String sa = br.readLine();       //читаем строку с клавиатуры
        int a = Integer.parseInt(sa);    //преобразовываем строку в число

        String sb = br.readLine();       //читаем строку с клавиатуры
        int b = Integer.parseInt(sb);    //преобразовываем строку в число

        if (a<b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}