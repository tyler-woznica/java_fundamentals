package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        System.out.println("Enter two integers when prompted to calculate the summation and average.");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the lower number (lower bound): ");
        int lowerint = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter the higher number (upper bound): ");
        int upperint = scanner2.nextInt();
    }
}