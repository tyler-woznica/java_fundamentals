package labs_examples.generics.labs;

import java.util.*;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {
    public static void main(String[] args) {

        System.out.println(sumNums(11, 12.62));

        List<String> words = Arrays.asList("level", "test", "radar", "java", "madam");
        System.out.println(countPalindromes(words));

        Integer[] numbers = {1, 2, 3, 4};
        swapElements(numbers, 0,2);
        System.out.println(Arrays.toString(numbers));

    }

    public static <T extends Number, U extends Number> double sumNums(T a, U b) {

        return a.doubleValue() + b.doubleValue();

    }

    public static int countPalindromes(Collection<String> collection) {

        int count = 0;
        for (String s : collection) {
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                count++;
            }
        }
        return count;

    }

    public static <T> void swapElements(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    //public static <T extends Comparable<T>> T maxInRange(List<T> list, int begin, int end) {
      //  T max =
    //}

}