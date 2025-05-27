package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write completed here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 7: ");
        int daynum = scanner.nextInt();

        if (daynum >= 1 & daynum  <= 7) {
            if (daynum == 1) {
                System.out.println("1 corresponds to Sunday!");
            } else if (daynum == 2) {
                System.out.println("2 corresponds to Monday!");
            } else if (daynum == 3) {
                System.out.println("3 corresponds to Tuesday!");
            } else if (daynum == 4) {
                System.out.println("4 corresponds to Wednesday!");
            } else if (daynum == 5) {
                System.out.println("5 corresponds to Thursday!");
            } else if (daynum == 6) {
                System.out.println("6 corresponds to Friday!");
            } else if (daynum == 7) {
                System.out.println("7 corresponds to Saturday!");
            }
        }

        if (daynum < 1 | daynum > 7) {
            System.out.println("That number is out of range.");
        }
    }
}
