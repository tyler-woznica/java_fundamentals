package labs_examples.packages.example_b;

public class ExampleClassB {

    public ExampleClassB() {
        exMethodB3();
    }

    public static void exMethodB1() {
        System.out.println("public method B1");
    }

    public void exMethodB2() {
        System.out.println("protected method B2");
    }

    protected void exMethodB3() {
        System.out.println("protected method B3");
    }

}
