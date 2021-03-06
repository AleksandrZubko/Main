package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<String>();
        //заполняем список
        for (int i = 0; i < 5; i++){
            array.add(r.readLine());
        }
        int min = array.get(0).length();
        //определяем максимальное число символов в элементах списка
        for (int i = 0; i < 4; i++)
            if (min > array.get(i + 1).length())
                min = array.get(i + 1).length();
        //System.out.println(max);
        //определяем элементы списка, в которых максимальное количество символов, и выводим на экран
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() == min){
                System.out.println(array.get(i));
            }
        }
    }
}
