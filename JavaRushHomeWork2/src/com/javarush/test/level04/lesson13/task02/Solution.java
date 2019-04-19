package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sm = br.readLine();       //читаем строку с клавиатуры
        int m = Integer.parseInt(sm);    //преобразовываем строку в число
        String sn = br.readLine();       //читаем строку с клавиатуры
        int n = Integer.parseInt(sn);    //преобразовываем строку в число

        for(int i=0; i<m; i++){
            for(int y=0; y<n; y++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
