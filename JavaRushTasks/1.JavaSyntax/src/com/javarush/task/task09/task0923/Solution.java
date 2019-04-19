package com.javarush.task.task09.task0923;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String words = reader.readLine();
        ArrayList<String> gl = new ArrayList<>();
        ArrayList<String> sogl = new ArrayList<>();
        for (char b : words.toCharArray()) {
            if (b != ' ') {
            boolean check = isVowel(b);
            if (check){
                gl.add(b + " ");
            }else {
                sogl.add(b + " ");
            }
            }
        }
        for (int i = 0; i < gl.size(); i ++){
            System.out.print(gl.get(i));
        }
        System.out.println();
        for (int i = 0; i < sogl.size(); i ++){
            System.out.print(sogl.get(i));
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}