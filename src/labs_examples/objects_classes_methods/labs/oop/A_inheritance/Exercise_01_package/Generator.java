package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class Generator extends PowerPlant {
    protected String generatorType;

    public Generator(String sourceType, int capacityMW, String generatorType) {
        super(sourceType, capacityMW);
        this.generatorType = generatorType;
    }

    @Override
    public String describe() {
        return super.describe() + ", Generator type: " + generatorType;
    }
}