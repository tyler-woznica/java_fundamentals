package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        float avg;
        int[] nums = new int[10];

        System.out.println("After entering 10 numbers, you will get the sum and the average.");

        for (int i = 0; i < 10; i++) { // populate nums and calculate sums from input
            System.out.print("Please enter number " + (i + 1) + ": ");
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        avg = ((float)sum / nums.length);

        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + avg);
    }
}