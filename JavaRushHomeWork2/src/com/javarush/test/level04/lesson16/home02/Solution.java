package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sa = br.readLine();       //читаем строку с клавиатуры
        int a = Integer.parseInt(sa);    //преобразовываем строку в число
        String sb = br.readLine();       //читаем строку с клавиатуры
        int b = Integer.parseInt(sb);    //преобразовываем строку в число
        String sc = br.readLine();       //читаем строку с клавиатуры
        int c = Integer.parseInt(sc);    //преобразовываем строку в число

        if(a<b && b<c){
            System.out.println(b);
        } else if (b<a && a<c){
            System.out.println(a);
        } else if (b<c && c<a) {
            System.out.println(c);
        } else if (c<b && b<a){
            System.out.println(b);
        } else if (c<a && a<b){
            System.out.println(a);
        } else if (a<c && c<b){
            System.out.println(c);
        }
    }
}
