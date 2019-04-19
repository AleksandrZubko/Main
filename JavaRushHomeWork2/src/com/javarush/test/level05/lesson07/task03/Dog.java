package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
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
    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int growth)
    {
        this.name = name;
        this.growth = growth;
    }
    public void initialize(String name, int growth, String color)
    {
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
}
