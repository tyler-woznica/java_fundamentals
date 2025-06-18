package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class Generator {

    double output; // megawatts (MW)
    String manufacturer;
    String cooling;
    int gencost;

    public Generator(double output, String manufacturer, String cooling, int gencost) {
        this.output = output;
        this.manufacturer = manufacturer;
        this.cooling = cooling;
        this.gencost = gencost;
        
    }

    public double getOutput() {
        return output;
    }

    public void setOutput(double output) {
        this.output = output;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public int getGencost() {
        return gencost;
    }

    public void setGencost(int gencost) {
        this.gencost = gencost;
    }

    @Override
    public String toString() {
        return "Generator{" +
                "output=" + output +
                ", manufacturer='" + manufacturer + '\'' +
                ", cooling='" + cooling + '\'' +
                ", gencost=" + gencost +
                '}';
    }

}
