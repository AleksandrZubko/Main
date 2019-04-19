package com.javarush.test.level03.lesson06.task03;

/* Семь цветов радуги
Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
Каждый объект при создании выводит на экран определенный цвет.
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Red color1 = new Red();
        Orange color2 = new Orange();
        Yellow color3 = new Yellow();
        Green color4 = new Green();
        Blue color5 = new Blue();
        Indigo color6 = new Indigo();
        Violet color7 = new Violet();


    }

    public static class Red
    {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange
    {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow
    {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green
    {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue
    {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo
    {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet
    {
        public Violet() {
            System.out.println("Violet");
        }
    }
}