package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        ArrayList<String> months = new ArrayList<>();
        months.add("JANUARY");
        months.add("FEBRUARY");
        months.add("MARCH");
        months.add("APRIL");
        months.add("MAY");
        months.add("JUNE");
        months.add("JILY");
        months.add("AUGUST");
        months.add("SEPTEMBER");
        months.add("OCTOBER");
        months.add("NOVEMBER");
        months.add("DECEMBER");

        int num = 0;
        switch (month.trim().toUpperCase()){
            case "JANUARY":
                num = 1;
                break;
            case "FEBRUARY":
                num = 2;
                break;
            case "MARCH":
                num = 3;
                break;
            case "APRIL":
                num = 4;
                break;
            case "MAY":
                num = 5;
                break;
            case "JUNE":
                num = 6;
                break;
            case "JILY":
                num = 7;
                break;
            case "AUGUST":
                num = 8;
                break;
            case "SEPTEMBER":
                num = 9;
                break;
            case "OCTOBER":
                num = 10;
                break;
            case "NOVEMBER":
                num = 11;
                break;
            case "DECEMBER":
                num = 12;
                break;
        }
        System.out.println(month + " is " + num + " month");
    }
}
