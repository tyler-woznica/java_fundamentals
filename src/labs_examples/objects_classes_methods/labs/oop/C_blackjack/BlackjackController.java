package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {

    public static void main(String[] args) {

        Deck deck = new Deck();
        // deck.populateDeck();
        deck.printDeck(); // test populate
        Player player = new Player("Tyler");
        player.getHand().getCards().add(deck.deal());
        player.getHand().getCards().add(deck.deal());
        System.out.println("Test");
    }

}
