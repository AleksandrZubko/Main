package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++){
            map.put("Employee_" + i, i * 100);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        //используем итератор, требует import java.util.Iterator;
        for(Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator(); it.hasNext(); ) { //.hasNext() проверяет, есть ли ещё элементы
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getValue()<500) { //проверяем условие по значению
                it.remove();    //удаление элемента
            }
        }
        /*
        map.forEach((key, value) -> { //прохоим циклом по всему HashMap
            System.out.println(key + " " + value);  //getKey() возвращает ключ, getValue() возвращает значение
        });
        */
    }

    public static void main(String[] args) {
        //HashMap<String, Integer> map = createMap();
        //removeItemFromMap(map);

    }
}