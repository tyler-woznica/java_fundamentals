package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 12: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("That's January!");
                break;
            case 2:
                System.out.println("That's February!");
                break;
            case 3:
                System.out.println("That's March!");
                break;
            case 4:
                System.out.println("That's April!");
                break;
            case 5:
                System.out.println("That's May!");
                break;
            case 6:
                System.out.println("That's June!");
                break;
            case 7:
                System.out.println("That's July!");
                break;
            case 8:
                System.out.println("That's August!");
                break;
            case 9:
                System.out.println("That's September!");
                break;
            case 10:
                System.out.println("That's October!");
                break;
            case 11:
                System.out.println("That's November!");
                break;
            case 12:
                System.out.println("That's December!");
                break;
            default:
                System.out.println("Hmm, that value is out of range.");
        }
    }
}
