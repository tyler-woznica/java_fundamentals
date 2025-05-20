package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int var1 = str.length();
        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean strcheck = (str == str2);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = (str + str2);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        boolean strcontain = str.contains("!");
        System.out.println("var1 contains the length of str: " + var1);
        System.out.println("strcheck checks if str is equal to str2: " + strcheck);
        System.out.println("str3 combines str and str2: " + str3);
        System.out.println("strcontain checks if str contains an exclamation point: " + strcontain);
    }
}