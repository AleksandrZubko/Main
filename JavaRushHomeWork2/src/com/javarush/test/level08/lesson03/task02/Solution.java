package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ,
ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель - клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Map<String, String> tmp = new HashMap<String, String>();
        tmp.put("арбуз", "ягода");
        tmp.put("банан", "трава");
        tmp.put("вишня", "ягода");
        tmp.put("груша", "фрукт");
        tmp.put("дыня", "овощ");
        tmp.put("ежевика", "куст");
        tmp.put("жень-шень", "корень");
        tmp.put("земляника", "ягода");
        tmp.put("ирис", "цветок");
        tmp.put("картофель", "клубень");

        for (Map.Entry<String, String> tmp1 : tmp.entrySet())
        {
            String key = tmp1.getKey();
            String value = tmp1.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
