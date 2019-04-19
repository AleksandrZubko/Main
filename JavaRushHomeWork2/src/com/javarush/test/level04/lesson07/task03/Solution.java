package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sa = br.readLine();       //читаем строку с клавиатуры
        int a = Integer.parseInt(sa);    //преобразовываем строку в число

        String sb = br.readLine();       //читаем строку с клавиатуры
        int b = Integer.parseInt(sb);    //преобразовываем строку в число

        String sc = br.readLine();       //читаем строку с клавиатуры
        int c = Integer.parseInt(sc);    //преобразовываем строку в число

        int d = 0;

        if ((a>0 && b<0 && c<0) || (a<0 && b>0 && c<0) || (a<0 && b<0 && c>0)){
            d = 1;
        } else if ((a>0 && b>0 && c<0) || (a<0 && b>0 && c>0) || (a>0 && b<0 && c>0)){
            d = 2;
        } else if (a>0 && b>0 && c>0){
            d = 3;
        }
        System.out.println(d);
    }
}
