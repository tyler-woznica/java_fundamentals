package labs_examples.packages.labs;

import labs_examples.packages.example_a.ExampleClassA;
import labs_examples.packages.example_b.ExampleClassB;

import static labs_examples.packages.example_a.ExampleClassA.*;
import static labs_examples.packages.example_b.ExampleClassB.exMethodB1;
import labs_examples.packages.example_b.ExampleClassB.*;


/**
 * Packages Exercise 1: Protected modifier
 *
 *      1) Within this package, create two new labs_examples.packages.
 *      2) Create a new Java class in each package.
 *      3) Create at least two methods in each class, with at least one with the protected access modifier
 *      4) Demonstrate how the the protected access modifier restricts access from package to package
 *
 */

public class PackagesExercise_01 {

    public static void main(String[] args) {

        exMethodA1();
        // exMethodA2();
        exMethodB1();
        ExampleClassB obj = new ExampleClassB();
        obj.exMethodB2();
        // obj.exMethodB3();


    }



}