package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> cards;
    private int handValue;

    public Hand() {
        cards = new ArrayList<>();
        handValue = 0;
    }


}
