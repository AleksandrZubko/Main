package Test_4;
import java.util.*;
/**
 * Created by it170692gda on 22.09.17.
 */
public class Test_6 {
    public static void main(String[] args) {
    Manager[] arr = new Manager[2];
    arr[0] = new Manager(25, "Sasha", 5000, 5);
    //arr[1] = new Empl(30, "Masha", 5000);
    //System.out.println(arr[0].getAge() + " " + arr[0].getSalaryKoef1());
        //System.out.println(arr[1].getAge());
    //System.out.println();
    Empl e = new Manager(25, "Sasha", 5000, 5);
    Class cl = e.getClass(); //получаем экземпляр типа Class
    String name = cl.getName(); //получаем имя класса, вернёт Test_4.Manager





    Manager m = (Manager)e; //приведение типа классов для получения доступа к методам и полям подкласса
        System.out.println(m.getKoef()); //теперь можно вызвать метод подкласса
        System.out.println(arr[0].m);
    }


}
class Empl{
    private int age;
    private String name;
    private int salary;
    public int m = 0;
    public Empl(int age, String name,  int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public int getAge(){ //этот метод не возможно переопределить в подклассе
        return age;
    }
    public int getSalaryKoef(int koef){
        System.out.println(salary);
        System.out.println(koef);
        return salary * koef;

    }
}
class Manager extends Empl{
    private int koef;
    Manager(int age, String name, int salary, int koef){
        super(age, name, salary);
        this.koef = koef;
    }
    ;
    public int getSalaryKoef1 (){
        System.out.println(this.koef);
        int SalaryKoef = super.getSalaryKoef(this.koef);
        return SalaryKoef;
    }
    public final int getAge(){  //этот метод не возможно переопределить в подклассе
        return 28;
    }

    public int getKoef() {
        return koef;
    }
}