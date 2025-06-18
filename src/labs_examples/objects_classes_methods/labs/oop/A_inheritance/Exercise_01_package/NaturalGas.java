package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class NaturalGas {

    String type = "naturalgas";
    int cost = 250000;
    boolean cooling =  false;

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
        return "NaturalGas{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", cooling=" + cooling +
                '}';
    }
}