package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {

    public static void main(String[] args) {

    }

class Engine {
    String brand;
    int quantity;
    String type;
}

class Wings {
    int span;
    boolean painted;
    public Wings (int span, boolean painted) {
        this.span = span;
        this.painted = painted;
    }
}

class Passengers {
    int seats;
    boolean screens;
    boolean power;
    public Passengers (int seats, boolean screens, boolean power) {
        this.seats = seats;
        this.screens = screens;
        this.power = power;
    }
}

class Crew {
    int crewcount;
    String pilot;
    public Crew (int crewcount, String pilot) {
        this.crewcount = crewcount;
        this.pilot = pilot;
    }
}

class Airplane {
    double fuelcapacity;
    double currentfuel;
}


















}
