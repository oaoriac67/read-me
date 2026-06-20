package ChapterTasks;

class Vehicle {
    String make;
    String model;
    int year;

    // Constructor for Vehicle
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    // Constructor for Car (includes inherited attributes)
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        // Create an instance of Car
        Car car = new Car("Toyota", "Camry", 2022, 4);

        // Display car details
        car.displayDetails();
    }
}
