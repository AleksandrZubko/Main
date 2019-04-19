package com.javarush.task.task08.task0824;

import java.io.*;
import java.util.*;
/* 
Собираем семейство
*/
//два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Boris", true, 18);
        Human son2 = new Human("Moris", true, 17);
        Human daughter = new Human("Dasha", false, 15);

        ArrayList<Human> children3 = new ArrayList<>();
        children3.add(son1);
        children3.add(son2);
        children3.add(daughter);
        Human dad = new Human("Pasha", true, 50, children3);
        Human mum = new Human("Dasha", false, 50, children3);

        ArrayList<Human> children1 = new ArrayList<>();
        children1.add(dad);
        Human grenpa1 = new Human("Sasha1", true, 100, children1);
        Human grenma1 = new Human("Masha1", false, 99, children1);

        ArrayList<Human> children2 = new ArrayList<>();
        children2.add(mum);
        Human grenpa2 = new Human("Sasha2", true, 100, children2);
        Human grenma2 = new Human("Masha2", false, 99, children2);

        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
        System.out.println(dad.toString());
        System.out.println(mum.toString());
        System.out.println(grenma1.toString());
        System.out.println(grenpa1.toString());
        System.out.println(grenma2.toString());
        System.out.println(grenpa2.toString());


    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        ArrayList<Human> children = new ArrayList<>();
        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this(name, sex, age);
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;


            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
