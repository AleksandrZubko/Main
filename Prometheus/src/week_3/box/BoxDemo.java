package week_3.box;


public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(20, 30, 40);
        Box b3 = new Box();
        Box.staticVar = 10; //инициализируем стат. переменную с помощью обращения к ней через имя клясса
        int s = b3.staticVar; //обращаемся к статической переменной через объект
        b1.print();
        b2.print();
        b3.print();

        b1 = b2;
        b1.print();

        b2.change(100, 200, 300); //изменяем значения переменных с помощью метода
        b2.print();

        System.out.println(b2.getVolume());
        System.out.println((new Box(5, 6, 7)).getVolume()); //вызываем метод класса без создания объекта, просто по ссылке
        System.out.println((new Box()).getVolume(8, 9, 10));//отсылаем аргументы в перезагруженный метод
        System.out.println(Box.staticVar);
        System.out.println(s);
    }
}
