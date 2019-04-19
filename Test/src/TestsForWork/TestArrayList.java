package TestsForWork;

import java.util.ArrayList;
import java.util.*;

public class TestArrayList {
    public static void main(String[] args) {
        /*
        ArrayList<String> list = new ArrayList<>(); //перечень клиентов, по которым вести расчёт
        list.add("38734018");
        list.add("31319242");
        for (int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
        HashMap<String, String> clientAndContract = new HashMap<String, String>(); //клиенты и договора, по которым отслеживане проводить
        clientAndContract.put("38734018","K2VKLOF33806");
        clientAndContract.put("31319242","NKVKLOF30021");

        for (Map.Entry<String, String> clientContract : clientAndContract.entrySet()) {
            System.out.println(clientContract.getKey() + " " + clientContract.getValue());
        }
        */

        GregorianCalendar c = new GregorianCalendar();
        System.out.println(c.get(c.DAY_OF_WEEK_IN_MONTH));
    }
}
