package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("q", "q");
        map.put("a", "q");
        map.put("s", "a");
        map.put("z", "z");
        map.put("w", "z");
        map.put("m", "x");
        map.put("x", "c");
        map.put("c", "v");
        map.put("d", "w");
        map.put("e", "w");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        for (HashMap.Entry<String, String> pair : map2.entrySet())
        {
            map3.remove(pair.getKey());

            if (map3.containsValue(pair.getValue()))
            {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
