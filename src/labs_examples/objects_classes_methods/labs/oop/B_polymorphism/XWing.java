package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class XWing {
    private WeaponSystem weaponSystem;

    // Constructor that takes an interface (Dependency Injection)
    public XWing(WeaponSystem weaponSystem) {
        this.weaponSystem = weaponSystem;
    }

    // Setter for changing the dependency
    public void setWeaponSystem(WeaponSystem weaponSystem) {
        this.weaponSystem = weaponSystem;
    }

    public void engageWeapons() {
        weaponSystem.fire();
    }

    // Method Overloading
    public void performManeuver(String type) {
        System.out.println("Performing maneuver: " + type);
    }

    public void performManeuver(String type, int intensity) {
        System.out.println("Performing maneuver: " + type + " with intensity level " + intensity);
    }
}