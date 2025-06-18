package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class EnergySource {
    protected String sourceType;

    public EnergySource(String sourceType) {
        this.sourceType = sourceType;
    }

    public String describe() {
        return "Energy source: " + sourceType;
    }

}