abstract class Vehicle {
    private String brand; // Instance variable
    private int year; // Instance variable
    private String name;

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

    // Display info method
    abstract void displayinfo();

    // Car class (inherits Vehicle)
    static class Car extends Vehicle {
        private String fuel_type; // Model name

        // Car constructor
        public Car(String brand, int year, String name, String fuel_type) {
            super.setBrand(brand);
            super.setYear(year);
            super.setName(name);
            this.fuel_type = fuel_type;
        }


        void displayinfo() {
            System.out.println("\nHello! Thanks for your interest in " + getBrand()+ ". Below are your car details:"); // Display brand
            System.out.println("Model name: " +getName()+" - "+fuel_type+"\nManufactured in the year: " + getYear()); // Display car info
        }

        // Sports class (inherits Car)
        static class Sports extends Car {
            String speed; // Speed property

            // Sports constructor
            public Sports(String sport_name, int sport_year, String sport_model, String sport_type, String speed) {
                super(sport_name, sport_year, sport_model, sport_type); // Parent constructor
                this.speed = speed; // Set speed
            }

            // Overriding displayinfo method
            @Override
            void displayinfo() {
                super.displayinfo(); // Call parent method
                System.out.print("Speed of the car: " + speed + "\n"); // Display speed info
            }
        }
    }

    static class Truck extends Vehicle {
        private String payload;

        public Truck(String brand, int year, String name, String payload) {
            super.setBrand(brand);
            super.setYear(year);
            super.setName(name);
            this.payload = payload;
        }

        void displayinfo() {
            System.out.println("\nHello! Thanks for your interest in " + getBrand()+ ". Below are your truck details:"); // Display brand
            System.out.println("Model name: " +getName()+"\n"+"Manufactured in the year: " + getYear() + "\nPayload: " + payload); // Display car info
        }
    }

    static class Bike extends Vehicle {
        private String engine;

        public Bike(String brand, int year, String name, String engine) {
            super.setBrand(brand);
            super.setName(name);
            super.setYear(year);
            this.engine = engine;
        }

        void displayinfo() {
            System.out.println("\nHello! Thanks for your interest in " + getBrand()+ ". Below are your bike details:"); // Display brand
            System.out.println("Model name: " +getName()+"\n"+"Manufactured in the year: " + getYear() + "\nEngine type: " + engine); // Display car info
        }
    }
}


// Main class
class MainClass {
    public static void main(String[] args) {
        // Car array (Object initialization)
        Vehicle[] vehicle = new Vehicle[3]; // Car array
        vehicle[0] = new Vehicle.Car("Tata", 2025, "Punch", "EV"); // Create car
        vehicle[1] = new Vehicle.Car("Renault", 2022, "Duster" ,"Petrol"); // Create car
        vehicle[2] = new Vehicle.Car("Mahindra", 2023, "Thar" ,"Petrol"); // Create car

        // SportsCar array (Object initialization)
        Vehicle.Car.Sports[] sportcar = new Vehicle.Car.Sports[1];
        sportcar[0] = new Vehicle.Car.Sports("Porsche",2025,"911","Petrol","330 mph");

        // Display car info (loop)
        for (Vehicle car : vehicle) {
            car.displayinfo(); // Display car info
        }
        // Display sports car info (loop)
        for (Vehicle.Car.Sports sports : sportcar) {
            sports.displayinfo(); // Display sports info
        }


        vehicle[0] = new Vehicle.Truck("Tata", 2025, "Ace","10 Ton"); // Create car
        vehicle[1] = new Vehicle.Truck("Ashok Leyland", 2022, "Dost", "8 Ton"); // Create car
        vehicle[2] = new Vehicle.Truck("Mahindra", 2023, "Bolero","1.5 Ton"); // Create car

        for(Vehicle truck: vehicle){
            truck.displayinfo();
        }


        vehicle[0] = new Vehicle.Bike("Royal Enfield", 2025, "Meteor 350", "Single-Cylinder"); // Create car
        vehicle[1] = new Vehicle.Bike("BMW", 2022, "S 1000 RR" ,"Inline Four"); // Create car
        vehicle[2] = new Vehicle.Bike("Kawasaki", 2023, "Z900" ,"Parallel Twin"); // Create car

        for(Vehicle bike: vehicle){
            bike.displayinfo();
        }
    }
}
