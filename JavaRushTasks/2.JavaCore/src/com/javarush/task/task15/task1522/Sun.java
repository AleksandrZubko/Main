package com.javarush.task.task15.task1522;

//Пример реализация паттерна Singleton с ленивой реализацией(lazy initialization)
public class Sun implements Planet{
    private static Sun instance;
    private Sun(){ //для отсутствия возможности создавать экземпляры класса из вне класса

    }

    public static Sun getInstance(){
        if (instance == null){
            instance = new Sun();
        }
        return instance;
    }
}
