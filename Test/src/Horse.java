import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Horse {
    public static void main(String[] args) {
        String a = "123  ";
        /*
        double d = 90;
        if (d>49.99 && !a.equals("123")){
            System.out.println("1");
        } else if (d>80){
            System.out.println("2");
        }
        */
        /*
        System.out.println(a.trim().equals("123"));
        if (!(1>2 || 2 >5) && 5>6){
            System.out.println("edfrw");
        }
        */
/*
        File file = new File("/home/it170692gda/test");
        long lastModified = file.lastModified();

        SimpleDateFormat sdf =  new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("Отформатированное значение: " + sdf.format(new Date(lastModified)));
        System.out.println();
*/
/*
        GregorianCalendar c = new GregorianCalendar();
        c.setTimeInMillis(lastModified);
        GregorianCalendar c1 = new GregorianCalendar();
        */
/*
        Date c = new Date(lastModified);
        //System.out.println(c.toString());
        Date c1 = new Date();

        if (sdf.format(c).hashCode() < sdf.format(c1).hashCode()){
            System.out.println(sdf.format(c).hashCode());
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
*/
/*
        String s = "/RIMS/Python/Jupyter/info_dash/predictors/CC_BEH_01_PREDICTORS_NRM.txt.gz";
        String s2 = "/RIMS/Python/Jupyter/info_dash/predictors/";
        System.out.println(s2.length());
        System.out.println(s.substring(42, s.length()));
        double d = 5.1075689419999994E7;

        System.out.println(args[0]);
*/

 /*       GregorianCalendar c = new GregorianCalendar();
        c.add(Calendar.MONTH,3);
        System.out.println(c.get(c.MONTH));
        */
 /*
        String s = "16399236.00";

        String sRes = "";
        int ind = s.lastIndexOf('.');
        String sNew = s.substring(0,ind);
        String[] arr = null;
        if (sNew.length()%3 == 0){
            arr = new String[sNew.length()/3];
        } else {
            arr = new String[sNew.length()/3 + 1];
        }
        for (int i = 0; i < arr.length; i ++) {
            try {
                arr[i] = sNew.substring(sNew.length() - 3);
                sNew = sNew.substring(0, sNew.length() - 3);
            } catch (StringIndexOutOfBoundsException e) {
                arr[i] = sNew;
            }
        }
        for (int i = arr.length - 1; i >= 0; i --) {
            if (i > 0) {
                sRes += arr[i] + " ";
            } else {
                sRes += arr[i];
            }
        }

        sRes += s.substring(s.lastIndexOf('.'));
        System.out.println(sRes);
        */

        GregorianCalendar c = new GregorianCalendar();
        c.add(c.DATE, -1);
        String yesterdayMonth;
        if (c.get(Calendar.MONTH)+1 < 10) {
            yesterdayMonth = "0" + (c.get(Calendar.MONTH)+1);
        } else {
            yesterdayMonth = "" + (c.get(Calendar.MONTH)+1);
        }

        System.out.println(c.get(Calendar.YEAR) + "-" + yesterdayMonth + "-" + c.get(Calendar.DATE));
    }
}
