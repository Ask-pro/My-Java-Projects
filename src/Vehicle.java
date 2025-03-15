abstract class Vehicle {
    private String brand; // Brand (Encapsulation)
    private int year; // Year (Encapsulation)
    private String name; // Name (Encapsulation)

    void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    // Abstract method (Abstraction)
    abstract void displayinfo();

    // Car class (Inheritance)
    static class Car extends Vehicle {
        private String fuel_type; // Fuel type (Encapsulation)

        // Car constructor (Constructor, Inheritance)
        public Car(String brand, int year, String name, String fuel_type) {
            super.setBrand(brand);
            super.setYear(year);
            super.setName(name);
            this.fuel_type = fuel_type;
        }

        // Display method (Polymorphism)
        void displayinfo() {
            System.out.println("\nHello! Thanks for your interest in " + getBrand()+ ". Below are your car details:"); // Brand
            System.out.println("Model name: " +getName()+" - "+fuel_type+"\nManufactured in the year: " + getYear()); // Info
        }

        // Sports class (Inheritance)
        static class Sports extends Car {
            String speed; // Speed (Encapsulation)

            // Sports constructor (Constructor, Inheritance)
            public Sports(String sport_name, int sport_year, String sport_model, String sport_type, String speed) {
                super(sport_name, sport_year, sport_model, sport_type); // Parent constructor
                this.speed = speed; // Set speed
            }

            // Override display (Polymorphism)
            @Override
            void displayinfo() {
                super.displayinfo(); // Parent method
                System.out.print("Speed of the car: " + speed + "\n"); // Speed
            }
        }
    }

    // Truck class (Inheritance)
    static class Truck extends Vehicle {
        private String payload; // Payload (Encapsulation)

        // Truck constructor (Constructor, Inheritance)
        public Truck(String brand, int year, String name, String payload) {
            super.setBrand(brand);
            super.setYear(year);
            super.setName(name);
            this.payload = payload;
        }

        // Display method (Polymorphism)
        void displayinfo() {
            System.out.println("\nHello! Thanks for your interest in " + getBrand()+ ". Below are your truck details:"); // Brand
            System.out.println("Model name: " +getName()+"\n"+"Manufactured in the year: " + getYear() + "\nPayload: " + payload); // Info
        }
    }

    // Bike class (Inheritance)
    static class Bike extends Vehicle {
        private String engine; // Engine (Encapsulation)

        // Bike constructor (Constructor, Inheritance)
        public Bike(String brand, int year, String name, String engine) {
            super.setBrand(brand);
            super.setName(name);
            super.setYear(year);
            this.engine = engine;
        }

        // Display method (Polymorphism)
        void displayinfo() {
            System.out.println("\nHello! Thanks for your interest in " + getBrand()+ ". Below are your bike details:"); // Brand
            System.out.println("Model name: " +getName()+"\n"+"Manufactured in the year: " + getYear() + "\nEngine type: " + engine); // Info
        }
    }
}

// Main class
class MainClass {
    public static void main(String[] args) {
        // Car array (Object initialization)
        Vehicle[] vehicle = new Vehicle[3]; // Car array (Polymorphism)
        vehicle[0] = new Vehicle.Car("Tata", 2025, "Punch", "EV"); // Create car (Object initialization)
        vehicle[1] = new Vehicle.Car("Renault", 2022, "Duster" ,"Petrol"); // Create car (Object initialization)
        vehicle[2] = new Vehicle.Car("Mahindra", 2023, "Thar" ,"Petrol"); // Create car (Object initialization)

        // SportsCar array (Object initialization, Polymorphism)
        Vehicle.Car.Sports[] sportcar = new Vehicle.Car.Sports[1]; // SportsCar array
        sportcar[0] = new Vehicle.Car.Sports("Porsche",2025,"911","Petrol","330 mph"); // Create sports car (Object initialization)

        // Display car info (Loop, Polymorphism)
        for (Vehicle car : vehicle) {
            car.displayinfo(); // Display car info (Polymorphism)
        }

        // Display sports car info (Loop, Polymorphism)
        for (Vehicle.Car.Sports sports : sportcar) {
            sports.displayinfo(); // Display sports info (Polymorphism)
        }

        // Truck array (Object initialization, Polymorphism)
        vehicle[0] = new Vehicle.Truck("Tata", 2025, "Ace","10 Ton"); // Create truck
        vehicle[1] = new Vehicle.Truck("Ashok Leyland", 2022, "Dost", "8 Ton"); // Create truck
        vehicle[2] = new Vehicle.Truck("Mahindra", 2023, "Bolero","1.5 Ton"); // Create truck

        // Display truck info (Loop, Polymorphism)
        for(Vehicle truck: vehicle){
            truck.displayinfo(); // Display truck info (Polymorphism)
        }

        // Bike array (Object initialization, Polymorphism)
        vehicle[0] = new Vehicle.Bike("Royal Enfield", 2025, "Meteor 350", "Single-Cylinder"); // Create bike
        vehicle[1] = new Vehicle.Bike("BMW", 2022, "S 1000 RR" ,"Inline Four"); // Create bike
        vehicle[2] = new Vehicle.Bike("Kawasaki", 2023, "Z900" ,"Parallel Twin"); // Create bike

        // Display bike info (Loop, Polymorphism)
        for(Vehicle bike: vehicle){
            bike.displayinfo(); // Display bike info (Polymorphism)
        }
    }
}
