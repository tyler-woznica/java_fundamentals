package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise_01_package;

public class PlantController {
    public static void main(String[] args) {

        SteamTurbine steamPlant = new SteamTurbine("Coal", 500, "Steam Turbine", 180.5);

        GasTurbine gasPlant = new GasTurbine("Natural Gas", 300, "Gas Turbine", 1100.0);

        System.out.println(steamPlant.describe());
        System.out.println(gasPlant.describe());
    }
}