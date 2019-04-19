package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу
«Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("zz","i");
        map.put("uu","u");
        map.put("pp","e");
        map.put("i","ii");
        map.put("s","ss");
        map.put("qq","q");
        map.put("z","zz");
        map.put("ee","t");
        map.put("j","hh");
        map.put("w","qq");

        return (HashMap) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> tmp : map.entrySet())
        {
            String value = tmp.getValue();
            if (value.equals(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> tmp : map.entrySet())

            {
                String key = tmp.getKey();
                if (key.equals(lastName)){
                    count++;
                }
        }
        return count;
    }

}
