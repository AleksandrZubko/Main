package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/
import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countLines = 0;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(reader.readLine()); //читаем с консоли путь к файлу  E:\Others\result.txt
            bufferedReader = new BufferedReader(fileReader); //запихнули в BufferedReader наш файл
            String str;
            ArrayList<String> arrList = new ArrayList<>();
            while ((str = bufferedReader.readLine())!=null){ //проходим по файлу построчно
                countLines ++; //считаем количество строк
                arrList.add(str);
            }
            int[] arr = new int[countLines];

            for (int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(arrList.get(i));  //конвертируем в int и записываем в массив
            }
            for (int j:arr
                 ) {
                System.out.println(j);
            }

            reader.close();
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Не удалось считать файл");
        }

    }
}
