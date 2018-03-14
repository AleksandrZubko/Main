package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        int i = 0;
        while (i == 0){
            key = reader.readLine();
            //создаем объект, пункт 2
            switch (key){
                case "user":
                    person = new Person.User();
                    doWork(person); //вызываем doWork
                    break;
                case "loser":
                    person = new Person.Loser();
                    doWork(person); //вызываем doWork
                    break;
                case "coder":
                    person = new Person.Coder();
                    doWork(person); //вызываем doWork
                    break;
                case "proger":
                    person = new Person.Proger();
                    doWork(person); //вызываем doWork
                    break;
                default:
                    i++;
                    break;
            }
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();  //расширение типа к User
        }else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
