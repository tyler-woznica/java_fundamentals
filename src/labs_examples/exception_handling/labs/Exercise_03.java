package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is outside of the array.");
        }

        try {
            int[] nums = {1, 2, 3};
            int quotient = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("End of program.");
        }


    }
}