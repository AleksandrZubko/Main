import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.MONTH,-1);
        System.out.println(calendar.get(calendar.HOUR_OF_DAY) + ":" + calendar.get(calendar.MINUTE));

        String monthStr = null;
        int yearInt, monthInt;

        yearInt = calendar.get(calendar.YEAR);
        monthInt = calendar.get(calendar.MONTH);
        switch (monthInt) {
            case 0:
                monthStr = "январь";
                break;
            case 1:
                monthStr = "февраль";
                break;
            case 2:
                monthStr = "март";
                break;
            case 3:
                monthStr = "апрель";
                break;
            case 4:
                monthStr = "май";
                break;
            case 5:
                monthStr = "июнь";
                break;
            case 6:
                monthStr = "июль";
                break;
            case 7:
                monthStr = "август";
                break;
            case 8:
                monthStr = "сентябрь";
                break;
            case 9:
                monthStr = "октябрь";
                break;
            case 10:
                monthStr = "ноябрь";
                break;
            case 11:
                monthStr = "декабрь";
                break;
        }
        System.out.println(yearInt);
        System.out.println(monthStr);
        //Date dt = new Date();
        //System.out.println(dt);

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
/*
        ServiceUtils su = new ServiceUtils();
        su.setCurrentSid("190717csb5cygnhgd8ii");
        System.out.println(su.getCurrentSid());
        */
/*
        Vector v = new Vector(); //массив, может хранить любые типы

        v.insertElementAt(56,0);  // предназначен для вставки в массив нового элемента со сдвигом остальных в сторону конца массива
        v.insertElementAt("56",1);

        v.setElementAt(72, 0); //для замещения содержимого заданной ячейки массива

        for (int i = 0; i<v.size(); i++) {
            System.out.println(v.elementAt(i)); //извлечение элемента из массива
        }

*/

/*
        byte bKbd[] = new byte[256];
        int length = 5;
        String szStr = new String(bKbd, 0, length);  //Создаёт новую строку посредством раскодировки заданного подмассива байтов,
        // используя кодировку платформы по умолчаниюПодробнее: http://cyclowiki.org/wiki/String_(Java)
        System.out.println(szStr);  //вывод будет пустая строка из 5 символов

        char[] c = {'t', 'e', 's', 't'};
        String s = new String(c);  //из чарового массива собираем строку
        System.out.println(s); //test
        */
/*
        String s;
        s = "Тестовая строка, используемая для разложения на слова";
        StringTokenizer st = new StringTokenizer(s, " \t\n\r,.");  //в третьем параметры перечисляем возможныве разделители

        while (st.hasMoreTokens()) {
            // Выводим лексемы в консоль
            System.out.println(st.nextToken());
        }
*/
        Stack<Integer> stack = new Stack<>();
        stack.push(3);  //Метод push() помещает объект в стек
        stack.push(4);
        stack.push(5);
        System.out.println("Текущий стек: " + stack); //Текущий стек: [3, 4, 5]

        //метод pop() удаляет объект из стека и возвращает удалённый объект
        System.out.println("Удаляем: " + stack.pop()); //Удаляем: 5

        //метод int search(Object o), который ищет заданный элемент в стеке, возвращая количество операций pop(),
        // которые требуются для того чтобы перевести искомый элемент в вершину стека. Если заданный элемент в стеке отсутствует,
        // этот метод возвращает -1
        System.out.println("Чтоб значение 3 было последним нужно удалить элементов " + stack.search(3)); //Чтоб значение 3 было последним нужно удалить элементов 2

        System.out.println("Удаляем: " + stack.pop()); //Удаляем: 4

        // peek() кто теперь последний в стеке, не удаляя его оттуда
        System.out.println("Последний: " +  stack.peek());

        System.out.println("Удаляем: " + stack.pop()); //Удаляем: 3
        System.out.println("Текущий стек: " + stack); //Текущий стек: []

        //Чтобы убедиться, что в трубе никого не осталось, вызываем метод empty(), который возвращает булево значение.
        if (stack.empty()) {
            System.out.println("Стек пуст");
        } else {
            System.out.println("Стек не пуст");
        }

        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
    }
}
