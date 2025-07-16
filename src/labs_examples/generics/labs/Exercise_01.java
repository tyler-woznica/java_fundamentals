package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise_01 {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(100, "Integer Box");
        System.out.println(intBox);

        Box<String> strBox = new Box<>("Hello Box", "String Box");
        System.out.println(strBox);

    }

    static class Box<T> {
        private T item;
        private String label;

        public Box(T item, String label) {
            this.item = item;
            this.label = label;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "item=" + item +
                    ", label='" + label + '\'' +
                    '}';
        }
    }
}