package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int index = 0;
        for (int i = 0; i < url.length()-1; i ++){
            if(url.substring(i, i + 1).equals("?")){
                index = i + 1;
            }
        }
        String newUrl = url.substring(index);
        boolean isLVL = false;
        if (newUrl.substring(0,3).equals("lvl")){
            isLVL = true;
        }
        ArrayList<Integer> razd = new ArrayList<>();
        for (int i = 0; i < newUrl.length() - 1; i ++){
            if(newUrl.substring(i, i + 1).equals("&")){
                razd.add(i);
            }
        }
        int end = 0;
        for (int i = 0; i < newUrl.length() - 1; i ++){
            if(newUrl.substring(i, i + 1).equals("=")){
                end = i;
            }
        }
        ArrayList<String> param = new ArrayList<>();
        String finalUrl = newUrl.substring(0, end);
        for (int i = 0; i < razd.size(); i ++){
            try {
                param.add(finalUrl.substring(razd.get(i) + 1, razd.get(i + 1)));
            }catch (Exception e){
                param.add(finalUrl.substring(razd.get(i) + 1));
            }
        }
        if (isLVL){
            String result = "lvl";
            for (String s:param) {
                result += " " + s;
            }
            System.out.println(result);
        }else {
            String result = "obj";
            for (String s:param) {
                result += " " + s;
            }
            double d = 0;
            String str = null;
            try {
                d = Double.parseDouble(finalUrl.substring(4, razd.get(0)));
                System.out.println(result);
                alert(d);
            }catch (Exception e){
                System.out.println(result);
                alert(finalUrl.substring(4, razd.get(0)));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
