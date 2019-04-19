package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int i = Integer.parseInt(reader.readLine());
        int minimum = min(a, b, c, d, i);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int i)
    {
        int m = 0;
        if(a<b && a<c && a<d && a<i)
            m = a;
        else if (b<a && b<c && b<d && b<i)
            m = b;
        else if (c<a && c<b && c<d && c<i)
            m = c;
        else if (d<a && d<b && d<c && d<i)
            m = d;
        else m = i;
        return m;
        //return a < b ? a : b; // if(a < b) return a else return b
    }

}
