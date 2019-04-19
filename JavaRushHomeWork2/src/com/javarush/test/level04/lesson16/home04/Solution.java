package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String sy = br.readLine();       //читаем строку с клавиатуры
        int y = Integer.parseInt(sy);    //преобразовываем строку в число
        String sm = br.readLine();       //читаем строку с клавиатуры
        int m = Integer.parseInt(sm);    //преобразовываем строку в число
        String sd = br.readLine();       //читаем строку с клавиатуры
        int d = Integer.parseInt(sd);    //преобразовываем строку в число
        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
