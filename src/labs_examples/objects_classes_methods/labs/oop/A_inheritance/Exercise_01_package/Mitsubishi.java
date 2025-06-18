package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class Mitsubishi {

    double output = 40; // megawatts (MW)
    String manufacturer = "Mitsubishi";
    String cooling;
    int gencost = 1200000;

    public double getOutput() {
        return output;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCooling() {
        return cooling;
    }

    public int getGencost() {
        return gencost;
    }

    @Override
    public String toString() {
        return "Mitsubishi{" +
                "output=" + output +
                ", manufacturer='" + manufacturer + '\'' +
                ", cooling='" + cooling + '\'' +
                ", gencost=" + gencost +
                '}';
    }
}
