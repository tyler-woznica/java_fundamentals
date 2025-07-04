package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        try {

            try {
                someMethod1(4, 0);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

            someMethod2(5);
        }   catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index provided is out of bounds.");
        }

    }

    public static int someMethod1(int a, int b) throws ArithmeticException{
        return a/ b;
    }

    public static int someMethod2(int a) throws ArrayIndexOutOfBoundsException {
        int[] nums = {1, 2, 3};
        return nums[a];
    }

}