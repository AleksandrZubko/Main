package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int a;
        int b = 1;
        for(a = 1; a < 11; a ++){
            b = b * a;
        }
        System.out.println(b);
    }
}