package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //напишите тут ваш код
        int array [] = new int[5];
        for (int i=0; i<array.length; i++){
            array[i] = sc.nextInt();
        }

        //Сортировка пузырьковым методом
        for(int i = 0; i < array.length; i++) {
            for(int j = array.length - 1; j > i; j--) {
                if(array[j] < array[j - 1]) {
                    int tmp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tmp;
                }
            }
        }
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
