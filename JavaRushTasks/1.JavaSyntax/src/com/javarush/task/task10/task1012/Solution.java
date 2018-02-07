package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // напишите тут ваш код
        //заносим все строки в лист Character
        ArrayList<Character> listCh = new ArrayList<Character>();
        for (String s: list) {
            Character[] c = new Character[s.length()]; //записвается по одной строке из ввода
            for (int i = 0; i < s.length(); i ++){
                c[i] = s.charAt(i);
            }
            for (int i = 0; i < c.length; i ++){
                listCh.add(c[i]);
            }
        }


        int[] counter = new int[abc.length()];
        for (int i = 0; i < counter.length; i ++){
            counter[i] = 0;
        }

        for (int i = 0; i < listCh.size(); i ++){

            for (int j = 0; j < abc.length(); j ++) {

                if(listCh.get(i).equals(abcArray[j])){
                    counter[j] ++;
                }
            }
        }

        for (int i = 0; i < abcArray.length; i ++){
            System.out.println(abcArray[i] + " " + counter[i]);
        }

    }

}
