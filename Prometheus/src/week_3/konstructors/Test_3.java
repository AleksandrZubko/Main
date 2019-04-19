package week_3.konstructors;

/**
 * Created by it170692gda on 02.03.17.
 */
public class Test_3 {
    public int x;
    public int y;

    public int getX() { //гетер
        return x;
    }

    public void setX(int x) {   //сетер
        this.x = x;
    }

    public Test_3(int y){   //конструктор
        this.y = y + 10;
    }
    public static void main(String[] args) {
        Test_3 t3 = new Test_3(7); //объект класса с передачей аргументов конструктору
        t3.setX(10);                    //вызываем сетер и передаём ему значение 10
        System.out.println(t3.getX());  //выводим результат гетера
        System.out.println(t3.x);
        System.out.println(t3.y);       //смотрим как поменялось значение переменной y с помощью конструктора
        System.out.println((new Test_3(5)).y);  //обращаемся без создания объекта с помощью ссылки к переменной класса
    }
}
