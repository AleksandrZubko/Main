package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Locale.setDefault(Locale.US);  //установка локализации
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dt = reader.readLine();

        int month = Integer.parseInt(dt.substring(0,2))-1;
        int day = Integer.parseInt(dt.substring(3,5));
        int year = Integer.parseInt(dt.substring(6,10))-1900;

        Date date = new Date(year,month,day); //месяц берёт на 1 больше чем передаётся в параметре, год нужно передать как (нужный год - 1900)
        SimpleDateFormat dateNew = new SimpleDateFormat("MMM d, yyyy");  //позволяет форматировать дату
        String dts = dateNew.format(date).toUpperCase(); //передаём format объект даты Date
        System.out.println(dts);
    }
}
