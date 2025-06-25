package labs_examples.objects_classes_methods.labs.objects.ex04;

//In the main() method, create at least 3 objects of your POJO class, each using a different constructor.
public class Exercise_04 {
    public static void main(String[] args) {

        Pojo pojo1 = new Pojo(1, 2, 2.2);
        Pojo pojo2 = new Pojo(3, 4);
        Pojo pojo3 = new Pojo(5);

        System.out.println(pojo1.x + ", " + pojo1.y + ", " + pojo1.z);
        System.out.println(pojo2.x + ", " + pojo2.y + ", " + pojo2.z);
        System.out.println(pojo3.x + ", " + pojo3.y + ", " + pojo3.z);
    }
}