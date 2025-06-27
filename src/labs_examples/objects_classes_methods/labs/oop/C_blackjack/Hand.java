package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;
    private int handValue;

    public Hand() {
        cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards () {
        return cards;
    }


}
