package com.javarush.test.level04.lesson06.task05;

/* 18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще».
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
        String sb = br.readLine();       //читаем строку с клавиатуры
        int b = Integer.parseInt(sb);    //преобразовываем строку в число

        if (b<18){
            System.out.println("Подрасти еще");
        }
    }
}
