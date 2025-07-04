package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        try {
            testMethod1();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        System.out.println("Continuing program.");

    }

    public static void testMethod1() throws ArithmeticException{
        testMethod2();
    }

    public static void testMethod2() throws ArithmeticException {
        int num = 2 / 0;
        System.out.println("The quotient is: " + num);
    }

}

