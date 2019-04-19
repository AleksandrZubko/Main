package com.javarush.test.level04.lesson04.task08;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sa = bufferedReader.readLine();   //читаем строку с клавиатуры
        int a = Integer.parseInt(sa);        //преобразовываем строку в число

        String sb = bufferedReader.readLine();   //читаем строку с клавиатуры
        int b = Integer.parseInt(sb);        //преобразовываем строку в число

        String sc = bufferedReader.readLine();   //читаем строку с клавиатуры
        int c = Integer.parseInt(sc);        //преобразовываем строку в число

        int d = a + b;
        int i = b + c;
        int f = c + a;
        if (d>c && i>a && f>b){
            System.out.println("Треугольник существует.");
        } else
            System.out.println("Треугольник не существует.");

    }
}