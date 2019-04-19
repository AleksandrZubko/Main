

package Test_tRefDays;

import java.util.GregorianCalendar;
import java.util.*;

/**
 * Created by it170692gda on 09.11.17.
 */
public class tRefDays {
    public static void main(String[] args) {
        /*
        GregorianCalendar dt = new GregorianCalendar();
        GregorianCalendar c = new GregorianCalendar();
        //c.set(c.YEAR, c.MONTH);
        int maximum = c.getActualMaximum(c.DAY_OF_MONTH);
        System.out.println(maximum);

        dt.add(dt.MONTH, 1);        //прибавляем 1 мес
        int month_1 = dt.get(dt.MONTH) + 1; //получаем месяц (добавляем +1, так как январь = 0)
        int year_1 = dt.get(dt.YEAR);       //получаем год
        dt.add(dt.MONTH, 1);        //прибавляем 1 мес
        int month_2 = dt.get(dt.MONTH) + 1;
        int year_2 = dt.get(dt.YEAR);
        dt.add(dt.MONTH, 1);        //прибавляем 1 мес
        int month_3 = dt.get(dt.MONTH) + 1;
        int year_3 = dt.get(dt.YEAR);


        System.out.println("month_1 = " + month_1 + ", year_1 = " + year_1);
        System.out.println("month_2 = " + month_2 + ", year_2 = " + year_2);
        System.out.println("month_3 = " + month_3 + ", year_3 = " + year_3);
        */


        GregorianCalendar dt = new GregorianCalendar();
        dt.add(dt.DAY_OF_MONTH, -1);
        int repYear = dt.get(dt.YEAR);
        int repMonth = dt.get(dt.MONTH) + 1;
        int repDate = dt.get(dt.DATE);
        String repMonthString = null;
        String repDateString = null;
        if (repMonth < 10){
            repMonthString = "0" + repMonth;
        }else{
            repMonthString = "" + repMonth;
        }
        if (repDate < 10){
            repDateString = "0" + repDate;
        }else{
            repDateString = "" + repDate;
        }
        String repDT = repYear + "-" + repMonthString + "-" + repDateString;
        System.out.println(repDT);

        /*
        for (int i = 1; i < 2; i++) {
            dt.add(dt.MONTH, 1);                //увеличиваем текущую дату в объекте на 1 мес
            int month = dt.get(dt.MONTH) + 1;    //получаем месяц (добавляем +1, так как январь = 0)
            int year = dt.get(dt.YEAR);        //получаем год
            //System.out.println("month_" + i + " = " + month + ", year_" + i + " = " + year);
            String monthToString = null;
            if (("" + month).length() == 1) {
                monthToString = "0" + month;
            } else {
                monthToString = "" + month;
            }
            //System.out.println(monthToString);
            String repDays = "450*02345001234500123450012*45";
            int holiday;
            int workSat;
            String KeyName = null;
            String holidayToString = null;
            String DT = null;
            for (int j = 1; j < repDays.length(); j ++){
                if (repDays.charAt(j-1) == '5' && repDays.charAt(j) != '0' && repDays.charAt(j) != '*'){
                    workSat = j + 1;
                    String workSatToString = null;
                    if (("" + workSat).length() == 1){
                        workSatToString = "0" + workSat;
                    }else{
                        workSatToString = "" + workSat;
                    }
                    System.out.println(workSatToString);

                }
            }
        }
*/



    }
}
