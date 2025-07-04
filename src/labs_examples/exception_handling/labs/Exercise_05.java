package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {

        try {
            someMethod(3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That index location is out of bounds.");
        }

    }

    public static int someMethod(int x) throws ArrayIndexOutOfBoundsException {
        int[] nums = {1, 2};
        return nums[x];
    }

}