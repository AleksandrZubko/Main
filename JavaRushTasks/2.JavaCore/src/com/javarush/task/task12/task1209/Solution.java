package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int x, int y){
        int min = x < y ? x : y;
        return min;
    }
    public static long min(long x, long y){
        long min = x < y ? x : y;
        return min;
    }
    public static double min(double x, double y){
        double min = x < y ? x : y;
        return min;
    }
}
