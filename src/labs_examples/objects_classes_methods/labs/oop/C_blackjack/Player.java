package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    private String name;
    private Hand hand;
    private int potValue;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.potValue = potValue;
    }

    public Hand getHand() {
        return hand;
    }
}
