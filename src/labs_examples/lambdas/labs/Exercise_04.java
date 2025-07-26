package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demonstrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example {
    public static void main(String[] args) {

        IntStream.rangeClosed(1, 15).forEach(System.out::println);

        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println("Sum of 1-10: " + sum);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        int mapSum = nums.stream().mapToInt(n -> n * 2).sum();
        System.out.println("Mapped sum doubled: " + mapSum);

        OptionalDouble avgOpt = nums.stream()
                .filter(n -> n >= 3)
                .mapToInt(n -> n)
                .average();
        int average = (int) avgOpt.orElse(0);
        System.out.println("Average >=3: " + average);

        int reducedSum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Reduced sum: " + reducedSum);

        try (Stream<String> lines = Files
                .lines(Paths.get("src/labs_examples/lambdas/labs/stream_text_lab.csv"))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files
                .lines(Paths.get("src/labs_examples/lambdas/labs/stream_text_lab.csv"))) {
            lines.map(line -> line.split(","))
                    .forEach(parts -> System.out.println(parts[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> lines = Files
                .lines(Paths.get("src/labs_examples/lambdas/labs/stream_text_lab.csv"))) {
            double sumIndex2 = lines.map(line -> line.split(","))
                    .mapToDouble(parts -> Double.parseDouble(parts[2]))
                    .sum();
            System.out.println("Sum of index 2: " + sumIndex2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        boolean anyGreaterThan4 = nums.stream()
                .anyMatch(n -> n > 4);
        System.out.println("Any > 4? " + anyGreaterThan4);

        boolean allGreaterThan0 = nums.stream()
                .allMatch(n -> n > 0);
        System.out.println("All > 0? " + allGreaterThan0);

        List<Integer> doubledList = nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Doubled list: " + doubledList);

    }
}
