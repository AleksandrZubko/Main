package week_3.task_2;

public class Main {
    public static void main(String[] args) {
        Deck d =new Deck();
        Card c1 = d.drawOne();
        System.out.println(c1.getRank().getName() + " " + c1.getSuit().getName());
        d.shuffle();
        Card c2 = d.drawOne();
        System.out.println(c2.getRank().getName() + " " + c2.getSuit().getName());

    }
}
