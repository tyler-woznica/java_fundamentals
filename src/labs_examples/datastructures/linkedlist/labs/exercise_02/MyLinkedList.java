package labs_examples.datastructures.linkedlist.labs.exercise_02;

public class MyLinkedList<T> {

    private Node<T> head;

    public void push (T data) {

        if (head == null) {
            head = new Node<>(data);
            return;
        }

        // list is not empty
        // iterate over list until you find null variable

        // head = head.next;
        Node<T> iterator = head;

        // walk the list
        while (iterator.next != null) {
            iterator = iterator.next;
        }

        iterator.next = new Node<>(data);

    }

    public T pop () {

        if (head == null) {
            return null;
        }

        Node<T> firstval = head;
        head = head.next;
        return firstval.data;
    }

}
