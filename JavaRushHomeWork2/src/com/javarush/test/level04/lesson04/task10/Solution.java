package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
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

        if (c==a && c==b){
            System.out.println(a + " " + b + " " + c);
        } else if (a==b && b!=c){
            System.out.println(a + " " + b);
        } else if (b==c && c!=a){
            System.out.println(b + " " + c);
        } else if (a==c && c!=b){
            System.out.println(a + " " + c);
        }
    }
}