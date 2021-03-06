package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.rmi.RemoteException;
import java.rmi.RemoteException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }try {
            FileReader fileReader = new FileReader("E:\\Others\\result.txt");
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new NullPointerException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new ArrayIndexOutOfBoundsException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new NumberFormatException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            ArrayList<Integer> i = new ArrayList<>();
            i.get(3);
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new RemoteException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new ArrayStoreException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new SecurityException();
        }catch (Exception e){
            exceptions.add(e);
        }try {
            throw new UnsupportedOperationException();
        }catch (Exception e){
            exceptions.add(e);
        }
    }
}
