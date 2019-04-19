
import java.util.*;
import java.io.File;
public class Test {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(calendar.HOUR_OF_DAY) + ":" + calendar.get(calendar.MINUTE));
        Date dt = new Date();
        System.out.println(dt);
        //calendar.add(Calendar.DAY_OF_MONTH,-1);
        //System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

/*
        Calendar c = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        if (c.get(c.DAY_OF_WEEK) != Calendar.SATURDAY && c.get(c.DAY_OF_WEEK) != Calendar.SUNDAY)
        {
            if (c.get(c.DAY_OF_MONTH) == 4)
            {
                System.out.println("4 Поехали!!!");
                //startScript("scripts/OUT/Dynamic_Port_Web/Dynamic_Port_Web.bsh");
            } else if (c.get(c.DAY_OF_MONTH) == 5 && calendar.get(Calendar.DAY_OF_WEEK) == 1){
                System.out.println("5 Поехали!!!");
                //startScript("scripts/OUT/Dynamic_Port_Web/Dynamic_Port_Web.bsh");
            } else if (c.get(c.DAY_OF_MONTH) == 6){
                System.out.println("6 Поехали!!!");
                //startScript("scripts/OUT/Dynamic_Port_Web/Dynamic_Port_Web.bsh");
            }
        }
*/
/*
        Calendar calendar = new GregorianCalendar();
        int dOfm = calendar.get(Calendar.DAY_OF_MONTH);
        int dOfw = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dOfm)
        {
            case 5: case 6:
                if (dOfw == 2)
                {
                    System.out.println("5 Поехали!!!");
                    //startScript("scripts/OUT/Dynamic_Port_Web/Dynamic_Port_Web.bsh");
                }else{
                    System.out.println("Пока не едем!");
                }
                break;
            case 4:
                if (dOfw != 1 && dOfw != 7)
                {
                    System.out.println("4 Поехали!!!");
                    //startScript("scripts/OUT/Dynamic_Port_Web/Dynamic_Port_Web.bsh");
                }else{
                    System.out.println("Пока не едем!");
                }
                break;
            default:
                System.out.println("Пока не едем!");
        }
*/

/*
        Calendar calendar = new GregorianCalendar();
        int dOfm = calendar.get(Calendar.DAY_OF_MONTH);
        int dOfw = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dOfm)
        {
            case 22:
            if (dOfw != 7 && dOfw != 1)
            {
                System.out.println("Будние! Поехали!!!");
                //startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");

            }else{
                System.out.println("22 Пока не едем!");
            }
            break;
            case 21:
                if (dOfw == 6)
                {
                    System.out.println("21 Поехали!!!");
                    //startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }else{
                    System.out.println("21 Пока не едем!");
                }
                break;
            case 23:
                if (dOfw == 2)
                {
                    System.out.println("23 Поехали!!!");
                    //startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }else{
                    System.out.println("23 Пока не едем!");
                }
                break;
            default:
                System.out.println("Пока не едем!");
        }
*/
/*
        Calendar calendar = new GregorianCalendar();
        int dOfm = calendar.get(Calendar.DAY_OF_MONTH);
        int dOfw = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dOfm)
        {
            case 22:
                if (dOfw != 7 && dOfw != 1) //NOT SATURDAY & NOT SUNDAY
                {
                    startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }
                break;
            case 21:
                if (dOfw == 6)  //FRIDAY
                {
                    startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }
                break;
            case 23:
                if (dOfw == 2)  //MONDAY
                {
                    startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }
                break;
        }
*/
/*
        Calendar calendar = new GregorianCalendar();
        int dOfw = calendar.get(Calendar.DAY_OF_WEEK);
        if (dOfw == 4){ //WEDNESDAY
            startScript("scripts/RM/tCalculationSybridge/tCalculationSybridge.bsh");
        }



        switch (dOfw)
        {
            case 4:
                if (dOfw != 7 && dOfw != 1)
                {
                    System.out.println("Будние! Поехали!!!");
                    //startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");

                }else{
                    System.out.println("22 Пока не едем!");
                }
                break;
            case 21:
                if (dOfw == 6)
                {
                    System.out.println("21 Поехали!!!");
                    //startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }else{
                    System.out.println("21 Пока не едем!");
                }
                break;
            case 23:
                if (dOfw == 2)
                {
                    System.out.println("23 Поехали!!!");
                    //startScriptQ("precollect", "scripts/SOFT/tPreCollect/tPreCollect.bsh");
                }else{
                    System.out.println("23 Пока не едем!");
                }
                break;
            default:
                System.out.println("Пока не едем!");
        }

        //System.out.println(c.get(c.DAY_OF_WEEK));
        System.out.println(Calendar.SATURDAY);
        System.out.println(Calendar.SUNDAY);
        //System.out.println(c.DAY_OF_MONTH);
        //System.out.println(c.get(c.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
*/
/*
    int a = 10;
    int b = 11;
    if (a>5 | b>7){
        System.out.println(10000*25*4545454L);
    }
    byte f = 10;
    f = (byte) (f * 100); //явное приведение типов
        System.out.println(f);
    */
/*
        Calendar c = Calendar.getInstance();
        //int m = c.get(Calendar.MONTH);  //август = 7
        //System.out.println(m);

        if (c.get(c.MONTH) != 0 && c.get(c.DAY_OF_MONTH)==12){
                System.out.println("12");
        }else if (c.get(c.MONTH) == 0 && c.get(c.DAY_OF_MONTH)==20){
            System.out.println("20");
        }
*/

/*
            public static int count(String path)
            {
                int    c = 0;
                File file = new File(path);
                File[] s    = file.listFiles();

                for (File x : s) {
                    c++;
                    System.out.println(c);
                }
                return c;
*/
/*
        String s = "34941000.00";
        double d = Double.parseDouble(s);
        if (d == 3494100.00) {
            System.out.println(d);
        }else {
            System.out.println(0);
        }
        */
    }
}
