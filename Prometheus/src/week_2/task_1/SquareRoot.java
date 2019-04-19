package week_2.task_1;

public class SquareRoot {
    public static void main(String[] args) {
        double a = 3;
        double b = 2.5;
        double c = -0.5;
        double x1, x2;

        double D = Math.pow(b, 2) - 4 * a * c;
        if (a == 0 && c == 0 && b !=0){
            x1 = 0/b;
            x2 = x1;
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            } else if ((a == 0 && c == 0 && b == 0) || (a == 0 && b == 0 && c != 0)){
                System.out.println("x1=");
                System.out.println("x2=");
            } else if (a != 0 && b == 0){
            x1 = x2 = Math.sqrt(-c / a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (D > 0){
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else if (D == 0){
            x1 = x2 = -b / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
        } else {
            System.out.println("x1=");
            System.out.println("x2=");
        }
    }
}