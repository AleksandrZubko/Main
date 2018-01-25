package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    int centerX = 0;
    int centerY = 0;
    int radius = 0;
    int width = 0;
    String color = "BEC8CC";
    Circle(int a, int b, int c)
    {
        this.centerX = a;
        this.centerY = b;
        this.radius = c;
    }
    Circle(int a, int b, int c, int d)
    {
        this.centerX = a;
        this.centerY = b;
        this.radius = c;
        this.width = d;
    }
    Circle(int a, int b, int c, int d, String i)
    {
        this.centerX = a;
        this.centerY = b;
        this.radius = c;
        this.width = d;
        this.color = i;
    }
}
