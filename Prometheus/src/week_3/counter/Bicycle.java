package week_3.counter;


public class Bicycle {
    private static int numberOfBicycles = 0;
    private static int id;

    public Bicycle(int i){
        id = ++numberOfBicycles;
    }
    public Bicycle(){

    }

    public static int getId() {
        return id;
    }

    public static void main(String[] args) {
        Bicycle one = new Bicycle(1);

        Bicycle three = new Bicycle();

        System.out.println(one.getId());

        Bicycle two = new Bicycle(1);
        System.out.println(two.getId());
        System.out.println(three.getId());
    }

}
