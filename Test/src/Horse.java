import Test_1.Test_1;
import Test_2.Point;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Horse {
    public static void main(String[] args) throws Exception{
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

    //GregorianCalendar c = new GregorianCalendar();
/*
        //максимальная дата текущего месяца
        int currentDay, lastDay, currentDayOfWeek;
        Calendar c = Calendar.getInstance();
        currentDay = c.get(c.DAY_OF_MONTH);
        currentDayOfWeek = c.get(c.DAY_OF_WEEK);
        c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
        lastDay = c.get(c.DAY_OF_MONTH);
        if (currentDay == lastDay || currentDayOfWeek == 6) {  //последний день месяца или пятница
            System.out.println("Выполняем");
        } else {
            System.out.println("Сегодня не последний день текущего месяца");
        }


        //добавляем 3 мес
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
/*
        GregorianCalendar c = new GregorianCalendar();
        c.add(c.DATE, -1);
        String yesterdayMonth;
        if (c.get(Calendar.MONTH)+1 < 10) {
            yesterdayMonth = "0" + (c.get(Calendar.MONTH)+1);
        } else {
            yesterdayMonth = "" + (c.get(Calendar.MONTH)+1);
        }

        System.out.println(c.get(Calendar.YEAR) + "-" + yesterdayMonth + "-" + c.get(Calendar.DATE));

 */
/*
        String base64 = "MTkwNjE4Y3NiMWdsd28xM3hmNm4=";
        Base64.Decoder dec = Base64.getDecoder();

        System.out.println(new String(dec.decode(base64)));
*/
/*
        try {
            String asB64 = Base64.getEncoder().encodeToString("yhfurueiyf".getBytes("utf-8"));
            System.out.println(asB64);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/


/*
        Point p = new Point(3);
        Class cl = p.getClass();  //class Test_2.Point
        Field f = null;
        Object v = null;
        Field[] ff = cl.getDeclaredFields();  //получаем все поля класса
        try {
            f = cl.getDeclaredField("color");  //private int Test_2.Point.color
            f.setAccessible(true);  //даёт доступ к приватному полю color
            AccessibleObject.setAccessible(ff, true);  //
            v = f.get(p);  //3
            System.out.println(cl);  //class Test_2.Point
            System.out.println(f);  //private int Test_2.Point.color
            System.out.println(v);  //3
            f.set(p, 4);    //меняем значение поля в объекте
            v = f.get(p);
            System.out.println(v);  //
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(cl.getSuperclass());  //class java.lang.Object

        String str = "daswed] bdmf cf- cred";
        System.out.println(str.endsWith("d"));  //возвращает true, если строка закнчивается указанным символом

    */
        Calendar c = new GregorianCalendar();
        int res = Double.compare(1.0, 2.0);  //-1 если первое число меньше второго, 0 - если одинаковые, -1 - если второе число больше первого

        System.out.println(res);
        if (c.getClass() == new GregorianCalendar().getClass()){  //сверяем классы
            System.out.println("good");
        }
        Integer[] arr = {1, 2, 3};
        arr = Arrays.copyOf(arr,2*arr.length);  //увеличиваем длину массива
        arr[3] = 4;

        arr = (Integer[])goodCopyOf(arr, 3);
        for (int i: arr) {
            System.out.println(i);
        }



        double y = (Double) Math.class.getMethod("sqrt", double.class).invoke(null, 4); //из класса Math вызываем метод sqrt с аргументом 4, в invoke()
        // Если метод статический, то первый параметр игнорируется, а вместо него можно указать пустое значение null

        System.out.println(y);
        System.out.println(Integer.MAX_VALUE);




    }

    public static Object goodCopyOf (Object a, int newLength) { //метод изменения длинны массива (на вход принимает массив с элементами любого типа)
        Class cl = a.getClass();
        if (!cl.isArray()){  //определяем является ли аргумент массивом
            return null;
        }
        Class componentType = cl.getComponentType(); //определяем тип данных в массиве
        int length = Array.getLength(a);  //определяет длинну массива
        Object newArray = Array.newInstance(componentType, newLength);  //создаём массив требемого типа и длины
        System.arraycopy (a, 0, newArray, 0, Math.min(length, newLength)); //копируем элементы массива, который пришёл на вход, в новый массив
        return newArray;
    }
}
