package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] ar = new ArrayList[2];
        for (int i = 0; i < ar.length; i ++){
            ArrayList<String> a = new ArrayList<>();
            for (int j = 0; j < 2; j ++){
                a.add("test");
            }
            ar[i] = a;
        }
        return ar;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}