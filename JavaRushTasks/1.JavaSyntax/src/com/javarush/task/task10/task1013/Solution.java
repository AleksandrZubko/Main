package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private int age;
        private static int count = 0;
        private String name;
        private double weight;
        private double height;
        private char sex;
        public Human(){
            this.age = 30;
            count ++;
            this.name = "Vasiliy";
            this.weight = 70.5;
            this.height = 182;
            this.sex = 'M';
        }
        public Human(int age){
            this.age = age;
            count ++;
            this.name = "Vasiliy";
            this.weight = 70.5;
            this.height = 182;
            this.sex = 'M';
        }
        public Human(int age, String name){
            this.age = age;
            count ++;
            this.name = name;
            this.weight = 70.5;
            this.height = 182;
            this.sex = 'M';
        }
        public Human(int age, String name, double weight){
            this.age = age;
            count ++;
            this.name = name;
            this.weight = weight;
            this.height = 182;
            this.sex = 'M';
        }
        public Human(int age, String name, double weight, double height){
            this.age = age;
            count ++;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.sex = 'M';
        }
        public Human(int age, String name, double weight, double height, char sex){
            this.age = age;
            count ++;
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.sex = sex;
        }
        public Human(String name){
            this.age = 30;
            count ++;
            this.name = name;
            this.weight = 70.5;
            this.height = 182;
            this.sex = 'M';
        }
        public Human(double weight, double height){
            this.age = 30;
            count ++;
            this.name = "Vasiliy";
            this.weight = weight;
            this.height = height;
            this.sex = 'M';
        }
        public Human(double height){
            this.age = 30;
            count ++;
            this.name = "Vasiliy";
            this.weight = 70.5;
            this.height = height;
            this.sex = 'M';
        }
        public Human(char sex){
            this.age = 30;
            count ++;
            this.name = "Vasiliy";
            this.weight = 70.5;
            this.height = 182;
            this.sex = sex;
        }
    }
}
