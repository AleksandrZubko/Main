package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words); //<ключ, значение>
        for (Map.Entry<String, Integer> pair : map.entrySet()) { //entrySet() возвращает набор элементов коллекции. Все элементы представляют объект Map.Entry
            System.out.println(pair.getKey() + " " + pair.getValue());  //getKey() возвращает ключ, getValue() возвращает значение
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();



        //напишите тут ваш код
        ArrayList<String> uniqWords = new ArrayList<>();
        for (String s:list) {
            uniqWords.add(s);
        }

        for (int i = 0; i < list.size(); i ++){
            for (int j = i+1; j < uniqWords.size(); j ++){
                if(list.get(i).equals(list.get(j))){
                    uniqWords.remove(list.get(i));
                }
            }
        }
        for (String uniqWord:uniqWords) {
            result.put(uniqWord,0); //напослняет ключ, значение
        }
        for (int i = 0; i < list.size(); i ++){
            for (Map.Entry<String, Integer> p : result.entrySet()) {
                if (list.get(i).equals(p.getKey())){
                    result.replace(list.get(i), p.getValue() + 1);
                }
            }
        }

        return result;
    }

}

