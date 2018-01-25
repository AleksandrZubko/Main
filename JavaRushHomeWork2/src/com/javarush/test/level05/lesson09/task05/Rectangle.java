package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    int left = 0;
    int top = 0;
    int width = 0;
    int height = 0;
    Rectangle(int a, int b, int c, int d)
    {
        this.left = a;
        this.top = b;
        this.width = c;
        this.height = d;
    }
    Rectangle(int a, int b)
    {
        this.left = a;
        this.top = b;
    }
    Rectangle(int a, int b, int c)
    {
        this.width = a;
        this.top = b;
        this.height = a;
        this.left = c;
    }
    Rectangle(Rectangle my)
    {
        this.left = my.left;
        this.height = my.height;
        this.top = my.top;
        this.width = my.width;
    }
}
