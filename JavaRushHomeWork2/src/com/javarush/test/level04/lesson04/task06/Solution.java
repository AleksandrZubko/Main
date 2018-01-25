package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sday = bufferedReader.readLine();   //читаем строку с клавиатуры
        int iday = Integer.parseInt(sday);        //преобразовываем строку в число

        if (iday==1){
            System.out.println("понедельник");
        } else if (iday==2){
            System.out.println("вторник");
        } else if (iday==3){
            System.out.println("среда");
        } else if (iday==4){
            System.out.println("четверг");
        } else if (iday==5){
            System.out.println("пятница");
        } else if (iday==6){
            System.out.println("суббота");
        } else if (iday==7){
            System.out.println("воскресенье");
        } else
            System.out.println("такого дня недели не существует");
    }

}