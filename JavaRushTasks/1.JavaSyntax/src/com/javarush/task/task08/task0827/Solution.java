package com.javarush.task.task08.task0827;

import java.util.ArrayList;
import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
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

        for (int i = 0; i < list.size()-1; i ++){
            System.out.println(date.substring(list.get(i), list.get(i+1)));
        }



        return true;
    }
}
