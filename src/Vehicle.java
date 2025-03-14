// Parent class
public class Vehicle{
    String brand; // Brand
    int year;     // Year

    public Vehicle(String brandname, int vehicleyear) {
        brand = brandname; // Set brand
        year = vehicleyear; // Set year
    }

    void displayinfo() {
        System.out.println("Hello! Thanks for your interest in " + brand + ". Below are your car details:"); // Info display
    }

    static class Car extends Vehicle {
        String model; // Model

        public Car(String carname, int caryear, String carmodel) {
            super(carname, caryear); // Call parent
            model = carmodel; // Set model
        }

        @Override
        void displayinfo() {
            super.displayinfo(); // Call parent method
            System.out.println("Manufactured in the year: " + year + "\nModel: " + model + "\n"); // Display car info
        }
    }
}

// Main class
class MainClass {
    public static void main(String[] args) {
        Vehicle.Car[] cars = new Vehicle.Car[5]; // Car array
        cars[0] = new Vehicle.Car("Tata", 2025, "Punch"); // Create car
        cars[1] = new Vehicle.Car("Renault", 2022, "Duster"); // Create car
        cars[2] = new Vehicle.Car("Mercedes", 2020, "Benz"); // Create car
        cars[3] = new Vehicle.Car("Mahindra", 2023, "Thar"); // Create car
        cars[4] = new Vehicle.Car("Tata", 2025, "Nexon"); // Create car

        for (Vehicle.Car car : cars) {
            car.displayinfo(); // Display info
        }
    }
}
