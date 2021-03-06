package com.javarush.task.task09.task0915;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Перехват выборочных исключений
*/

public class Solution {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        try {
            processExceptions();
        }catch (Exception e){ //обработали проброшенное исключение
            BEAN.log(e);
        }
    }

    public static void processExceptions() throws FileSystemException { //указываем при каких исключениях метод может работать без catch
        try {
            BEAN.methodThrowExceptions();
        }catch (FileSystemException e){ //ловим исключение
            BEAN.log(e); //указываем что делать, если поймали его
            throw e; //пробрасываем его дальше, и при вызове текущего метода его можно обработать
        }catch (CharConversionException e){
            BEAN.log(e);
        }catch (IOException e){
            BEAN.log(e);
        }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0)
                throw new CharConversionException();
            if (i == 1)
                throw new FileSystemException("");
            if (i == 2)
                throw new IOException();
        }
    }
}
