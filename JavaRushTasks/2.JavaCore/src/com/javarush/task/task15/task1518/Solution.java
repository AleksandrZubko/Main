package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;
    static {
        cat = new Cat();
        cat.name = "Boris";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
    public static class Cat{
        public String name;
    }
}
