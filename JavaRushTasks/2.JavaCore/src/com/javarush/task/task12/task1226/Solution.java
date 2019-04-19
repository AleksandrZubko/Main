package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    interface Fly{
        void fly();
    }

    interface Climb{
        void climb();
    }

    interface Run{
        void run();
    }

    public class Cat implements Run, Climb{
        public void climb(){

        }
        public void run(){

        }
    }

    public class Dog implements Run{
        public void run(){

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Run, Fly{
        public void fly(){

        }
        public void run(){

        }
    }
}
