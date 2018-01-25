package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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

        if (a>b && b>c){
            System.out.println(a+" "+b+" "+c);;
        } else if (b>a && a>c){
            System.out.println(b+" "+a+" "+c);;
        } else if (c>a && a>b){
            System.out.println(c+" "+a+" "+b);
        } else if (c>a && c>b && b>a){
            System.out.println(c+" "+b+" "+a);
        } else if (a>b && a>c && c>b){
            System.out.println(a+" "+c+" "+b);
        } else if (b>c && b>a && c>a){
            System.out.println(b+" "+c+" "+a);
        }
    }
}
