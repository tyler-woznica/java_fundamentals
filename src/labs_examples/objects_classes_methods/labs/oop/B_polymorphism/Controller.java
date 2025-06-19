package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Controller {

    public static void main(String[] args) {
        WeaponSystem lasers = new LaserCannons();
        XWing redFive = new XWing(lasers);

        redFive.engageWeapons(); // Fires laser cannons

        redFive.setWeaponSystem(new ProtonTorpedoes());
        redFive.engageWeapons(); // Fires torpedoes

        redFive.performManeuver("Barrel Roll");
        redFive.performManeuver("Loop", 5);
    }
}