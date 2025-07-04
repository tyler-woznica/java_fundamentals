package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {

    public static void main(String[] args) {

        try {
            checkNum(0);
        } catch (CustomException exc) {
            System.out.println("Caught custom exception: " + exc.getMessage());
        }

        System.out.println("Continue...");

    }

    public static void checkNum(int x) throws CustomException{
        if (x <= 0) {
            throw new CustomException("Number must be greater than zero.");
        }
        System.out.println("Number is valid: " + x);
    }



    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }


}