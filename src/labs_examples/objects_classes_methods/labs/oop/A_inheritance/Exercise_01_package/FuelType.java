package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class FuelType {

    String fueltype;
    int fuelcost;
    boolean fuelcooling;

    public FuelType(String fueltype, int fuelcost, boolean fuelcooling) {
        this.fueltype = fueltype;
        this.fuelcost = fuelcost;
        this.fuelcooling = fuelcooling;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public int getFuelcost() {
        return fuelcost;
    }

    public void setFuelcost(int fuelcost) {
        this.fuelcost = fuelcost;
    }

    public boolean isFuelcooling() {
        return fuelcooling;
    }

    public void setFuelcooling(boolean fuelcooling) {
        this.fuelcooling = fuelcooling;
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "fueltype='" + fueltype + '\'' +
                ", fuelcost=" + fuelcost +
                ", fuelcooling=" + fuelcooling +
                '}';
    }

}