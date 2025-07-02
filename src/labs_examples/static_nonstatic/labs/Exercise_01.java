package labs_examples.static_nonstatic.labs;

public class Exercise_01 {

    public static void main(String[] args) {

        Stactial1.statical2();

    }



    public static class Stactial1 {

        public static void statical2 () {
            statical3();
            Stactial1 obj = new Stactial1;
            statical4("statical4");
        }
        public static void statical3() {
            System.out.println("I'm statical 3");
        }
        public void statical4(String text) {
            System.out.println(text);
        }
    }

    public class nonStatical1 {
        public static void nonstatical2() {

        }
        public int nonstatical3(int a, int b) {
            int sum = a + b;
            return sum;
        }
    }
}

