package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    String name = null;
    int age = 0;
    char sex = 0;
    Friend(String a)
    {
        this.name = a;
    }
    Friend(String b, int c)
    {
        this.name = b;
        this.age = c;
    }
    Friend(String d, int i, char f)
    {
        this.name = d;
        this.age = i;
        this.sex = f;
    }
}