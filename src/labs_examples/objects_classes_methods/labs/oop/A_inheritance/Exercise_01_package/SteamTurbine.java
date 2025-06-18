package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class SteamTurbine extends Generator {
    private double pressureBar; // barometric pressure

    public SteamTurbine(String sourceType, int capacityMW, String generatorType, double pressureBar) {
        super(sourceType, capacityMW, generatorType);
        this.pressureBar = pressureBar;
    }

    @Override
    public String describe() {
        return super.describe() + ", Steam pressure: " + pressureBar + " bar";
    }
}