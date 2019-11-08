package Test_2;

/**
 * Created by it170692gda on 01.03.17.
 */
public class Point {
    public static void main(String[] args) {
        System.out.println(new OuterClass.InnerClass().i );
    }
}


class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}