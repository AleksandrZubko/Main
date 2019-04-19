package tests.test_2;
import java.util.*;
/**
 * Created by it170692gda on 02.03.17.
 */
public class A {
    A a = new A();

    public static void main(String[] args) {
   /* final int a;
        Calendar calendar = new GregorianCalendar();
        int dOfm = calendar.get(Calendar.DAY_OF_MONTH);
        int dOfw = calendar.get(Calendar.DAY_OF_WEEK);
        if (dOfm == 1 || dOfm == 2 || dOfm == 3 || dOfm == 4 || dOfm == 5 || dOfm == 6 || dOfm == 7) {
            if (dOfw == 3) {    //MONDAY
                System.out.println("1");
            }
        }
        System.out.println(dOfm);
        System.out.println(dOfw); */
            Date today = new Date();
            if (today.getMonth() == 1 && today.getDay() == 1)
                System.out.println("Happy New Year!");
        System.out.println(today.getMonth());
        System.out.println(today.getDay());
    }
}
