package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String s  = "" + number;
        char[] arr = s.toCharArray();
        int res = 0;
        for (int i = 0; i < 3; i ++) {
            res = res + Integer.parseInt(s.substring(i, i+1));
        }
        return res;
    }
}