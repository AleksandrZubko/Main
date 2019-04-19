package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Горбачев","Алексей");
        map.put("Чудинов","Константин");
        map.put("Санников","Евгений");
        map.put("Рыбцов","Сергей");
        map.put("Рогачев","Василий");
        map.put("Рычковский","Денис");
        map.put("Скосырских","Александра");
        map.put("Чудинов","Елизавета");
        map.put("Ерепанов","Денис");
        map.put("Табулды","Константин");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
