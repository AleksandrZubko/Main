package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
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
    public void initialize (String name)
    {
        this.name = name;
    }
    public void initialize (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void initialize (String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
