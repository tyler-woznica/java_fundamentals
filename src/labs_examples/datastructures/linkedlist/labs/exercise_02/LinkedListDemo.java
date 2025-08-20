package labs_examples.datastructures.linkedlist.labs.exercise_02;

public class LinkedListDemo {

    public static void main(String[] args) {
        MyLinkedList<Integer> demo = new MyLinkedList<Integer>();

        demo.push(5);
        demo.push(6);
        int val = demo.pop();
        System.out.println(val);

    }

}
