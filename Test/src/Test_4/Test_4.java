package Test_4;


import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormatSymbols;
import java.util.*;

public class Test_4 {
    public static void main(String[] args) {
/*
        Test_5[] arr = new Test_5[2];
        arr[0] = new Test_5("Sasha");
        arr[1] = new Test_5("Dasha");
        for (Test_5 t:arr) {
            t.setId();  //вызываем для расчёта и присвоения id объекта
            System.out.println(t.getId() + " " + t.getName());
        }
        int nextID1 = Test_5.getNextID(); //к статической переменной можно обратиться не только через объект, но и через класс
*/

        Test_5 t = new Test_5(5);
        System.out.println(t.getI());
        t.vuzovumnog(t);
        System.out.println(t.getI());

    }
}
class Test_5{
    private String name;
    private int id;
    private static int nextID = 1;  //статическая переменная сохраняет своё значение для всех экземпляров класса
    private int i = 0;
    public int getI(){
        return i;
    }
    Test_5(String name){
        this.name = name;
    }
    public Test_5(int i){
        this.i = i;
    }
    public void vuzovumnog(Test_5 x){
        x.umnog(100);
    }
    public void umnog(int x){
        this.i = i * x;
    }

    public void setId(){
        this.id = nextID;   //применяем статич. переменную для вычисления id записи
        nextID ++;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public static int getNextID(){  //статический метод для получения статической переменной
        return nextID;
    }
    public static int sum(int a, int b){
        return a+b;
    }
}