package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн тут
        int[] arr = new int[1];
        B = arr[3];
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
