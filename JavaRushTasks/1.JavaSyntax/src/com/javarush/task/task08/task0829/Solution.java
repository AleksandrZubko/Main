package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String family = reader.readLine();


            if (family.isEmpty()){
                break;
            }else {
                String name = reader.readLine();
                addresses.add(family);
                names.add(name);
            }
        }


        //read home number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String name  = reader.readLine();
        /*
        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familySecondName = addresses.get(houseNumber);
            System.out.println(familySecondName);
        }
        */
        if (!name.isEmpty()){
            for (int i = 0; i < names.size(); i ++){
                if (name.equals(addresses.get(i))){
                    System.out.println(names.get(i));
                    break;
                }
            }
        }
    }
}
