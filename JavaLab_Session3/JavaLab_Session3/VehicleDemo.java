// Demonstrates Inheritance, Method Overriding, and use of 'super' keyword

// Base class: Vehicle
class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display vehicle info
    void displayInfo() {
        System.out.println("🚗 Vehicle Brand: " + brand);
        System.out.println("Top Speed: " + speed + " km/h");
    }
}

// Derived class: Car (inherits Vehicle)
class Car extends Vehicle {
    int doors;

    // Constructor using 'super' to call parent constructor
    Car(String brand, int speed, int doors) {
        super(brand, speed); // calling Vehicle constructor
        this.doors = doors;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo(); // calling parent method
        System.out.println("No. of Doors: " + doors);
    }
}

// Derived class: ElectricCar (inherits Car)
class ElectricCar extends Car {
    int batteryCapacity;

    // Constructor using 'super' to call Car constructor
    ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding displayInfo()
    @Override
    void displayInfo() {
        super.displayInfo(); // calling Car's displayInfo()
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        System.out.println("--------------------------------");
    }
}

// Driver class
public class VehicleDemo {
    public static void main(String[] args) {
        // Creating objects
        Vehicle v = new Vehicle("Tata", 180);
        Car c = new Car("Hyundai", 220, 4);
        ElectricCar e = new ElectricCar("Tesla", 250, 4, 100);

        System.out.println("=== Vehicle Details ===");
        v.displayInfo();

        System.out.println("\n=== Car Details ===");
        c.displayInfo();

        System.out.println("\n=== Electric Car Details ===");
        e.displayInfo();
    }
}
