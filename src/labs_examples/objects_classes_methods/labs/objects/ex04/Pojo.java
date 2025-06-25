package labs_examples.objects_classes_methods.labs.objects.ex04;

//In this POJO, demonstrate at least three overloaded constructors.
public class Pojo {
    public int x;
    public int y;
    public double z;

    public Pojo(int x, int y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Pojo(int x) {
        this.x = x;
    }

    public Pojo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}