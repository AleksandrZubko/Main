package v1ch04.EmployeeTest;
import java.util.*;


/**
 * This program tests the Employee class.
 * @version 1.11 2004-02-19
 * @author Cay Horstmann
 */
public class EmployeeTest
{
   public static void main(String[] args)
   {
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3]; //массив объектов типа Employee
      //заполняем элементы масива объектами класса Employee с заполнением параметров для конструктора
      staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
      staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);

      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
               + e.getHireDay());
      if(staff[1].equals(staff[2])){   //сравниваем имя сотрудника в другом объекте
         System.out.println("У сотрудников идетичные ФИО");
      }else{
         System.out.println("У сотрудников не идетичные ФИО");
      }
   }
}

class Employee
{
   private String name; //поле класса
   private double salary;  //поле класса
   private Date hireDay;   //поле класса
   private static int i = 0;
   public Employee(String n, double s, int year, int month, int day) //конструктор
   {
      name = n;
      salary = s;
      GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
      // GregorianCalendar uses 0 for January
      hireDay = calendar.getTime();
   }

   public String getName()
   {
      return name;
   }

   public double getSalary()
   {
      return salary;
   }

   public Date getHireDay()
   {
      return hireDay;
   }

   public void raiseSalary(double byPercent)
   {
      double raise = salary * byPercent / 100;
      salary += raise;
   }
   public boolean equals(Employee ohter){ //сравниваем имя сотрудника в другом объекте
      return name.equals(ohter.name);
   }
}
