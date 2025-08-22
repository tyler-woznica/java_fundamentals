package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {

    // 1) instantiate a new stack
    private static Stack<Double> myStack = new Stack<>();

    public static void main(String[] args) {

        // 2) demonstrate the 5 methods of the Stack class

        // pushing data
        myStack.push(1.1);
        myStack.push(2.2);
        myStack.push(3.3);

        // checking lenth
        System.out.println("Size of stack: " + myStack.size());

        // pop data
        System.out.println("Popped value: " + myStack.pop());

        // peek at top of stack
        System.out.println("Top of stack val: " + myStack.peek());

        // search for a value
        System.out.println("Return 1 if 2.2 in the stack: " + myStack.search(2.2));

        // is the stack empty
        System.out.println("Stack empty? " + myStack.isEmpty());

        // clear the stack
        System.out.println("Clearing stack...");
        myStack.clear();
        System.out.println("Check size after clear: " + myStack.size());

    }
}
