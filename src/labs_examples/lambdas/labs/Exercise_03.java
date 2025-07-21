package labs_examples.lambdas.labs;


import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class Exercise_03 {
    public static void main(String[] args) {

        Function<String, Integer> staticReference = Integer::parseInt;
        int num = staticReference.apply("123");
        System.out.println("Parsed int from static method: " + num);

        String string = "hello world";
        Supplier<String> instanceReference = string::toUpperCase;
        String upper = instanceReference.get();
        System.out.println("Uppercase string from instance method: " + upper);

        Supplier<MyClass> constructorReference = MyClass::new;
        MyClass myObj = constructorReference.get();
        System.out.println("New object from constructor reference: " + myObj);


    }

    static class MyClass {
        @Override
        public String toString() {
            return "MyClass instance";
        }
    }

}