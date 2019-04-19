package com.javarush.task.task14.task1421;

public final class Singleton {
    private static Singleton instance = new Singleton();
    private int i;
    public static Singleton getInstance(){
        return instance;
    }
    private Singleton(){
        this.i = 1;
    }
}
