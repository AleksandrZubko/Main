package week_3.box;


public class Box {
    private int x;
    private int y;
    private int z;
    public static int staticVar;

    public Box(){   //конструктор1
        this(0, 0, 0);  //запуск конструктора2
    }

    public Box(int x, int y, int z){    //конструктор2
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print(){
        System.out.println("x: "+x+", y: "+y+", z: "+z);
    }

    public void change(int x, int y, int z){    //создаём метод аналогичный конструктору, с помощью кторого можно будет снова изменить значение переменных
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public long getVolume(){    //расчитываем объём коробки по параметрам, переданным конструктору класса
        return x*y*z;
    }

    public long getVolume(int x, int y, int z){    //расчитываем объём коробки, по параметрам, которые передаются в метод
        return x*y*z;
    }

}
