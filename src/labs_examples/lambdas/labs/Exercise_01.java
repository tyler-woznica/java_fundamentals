package labs_examples.lambdas.labs;

/*  Lambdas Exercise 1:
       1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
       2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
           an anonymous inner class from this interface.
       3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
           value of the same type as the parameter
       4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
           an anonymous inner class from this interface.
       5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
           value
       6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
           an anonymous inner class from this interface.
       7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package. */

import java.sql.SQLOutput;
import java.util.function.BiFunction;
import java.util.function.Function;

class Exercise_01 {

    @FunctionalInterface
    interface NoParam {
        void exc();
    }

    @FunctionalInterface
    interface OneParam<T> {
        T process(T input);
    }

    @FunctionalInterface
    interface TwoParam<T, U, R> {
        R compute(T a, U b);
    }

    public static void main(String[] args) {

        NoParam greetLambda = () -> System.out.println("Hello from Lambda!");
        greetLambda.exc();

        NoParam greetAnon = new NoParam() {
            @Override
            public void exc() {
                System.out.println("Hello from anonymous!");
            }
        };

        greetAnon.exc();

        OneParam<String> upperLambda = s -> s.toUpperCase();
        System.out.println(upperLambda.process("hello was lowercase"));

        OneParam<String> upperAnon = new OneParam<String>() {
            @Override
            public String process(String input) {
                return input.toUpperCase();
            }
        };

        System.out.println(upperAnon.process("world was lowercase"));

        TwoParam<Integer, Integer, Integer> addLambda = (a, b) -> a + b;
        System.out.println("Sum (lambda): " + addLambda.compute(2, 4));

        TwoParam<Integer, Integer, Integer> addAnon = new TwoParam<Integer, Integer, Integer>() {
            @Override
            public Integer compute(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println("Sum (anon class): " + addAnon.compute(3, 6));

        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length of 'Lambda': " + lengthFunction.apply("Lambda"));

        BiFunction<String, String, String> concatFunction = (s1, s2) -> s1 + s2;
        System.out.println("Concat result: " + concatFunction.apply("Hello, ", "World!"));

    }






}

