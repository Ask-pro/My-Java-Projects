public class Vehicle{
    String brand; // Instance variable
    int year; // Instance variable
    String type; // Instance variable

    // Parent constructor
    public Vehicle(String brandname, int vehicleyear, String vehicle_type) {
        brand = brandname; // Set brand
        year = vehicleyear; // Set year
        type = vehicle_type; // Set type
    }

    // Display info method
    void displayinfo() {
        System.out.println("Hello! Thanks for your interest in " + brand + ". Below are your car details:"); // Display brand
    }

    // Car class (inherits Vehicle)
    static class Car extends Vehicle {
        String carname; // Car name
        String model; // Model name

        // Car constructor
        public Car(String carname, int caryear, String carmodel, String car_type) {
            super(carname, caryear, car_type); // Parent constructor
            model = carmodel; // Set model
        }

        // Overriding displayinfo method
        @Override
        void displayinfo() {
            super.displayinfo(); // Call parent method
            System.out.println("Manufactured in the year: " + year + "\nModel: " + model+"\n"); // Display car info
        }

        // Sports class (inherits Car)
        static class Sports extends Car{
            String speed; // Speed property

            // Sports constructor
            public Sports(String sport_name, int sport_year, String sport_model, String sport_type, String sport_speed){
                super(sport_name, sport_year, sport_model, sport_type); // Parent constructor
                speed = sport_speed; // Set speed
            }

            // Overriding displayinfo method
            @Override
            void displayinfo() {
                super.displayinfo(); // Call parent method
                System.out.print("Speed of the car: " +speed+ "\n"); // Display speed info
            }
        }
    }
}

// Main class
class MainClass {
    public static void main(String[] args) {
        // Car array (Object initialization)
        Vehicle.Car[] cars = new Vehicle.Car[5]; // Car array
        cars[0] = new Vehicle.Car("Tata", 2025, "Punch", "EV"); // Create car
        cars[1] = new Vehicle.Car("Renault", 2022, "Duster" ,"Petrol"); // Create car
        cars[2] = new Vehicle.Car("Mercedes", 2020, "Benz", "EV"); // Create car
        cars[3] = new Vehicle.Car("Mahindra", 2023, "Thar" ,"Petrol"); // Create car
        cars[4] = new Vehicle.Car("Tata", 2025, "Nexon" ,"Diesel"); // Create car

        // SportsCar array (Object initialization)
        Vehicle.Car.Sports[] sportcar = new Vehicle.Car.Sports[1];
        sportcar[0] = new Vehicle.Car.Sports("Porsche",2025,"911","Petrol","330 mph");

        // Display car info (loop)
        for (Vehicle.Car car : cars) {
            car.displayinfo(); // Display car info
        }

        // Display sports car info (loop)
        for (Vehicle.Car.Sports sports : sportcar) {
            sports.displayinfo(); // Display sports info
        }
    }
}
