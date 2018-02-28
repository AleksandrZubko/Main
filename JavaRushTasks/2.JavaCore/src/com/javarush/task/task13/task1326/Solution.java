package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        // напишите тут ваш код
        /*рабочая реализация, но без FileInputStream
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

            int count2 = 0; //количество кратных 2 чесел в массиве (в файле)
            for (int j:arr) {
                if (j%2==0){
                    count2++;
                }
            }
            int[] newArr = new int[count2];
            int index = 0;
            for (int j:arr) {
                if (j%2==0){
                    newArr[index] = j;
                    index++;
                }
            }
            Arrays.sort(newArr); //сортировка массива

            for (int j:newArr) {
                System.out.println(j);
            }

            reader.close();
            bufferedReader.close();
        }catch (IOException e) {
            System.out.println("Не удалось считать файл");
        }
*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countLines = 0;
        try (InputStream fin = new FileInputStream(reader.readLine())){  // E:\Others\result.txt
            Scanner s = new Scanner(fin);

            ArrayList<Integer> list = new ArrayList<>();
            int x;
            int t;
            while(s.hasNextInt()){ //проверка есть ли элемент в объекте Scanner
                t = s.nextInt(); //возвращает тип int элемента
                if (t%2 == 0)
                list.add(t);

            }
            for (int i = 0; i < list.size(); i++) //сортировка списка
            {
                for (int j = i; j < list.size(); j++)
                {
                    if (list.get(i) > list.get(j))
                    {
                        x = list.get(j);
                        list.set(j, list.get(i));
                        list.set(i, x);
                    }
                }
            }
            for (int c:list) {
                System.out.println(c);
            }
            reader.close();
            fin.close();
        }catch (IOException e){
            System.out.println("Не удалось считать файл");
        }
    }
}
