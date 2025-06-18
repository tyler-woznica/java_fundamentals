package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class PowerPlant extends EnergySource {
    protected int capacityMW;

    public PowerPlant(String sourceType, int capacityMW) {
        super(sourceType);
        this.capacityMW = capacityMW;
    }

    @Override
    public String describe() {
        return super.describe() + ", Plant capacity: " + capacityMW + " MW";
    }
}