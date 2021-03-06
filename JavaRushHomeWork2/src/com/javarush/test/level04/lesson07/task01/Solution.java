package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание
следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
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

        if (a==0){
            System.out.println("нулевое число");
        } else if (a<0){
            if (a%2==0){
                System.out.println("отрицательное четное число");
            } else
                System.out.println("отрицательное нечетное число");
        } else if (a>0){
            if (a%2==0){
                System.out.println("положительное четное число");
            } else
                System.out.println("положительное нечетное число");
        }
    }
}
