package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Brandon");
        names.add("Charlie");
        names.add("Deborah");
        names.add("Eric");

        System.out.println(names.get(0));

        names.set(1, "Branson");
        System.out.println(names.get(1));

        names.add("Francis");

        names.remove("Charlie");
        System.out.println(names.get(2));

        int var = names.size();
        System.out.println("The Array list contains " + var + " names.");

        if (names.contains("Francis")) {
            System.out.println("Francis is on the list.");
        }

        names.clear();
        if (names.isEmpty()) {
            System.out.println("There are no more names in the list!");
        } else {
            System.out.println("There are still names in the list.");
        }
    }
}
