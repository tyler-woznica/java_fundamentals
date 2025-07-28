package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

class Exercise_02 {
    public static void main(String[] args) {

        // 1 - BiFunction<T, U, R>
        BiFunction<Integer, Integer, String> biFunction = (a, b) -> "Sum: " + (a + b);
        System.out.println(biFunction.apply(2, 4));

        // 2 - BiPredicate<T, U>
        BiPredicate<String, String> biPredicate = String::equalsIgnoreCase;
        System.out.println("Equal? " + biPredicate.test("hello", "Hello"));

        // 3 - BinaryOperator<T>
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println("Product: " + binaryOperator.apply(3, 4));

        // 4 Function<T, R>
        Function<String, Integer> function = String::length;
        System.out.println("Length: " + function.apply("Function"));

        // 5 IntToDoubleFunction
        IntToDoubleFunction intToDoubleFunction = Math::sqrt;
        System.out.println("Square root: " + intToDoubleFunction.applyAsDouble(4));

        // 6 ObjIntConsumer<T>
        ObjIntConsumer<String> objIntConsumer = (s, i) ->
                System.out.println(s + " repeated: " + s.repeat(i));
        objIntConsumer.accept("Hey", 3);

        // 7 - Supplier<T>
        Supplier<String> supplier = () -> "Supplied string";
        System.out.println(supplier.get());

        // 8 - Consumer<T>
        Consumer<String> consumer = s -> System.out.println("Consumed string: " + s);
        consumer.accept("Functional Interfaces!");

        // 9 - Predicate<T>
        Predicate<Integer> predicate = n -> n > 0;
        System.out.println("Is Positive? " + predicate.test(2));

        // 10 - UnaryOperator<T>
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println("Uppercase: " + unaryOperator.apply("hello world"));

    }
}