package week_3.task_2;

import java.util.Random;

public class Deck {

    public Card []deck = new Card[36];
    int ind = 0;
    boolean aBoolean;

    public Deck(){
        create();
    }

    public void create(){
        int k = 0;
        for (int i = 0; i < Suit.values.length; i++)
            for (int j = 0; j < Rank.values.length; j++){
                deck[k] = new Card(Rank.values[j], Suit.values[i]);
                k ++;
            }
        ind = 36;
        aBoolean = true;
    }

    public void shuffle() {
        Card card;
        int newInd = 0, twoInd = 0;
        Random random = new Random();

        if(hasNext()) {
            for (int i = deck.length - 1; i > 0; i--) {
                int index = random.nextInt(i + 1);
                Card t = deck[index];
                deck[index] = deck[i];
                deck[i] = t;
            }
            aBoolean = false;
        }
    }

    public void order() {
        Deck deck = new Deck();
        if (ind > 0){
            for (int i = 0; i < ind; i++)
                this.deck[i] = deck.deck[i];
            aBoolean = true;
        }
    }

    public boolean hasNext() {
        if  (ind > 0)
            return true;
        else
            return false;
    }

    public Card drawOne() {
        if (ind > 0){
            if (aBoolean == false)
                order();
            Card card = deck[ind - 1];
            deck[ind - 1] = null;
            ind --;
            return card;
        }
        else
            return null;
    }

}
