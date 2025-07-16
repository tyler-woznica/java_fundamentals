package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(987);
        intList.add(435);
        intList.add(105);

        double intSum = Calc.sum(intList);
        System.out.println(intSum);

    }

    class Calc {

        public static <T extends Number> double sum(ArrayList<T> numbers) {
            double total = 0;
            for (T num : numbers) {
                total += num.doubleValue();
            }
            return total;
        }
    }




}