package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private Card[] cards;
    private ArrayList<Integer> usedCards;

    public Deck() {
        usedCards = new ArrayList<>();
        cards = new Card[52];
        populateDeck();
    }

    public void populateDeck() {
        char[] suits = new char[]{'♠', '♦', '♥', '♣'};
        int i = 0;
        for (char suit : suits) {
            for (int val = 1; val <= 13; val++) {
                cards[i++] = new Card(val, suit);
            }
        }
    }

    public void deal(Player player) {
        Random rand = new Random();
        int n;
        do {
            n = rand.nextInt(52);
        } while (usedCards.contains(n));
        usedCards.add(n);
        Card dealtCard = cards[n];
        player.getHand().addCard(dealtCard);
    }

    public Card[] getCards() {
        return cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }


//    public void printDeck() {
//        for (Card card : cards) {
//            System.out.println(card);
//        }
//    }


}
