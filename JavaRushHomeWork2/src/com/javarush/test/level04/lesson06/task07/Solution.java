package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

        int d = 0;
        if (c==b && a!=c){
           d = 1;
        } else if (a==c && b!=a){
            d = 2;
        } else if (a==b && b!=c){
            d = 3;
        }
        System.out.println(d);
    }
}
