package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man Vasya = new Man("Vasya", 30, "Dnepr");
        Man Roma = new Man("Roma", 31, "Kharkov");
        Woman Lida = new Woman("Lida", 28, "Dnepr");
        Woman Katya = new Woman("Katya", 27, "Pavlograd");
        //выведи их на экран тут
        System.out.println(Vasya.name + " " + Vasya.age + " " + Vasya.address );
        System.out.println(Roma.name + " " + Roma.age + " " + Roma.address );
        System.out.println(Lida.name + " " + Lida.age + " " + Lida.address);
        System.out.println(Katya.name + " " + Katya.age + " " + Katya.address);
    }

    //добавьте тут ваши классы
    public static class Man
    {
        String name;
        int age;
        String address;
        Man(String a, int b, String c)
        {
            this.name = a;
            this.age = b;
            this.address = c;
        }

    }
    public  static  class Woman
    {
        String name;
        int age;
        String address;
        Woman(String a, int b, String c)
        {
            this.name = a;
            this.age = b;
            this.address = c;
        }
    }
}
