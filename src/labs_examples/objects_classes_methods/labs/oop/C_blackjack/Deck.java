package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Random;
import java.util.ArrayList;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck() {
        populateDeck();
    }

    private void populateDeck () {
        int index = 0;
        for (char suit : Card.suits) {
            for (int value = 1; value <= 13; value ++) {
                cards[index++] = new Card(value, suit);
            }
        }
    }

//    public void printDeck() {
//        for (Card card : cards) {
//            System.out.println(card);
//        }
//    }

    public Card deal() {
        Random rand = new Random();
        int n;
        do {
            n = rand.nextInt(52);
        } while (usedCards.contains(n));
        usedCards.add(n);
        return cards[n];
    }
}
