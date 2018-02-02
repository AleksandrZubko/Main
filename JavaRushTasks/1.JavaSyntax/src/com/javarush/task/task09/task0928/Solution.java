package com.javarush.task.task09.task0928;

import java.io.*;

/* 
Код не компилится…
*/

//чтение даных с одно файла и запись в другой
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();      //считываем с ввода путь к файлу для чтения
        String destinationFileName = reader.readLine(); //считываем с ввода путь к файлу для записи

        InputStream fileInputStream = getInputStream(sourceFileName);           //Вызываем метод, создающий объект FileOutputStream, в качестве параметра указываем путь к файлу
        OutputStream fileOutputStream = getOutputStream(destinationFileName); //Вызываем метод, создающий объект FileOutputStream, в качестве параметра указываем путь к файлу

        //измерение количества байт в фале
        int count = 0;
        while (fileInputStream.available() > 0) //available - определяет кол-во байт в файле (из класса FileInputStream)
        {
            int data = fileInputStream.read();  //read() чтение байтов файла и передаём результат в переменную data
            if (data == -1){
                break;
            }

            fileOutputStream.write(data);       //write() запись файла
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close(); //закрывает источник ввода. Следующие попытки чтения передадут исключение IOException
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
