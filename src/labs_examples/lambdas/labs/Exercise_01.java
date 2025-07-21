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

        OneParam<String>
    }






}

