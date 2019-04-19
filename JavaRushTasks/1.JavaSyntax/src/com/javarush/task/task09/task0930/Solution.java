package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<Integer> n = new ArrayList<>();
        ArrayList<String> s = new ArrayList<>();
        String[] ident = new String[array.length]; //для сохранения очерёдности строки и числа

        for (int i = 0; i < array.length; i ++){
            if (isNumber(array[i])){
                n.add(Integer.parseInt(array[i]));
                ident[i] = "n";
            }else {
                s.add(array[i]);
                ident[i] = "s";
            }
        }

        for (int i = 0; i < n.size(); i ++){
            for (int j = 0; j < n.size()-1; j ++){
                if (n.get(j)<n.get(j+1)){
                    int tmp = n.get(j);
                    n.set(j, n.get(j+1));
                    n.set(j+1, tmp);
                }
            }
        }

        for (int j = 0; j < s.size(); j ++) {
            for (int i = 0; i < s.size()-1; i++) {
                if (isGreaterThan(s.get(i), s.get(i + 1))) {
                    String tmp = s.get(i + 1);
                    s.set(i + 1, s.get(i));
                    s.set(i, tmp);
                }
            }
        }

        String[] res = new String[ident.length];
        int nInd = 0;
        int sInd = 0;

        for (int i = 0; i < ident.length ; i ++){
            if (ident[i].equals("n")){
                res[i] =  n.get(nInd).toString();
                nInd ++;
            }else {
                res[i] =  s.get(sInd);
                sInd ++;
            }
            System.out.println(res[i]);
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0; //
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
