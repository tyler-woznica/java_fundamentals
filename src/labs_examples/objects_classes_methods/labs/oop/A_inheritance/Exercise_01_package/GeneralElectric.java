package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class GeneralElectric {

    double output = 42; // megawatts (MW)
    String manufacturer = "GE";
    String cooling;
    int gencost = 1500000;

    public int getGencost() {
        return gencost;
    }

    public String getCooling() {
        return cooling;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getOutput() {
        return output;
    }

    @Override
    public String toString() {
        return "GeneralElectric{" +
                "output=" + output +
                ", manufacturer='" + manufacturer + '\'' +
                ", cooling='" + cooling + '\'' +
                ", gencost=" + gencost +
                '}';
    }
}
