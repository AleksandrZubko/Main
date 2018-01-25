package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    String name = null;
    int growth = 40;
    String color = "BEC8CC";
    Dog(String name)
    {
        this.name = name;
    }
    Dog(String name, int growth)
    {
        this.name = name;
        this.growth = growth;
    }
    Dog(String name, int growth, String color)
    {
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
}
