package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {

    public static void main(String[] args) {

    }

class Engine {
    private String brand;
    private int quantity;
    private String type;

    public Engine (String brand, int quantity, String type) {
        this.brand = brand;
        this.quantity = quantity;
        this.type = type;
    }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String toString() {
        return "Engine[Brand=" + brand + ", Quantity=" + quantity + ", Type=" + type + "]";
    }
}

class Wings {
    private int span;
    private boolean painted;

    public Wings (int span, boolean painted) {
        this.span = span;
        this.painted = painted;
    }
    public int getSpan() { return span; }
    public void setSpan(int span) { this.span = span; }

    public boolean isPainted() { return painted; }
    public void setPainted(boolean painted) { this.painted = painted; }

    public String toString() {
        return "Wings[Span=" + span + " meters, Painted=" + painted + "]";
    }
}

class Passengers {
    private int seats;
    private boolean screens;
    private boolean power;

    public Passengers (int seats, boolean screens, boolean power) {
        this.seats = seats;
        this.screens = screens;
        this.power = power;
    }
    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    public boolean hasScreens() { return screens; }
    public void setScreens(boolean screens) { this.screens = screens; }

    public boolean hasPower() { return power; }
    public void setPower(boolean power) { this.power = power; }

    public String toString() {
        return "Passengers[Seats=" + seats + ", Screens=" + screens + ", Power=" + power + "]";
    }
}

class Crew {
    private int crewcount;
    private String pilot;
    public Crew (int crewcount, String pilot) {
        this.crewcount = crewcount;
        this.pilot = pilot;
    }
    public int getCrewcount() { return crewcount; }
    public void setCrewcount(int crewcount) { this.crewcount = crewcount; }

    public String getPilot() { return pilot; }
    public void setPilot(String pilot) { this.pilot = pilot; }

    public String toString() {
        return "Crew[Crew Count=" + crewcount + ", Pilot=" + pilot + "]";
    }
}

class Airplane {
    private double fuelcapacity;
    private double currentfuel;

    public Airplane(double fuelcapacity, double currentfuel) {
        this.fuelcapacity = fuelcapacity;
        this.currentfuel = currentfuel;
    }

    public double getFuelcapacity() { return fuelcapacity; }
    public void setFuelcapacity(double fuelcapacity) { this.fuelcapacity = fuelcapacity; }

    public double getCurrentfuel() { return currentfuel; }
    public void setCurrentfuel(double currentfuel) { this.currentfuel = currentfuel; }

    public String toString() {
        return "Airplane[Fuel Capacity=" + fuelcapacity + ", Current Fuel=" + currentfuel + "]";
    }
}

}
