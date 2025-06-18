package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class Uranium {
    String type = "uranium";
    int cost = 1000000;
    boolean cooling =  true;

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }

    public boolean isCooling() {
        return cooling;
    }

    @Override
    public String toString() {
        return "Uranium{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", cooling=" + cooling +
                '}';
    }
}