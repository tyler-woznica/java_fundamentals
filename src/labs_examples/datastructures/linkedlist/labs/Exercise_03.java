package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {







    public class Node <T> {
        private final T data;
        private Node<T> previous;
        private Node<T> next;

        @Override
        public String toString() {
            return data.toString() + " -> ";
        }
    }

    public interface List<T> {
        void insertAtHead(T data);
        void insertAtTail(T data);
    }
}