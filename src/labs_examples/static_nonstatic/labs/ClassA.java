package labs_examples.static_nonstatic.labs;

public class ClassA {

    public static void main(String[] args) {
        staticMethod();
        ClassB.staticMethodB();
        ClassA obj = new ClassA();
        obj.nonStatic();
        ClassB obj1 = new ClassB();
        obj1.nonStaticB();

    }

    public static void staticMethod () {

    }

    public void nonStatic2() {
        nonStatic();
        ClassB obj = new ClassB();
        obj.nonStaticB();
        staticMethod();
        ClassB.staticMethodB();
        double py = Math.PI;

    }

    public void nonStatic() {
        System.out.println("non static method");
    }

}
