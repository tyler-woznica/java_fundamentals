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
        myLinkedList.add(1);
        viewLine();

        // 3) addAll()
        try {
            myLinkedList.addAll(1, listOne);
            viewLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 4) addFirst()

        // 5) addLast()

        // 6) getFirst()

        // 7) getLast()

        // 8) get()

        // 9) set()

        // 10) push()

        // 11) pop()

        // 12) remove()

        // 13) contains()

        // 14) listIterator()

        // 15) clear()

    }

    public static void viewLine () {
        System.out.println("** Updated values **");
        myLinkedList.forEach(System.out::println);
        System.out.println();
    }

}

