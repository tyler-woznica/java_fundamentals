package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        System.out.println("10 * 5 = " + multiply(10, 5));
        System.out.println("10 / 5 = " + divide(10, 5));
        joke();
        secYear(2);
        System.out.println("Number of arguments: " + countArgs(1, 2, 3, 4, 5));

    }

    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("What did the priest say to the assembly of vegetables?");
        System.out.println("Lettuce pray.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static void secYear(int a) {
        int secs = a * 31536000;
        System.out.println("There are " + secs + " in " + a + " year(s).");
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int countArgs(int... numbers) {
        return numbers.length;
    }
}
