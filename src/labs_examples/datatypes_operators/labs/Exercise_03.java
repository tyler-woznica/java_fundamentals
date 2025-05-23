package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int x = 10;
        int y = 50;
        int z = 15;
        int add= x + y;
        int subtract = x - y;
        int multiply = x * y;
        int divide = y / x;
        int modulus = z % x;
        System.out.println("x=" + x + ", y=" + y + ", and z=" + z);
        System.out.println("x+y and x-y equals: " + add + ", and " +subtract);
        System.out.println("x*y and y/x equals: " + multiply + ", and " + divide);
        System.out.println("x%y equals " + modulus);
    }

}
