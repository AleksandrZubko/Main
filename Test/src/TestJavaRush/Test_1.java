package TestJavaRush;

public class Test_1 {
    public static void main(String[] args)
    {
        method1();
    }

    public static void method1()
    {
        method2();
    }

    public static void method2()
    {
        method3();
    }

    public static void method3()
    {
        //StackTraceElement - коллекция, куда помещаются записи о вызовах функций, когда одна ф-ция вызывает другую. Когда функция завершается этот элемент удаляется из стека
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName()); //getMethodName - получение имени метода
        }
    }
}
