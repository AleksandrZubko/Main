package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i=0; i<(i+1); i++){

            String sa = br.readLine();       //читаем строку с клавиатуры
            int a = Integer.parseInt(sa);    //преобразовываем строку в число
            sum = sum + a;
            if(a==-1)
                break;
        }
        System.out.println(sum);
    }
}
