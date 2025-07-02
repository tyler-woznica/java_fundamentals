package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;


public class BlackjackController {

    public static void main(String[] args) {
        System.out.println("Welcome to Blackjack!");
        playBlackJack();
    }

    public static void playBlackJack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.nextLine();

        Player user = new Player(userName, 100);
        Player computer = new Player("Computer", 100);

        while (user.getPotValue() > 0 && computer.getPotValue() > 0) {
            Deck deck = new Deck();
            user = new Player(user.getName(), user.getPotValue());
            computer = new Player("Computer", computer.getPotValue());

            System.out.println("\n*** Starting New Round ***");
            System.out.println(user.getName() + "'s Money: $" + user.getPotValue());
            System.out.println("Computer's Money: $" + computer.getPotValue());

            int betAmount = getBetAmount(scanner, user.getPotValue(), computer.getPotValue());

            deck.deal(user);
            deck.deal(user);
            deck.deal(computer);
            deck.deal(computer);

            boolean userDone = false;
            boolean computerDone = false;


            while (!userDone || !computerDone) {

                if (!userDone) {
                    System.out.println("\nYour cards:");
                    for (Card card : user.getHand().getCards()) {
                        System.out.println(" - " + card);
                    }
                    System.out.println("Your current hand: " + user.getHand().getHandValue());

                    if (user.getHand().isBust()) {
                        System.out.println("You busted!");
                        userDone = true;
                    } else {
                        System.out.println("Do you want another card? (yes/no): ");
                        String answer = scanner.nextLine().trim().toLowerCase();
                        if (answer.equals("yes")) {
                            deck.deal(user);
                        } else {
                            userDone = true;
                        }
                    }
                }

                if (!computerDone) {
                    if (computer.getHand().isBust()) {
                        System.out.println("\nComputer busted!");
                        computerDone = true;
                    } else if (computer.computer()) {
                        System.out.println("\nComputer takes another card.");
                        deck.deal(computer);
                    } else {
                        System.out.println("\nComputer stays.");
                        computerDone = true;
                    }
                }
            }

            int userScore = user.getHand().getHandValue();
            int compScore = computer.getHand().getHandValue();

            System.out.println("\n*** Final Score ***");

            System.out.println(user.getName() + "'s cards:");
            for (Card card : user.getHand().getCards()) {
                System.out.println(" - " + card);
            }
            System.out.println("Hand value: " + userScore);

            System.out.println("\nComputer's cards:");
            for (Card card : computer.getHand().getCards()) {
                System.out.println(" - " + card);
            }
            System.out.println("Hand value: " + compScore);

            System.out.println("\n*** Round Outcome ***");
            if (user.getHand().isBust() && computer.getHand().isBust()) {
                System.out.println("Both busted. No money exchanged.");
            } else if (user.getHand().isBust()) {
                System.out.println("You busted. Computer wins the round!");
                user.setPotValue(user.getPotValue() - betAmount);
                computer.setPotValue(computer.getPotValue() + betAmount);
            } else if (computer.getHand().isBust()) {
                System.out.println("Computer busted. You win the round!");
                user.setPotValue(user.getPotValue() + betAmount);
                computer.setPotValue(computer.getPotValue() - betAmount);
            } else if (userScore > compScore) {
                System.out.println("You win the round!");
                user.setPotValue(user.getPotValue() + betAmount);
                computer.setPotValue(computer.getPotValue() - betAmount);
            } else if (compScore > userScore) {
                System.out.println("Computer wins the round!");
                user.setPotValue(user.getPotValue() - betAmount);
                computer.setPotValue(computer.getPotValue() + betAmount);
            } else {
                System.out.println("It's a tie! No money exchanged.");
            }
        }

        System.out.println("\n*** Game Over ***");
        if (user.getPotValue() <= 0) {
            System.out.println("You ran out of money. Computer wins the game!");
        } else {
            System.out.println("Computer ran out of money. You win the game!");
        }

        scanner.close();

    }

    private static int getBetAmount(Scanner scanner, int userMoney, int computerMoney) {
        int maxBet = Math.min(userMoney, computerMoney);
        int bet;
        do {
            System.out.println("Enter your bet amount (1 to " + maxBet + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number: ");
                scanner.next();
            }
            bet = scanner.nextInt();
            scanner.nextLine();
        } while (bet < 1 || bet > maxBet);
        return bet;
    }

}
