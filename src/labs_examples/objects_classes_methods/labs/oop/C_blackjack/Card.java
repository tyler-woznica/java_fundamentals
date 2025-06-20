package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    public static final char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    int cardValue;
    char suit;

    public Card(int cardValue, char suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    private String getFaceValue () {
        return switch (cardValue) {
            case 1 -> "A";
            case 11 -> "J";
            case 12 -> "Q";
            case 13 -> "K";
            default -> String.valueOf(cardValue);
        };
    }

    @Override
    public String toString() {
        return getFaceValue() + suit;
    }
}