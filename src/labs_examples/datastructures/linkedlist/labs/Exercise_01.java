package labs_examples.datastructures.linkedlist.labs;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Exercise_01 {

    // 1) create LinkedList
    static LinkedList<Integer> myLinkedList = new LinkedList<>();

    public static void main(String[] args) {

        // Create collection for 3)
        List<Integer> listOne = Arrays.asList(2, 3);

        // 2) add()
        System.out.println("Adding first value to LinkedList");
        myLinkedList.add(1);
        viewLine();

        // 3) addAll()
        System.out.println("Adding array of two values at index 1.");
        try {
            myLinkedList.addAll(1, listOne);
            viewLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 4) addFirst()
        System.out.println("Adding a value to the beginning of the LinkedList");
        myLinkedList.addFirst(0);
        viewLine();

        // 5) addLast()
        System.out.println("Adding a value to the end of the LinkedList");
        myLinkedList.addLast(4);
        viewLine();

        // 6) getFirst()
        System.out.println("Current first val: " + myLinkedList.getFirst() + "\n");

        // 7) getLast()
        System.out.println("Current last val: " + myLinkedList.getLast() + "\n");

        // 8) get()
        System.out.println("Val at index 1 is: " + myLinkedList.get(1) + "\n");

        // 9) set()
        myLinkedList.set(1, 100);
        System.out.println("Val at index 1 is now : " + myLinkedList.get(1) + "\n");
        viewLine();

        // 10) push()
        myLinkedList.push(5);
        viewLine();

        // 11) pop()
        System.out.println("Val of popped element: " + myLinkedList.pop());
        viewLine();

        // 12) remove()


        // 13) contains()

        // 14) listIterator()

        // 15) clear()

    }

    public static void viewLine () {
        System.out.println("** Updated values **");
        myLinkedList.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
    }

}

