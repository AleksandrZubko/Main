package com.javarush.test.level05.lesson12.home05;
import java.io.*;
/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = 0;
        for(int i=0;i<(i+1);i++)
        {
            String sm = br.readLine();       //читаем строку с клавиатуры
            if(sm.equals("сумма")){
                break;
            } else
                y = y + Integer.parseInt(sm);    //преобразовываем строку в число

        }
        System.out.println(y);
    }
}
