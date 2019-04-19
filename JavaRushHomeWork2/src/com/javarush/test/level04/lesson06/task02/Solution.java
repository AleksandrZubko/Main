package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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

        String sc = br.readLine();       //читаем строку с клавиатуры
        int c = Integer.parseInt(sc);    //преобразовываем строку в число

        String sd = br.readLine();       //читаем строку с клавиатуры
        int d = Integer.parseInt(sd);    //преобразовываем строку в число

        int i = 0;

        if (a>b && a>c && a>d){
            i = a;
        } else if (b>a && b>c && b>d){
            i = b;
        } else if (c>a && c>b && c>d){
            i = c;
        } else if (d>a && d>b && d>c){
            i = d;
        }
        System.out.println(i);
    }
}
