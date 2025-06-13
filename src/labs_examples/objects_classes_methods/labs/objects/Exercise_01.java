package labs_examples.objects_classes_methods.labs.objects;

public class Exercise_01 {

    public static void main(String[] args) {
        Engine engine = new Engine("GE", 2, "Turbofan");
        Wings wings = new Wings(60, true);
        Passengers passengers = new Passengers(200, true, true);
        Crew crew = new Crew(5, "Bob");
        Airplane airplane = new Airplane(5000, 4000, engine, wings, passengers, crew);


        System.out.println("Engine info: " + engine);
        System.out.println("Wings info: " + wings);
        System.out.println("Passengers info: " + passengers);
        System.out.println("Crew info: " + crew);
        System.out.println("Airplane info: " + airplane);

        if (engine.getBrand().equals("GE")) {
            wings.setSpan(65);
        }

        System.out.println("Updated wing info after engine type: " + wings);
    }

    static class Engine {
        private String brand;
        private int quantity;
        private String type;

        public Engine(String brand, int quantity, String type) {
            this.brand = brand;
            this.quantity = quantity;
            this.type = type;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    static class Wings {
        private int span;
        private boolean painted;

        public Wings(int span, boolean painted) {
            this.span = span;
            this.painted = painted;
        }

        public int getSpan() {
            return span;
        }

        public void setSpan(int span) {
            this.span = span;
        }

        public boolean isPainted() {
            return painted;
        }

        public void setPainted(boolean painted) {
            this.painted = painted;
        }

        @Override
        public String toString() {
            return "Wings{" +
                    "span=" + span +
                    ", painted=" + painted +
                    '}';
        }
    }

    static class Passengers {
        private int seats;
        private boolean screens;
        private boolean power;

        public Passengers(int seats, boolean screens, boolean power) {
            this.seats = seats;
            this.screens = screens;
            this.power = power;
        }

        public int getSeats() {
            return seats;
        }

        public void setSeats(int seats) {
            this.seats = seats;
        }

        public boolean isScreens() {
            return screens;
        }

        public void setScreens(boolean screens) {
            this.screens = screens;
        }

        public boolean isPower() {
            return power;
        }

        public void setPower(boolean power) {
            this.power = power;
        }

        @Override
        public String toString() {
            return "Passengers{" +
                    "seats=" + seats +
                    ", screens=" + screens +
                    ", power=" + power +
                    '}';
        }
    }

    static class Crew {
        private int crewcount;
        private String pilot;

        public Crew(int crewcount, String pilot) {
            this.crewcount = crewcount;
            this.pilot = pilot;
        }

        public int getCrewcount() {
            return crewcount;
        }

        public void setCrewcount(int crewcount) {
            this.crewcount = crewcount;
        }

        public String getPilot() {
            return pilot;
        }

        public void setPilot(String pilot) {
            this.pilot = pilot;
        }

        @Override
        public String toString() {
            return "Crew{" +
                    "crewcount=" + crewcount +
                    ", pilot='" + pilot + '\'' +
                    '}';
        }
    }

    static class Airplane {
        private double fuelcapacity;
        private double currentfuel;
        Engine engine;
        Wings wings;
        Passengers passengers;
        Crew crew;

        public Airplane(double fuelcapacity, double currentfuel, Engine engine, Wings wings, Passengers passengers, Crew crew) {
            this.fuelcapacity = fuelcapacity;
            this.currentfuel = currentfuel;
            this.engine = engine;
            this.wings = wings;
            this.passengers = passengers;
            this.crew = crew;
        }

        public double getFuelcapacity() {
            return fuelcapacity;
        }

        public void setFuelcapacity(double fuelcapacity) {
            this.fuelcapacity = fuelcapacity;
        }

        public double getCurrentfuel() {
            return currentfuel;
        }

        public void setCurrentfuel(double currentfuel) {
            this.currentfuel = currentfuel;
        }

        @Override
        public String toString() {
            return "Airplane{" +
                    "fuelcapacity=" + fuelcapacity +
                    ", currentfuel=" + currentfuel +
                    '}';
        }
    }
}
