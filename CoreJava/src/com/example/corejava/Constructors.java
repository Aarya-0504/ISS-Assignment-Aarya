package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Car {
    private static final Logger logger = LogManager.getLogger(Car.class);

    private String brand;
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
        this.year = 0;
        logger.info("Default constructor called: Brand set to '{}', Model set to '{}', Year set to {}", brand, model, year);
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        logger.info("Parameterized constructor called: Brand set to '{}', Model set to '{}', Year set to {}", brand, model, year);
    }

    // Copy constructor
    public Car(Car another) {
        this.brand = another.brand;
        this.model = another.model;
        this.year = another.year;
        logger.info("Copy constructor called: Brand set to '{}', Model set to '{}', Year set to {}", brand, model, year);
    }

    // Overloaded constructor with different parameters
    public Car(String brand, String model) {
        this(brand, model, 2023); // Calling another constructor with default year value
        logger.info("Overloaded constructor with two parameters called: Brand set to '{}', Model set to '{}', Year set to {}", brand, model, year);
    }

    // Method to display car information
    public void displayInfo() {
        logger.info("Car Brand: '{}', Model: '{}', Year: {}", brand, model, year);
    }
}

public class Constructors {
    private static final Logger logger = LogManager.getLogger(Constructors.class);

    public static void main(String[] args) {
        // Create instance using default constructor
        Car car1 = new Car();
        car1.displayInfo();

        // Create instance using parameterized constructor
        Car car2 = new Car("Tesla", "Model S", 2022);
        car2.displayInfo();

        // Create instance using copy constructor
        Car car3 = new Car(car2);
        car3.displayInfo();

        // Create instance using overloaded constructor
        Car car4 = new Car("Ford", "Mustang");
        car4.displayInfo();
    }
}
//Output
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Default constructor called: Brand set to 'Unknown Brand', Model set to 'Unknown Model', Year set to 0
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Car Brand: 'Unknown Brand', Model: 'Unknown Model', Year: 0
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Parameterized constructor called: Brand set to 'Tesla', Model set to 'Model S', Year set to 2022
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Car Brand: 'Tesla', Model: 'Model S', Year: 2022
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Copy constructor called: Brand set to 'Tesla', Model set to 'Model S', Year set to 2022
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Car Brand: 'Tesla', Model: 'Model S', Year: 2022
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Parameterized constructor called: Brand set to 'Ford', Model set to 'Mustang', Year set to 2023
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Overloaded constructor with two parameters called: Brand set to 'Ford', Model set to 'Mustang', Year set to 2023
//2024-12-26 11:48:25 [main] INFO  com.example.corejava.Car - Car Brand: 'Ford', Model: 'Mustang', Year: 2023
