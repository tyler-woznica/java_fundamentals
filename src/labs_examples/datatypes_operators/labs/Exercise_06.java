package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        float radius = 3.14f;
        float height = 5.0f;
        float pi = 3.14159f;
        float volume = pi * radius * radius * height;
        float surfaceArea = (2 * pi * radius * radius) + (2 * pi * radius * height);
        System.out.println("The volume of a cylinder with a radius of 3.14 and a heigh of 5 is: " + volume);
        System.out.println("The surface area of that same cylinder is: " + surfaceArea);
    }
}