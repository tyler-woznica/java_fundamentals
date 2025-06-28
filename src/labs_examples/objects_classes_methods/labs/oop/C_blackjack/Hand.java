package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getHandValue() {
        int total = 0;
        for (Card card : cards) {
            int value = card.getCardValue();
            total += Math.min(value, 10);
        }
        return total;
    }

    public boolean isBust() {
        return getHandValue() > 21;
    }


}
