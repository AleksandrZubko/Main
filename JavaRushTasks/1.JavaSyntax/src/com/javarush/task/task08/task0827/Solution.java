package com.javarush.task.task08.task0827;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        //System.out.println(isDateOdd("MAY 1 2013"));
        System.out.println(isDateOdd("JANUARY 1 2020"));
    }

    public static boolean isDateOdd(String date) {

        String month;
        int dt;
        int year;

        ArrayList<Integer> list = new ArrayList<>();

        int index = 0;
        int tmp;
        list.add(index);

        for (int i = 0; i < date.length(); i++){
            tmp = date.indexOf(" ", index);
            if (tmp > 0){
                index = tmp + 1;
                list.add(index);
            }else {
                break;
            }
        }

        String[] strings = new String[3];
        for (int i = 0; i < list.size(); i ++){
            try {
                strings[i] = date.substring(list.get(i), list.get(i+1));
            }catch (Exception e){
                strings[i] = date.substring(list.get(i));
            }
        }
        int[] num = new int[3];
        num[0] = Integer.parseInt(strings[2].trim());
        switch (strings[0].trim()){
            case "JANUARY":
                num[1] = 0;
                break;
            case "FEBRUARY":
                num[1] = 1;
                break;
            case "MARCH":
                num[1] = 2;
                break;
            case "APRIL":
                num[1] = 3;
                break;
            case "MAY":
                num[1] = 4;
                break;
            case "JUNE":
                num[1] = 5;
                break;
            case "JILY":
                num[1] = 6;
                break;
            case "AUGUST":
                num[1] = 7;
                break;
            case "SEPTEMBER":
                num[1] = 8;
                break;
            case "OCTOBER":
                num[1] = 9;
                break;
            case "NOVEMBER":
                num[1] = 10;
                break;
            case "DECEMBER":
                num[1] = 11;
                break;
        }
        num[2] = Integer.parseInt(strings[1].trim());

        GregorianCalendar c = new GregorianCalendar(num[0],num[1],num[2]);
        GregorianCalendar c1 = new GregorianCalendar(num[0],0,1);

        // Находим разницу между двумя календарями в мили секундах
        long diff = c.getTimeInMillis() - c1.getTimeInMillis();
        // в секундах
        long seconds = diff / 1000;
        // в минутах
        long minutes = seconds / 60;
        // в часах
        long hours = minutes / 60;
        // в днях
        long days = hours / 24;

        if ((days+1)%2>0){
            return true;
        }else {
            return false;
        }
    }
}
