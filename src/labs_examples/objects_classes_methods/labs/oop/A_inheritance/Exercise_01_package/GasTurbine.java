package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class GasTurbine extends Generator {
    private double temperatureC;

    public GasTurbine(String sourceType, int capacityMW, String generatorType, double temperatureC) {
        super(sourceType, capacityMW, generatorType);
        this.temperatureC = temperatureC;
    }

    @Override
    public String describe() {
        return super.describe() + ", Combustion temp: " + temperatureC + "°C";
    }
}