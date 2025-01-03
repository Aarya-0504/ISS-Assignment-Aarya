package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Car3 {
    // Instance variable
    String model;

    // Static variable
    static int numberOfCars = 0;

    // Constructor
    public Car3(String model) {
        this.model = model;
        numberOfCars++;
    }

    // Instance Method
    public void setModel(String model) {
        this.model = model;
    }

    // Static Method
    public static int getNumberOfCars() {
        return numberOfCars;
    }
}

public class VariableTypes {

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(VariableTypes.class);

    public static void main(String[] args) {
        // Local Variables
        String manufacturer = "Tesla";
        int manufacturingYear = 2023;

        logger.info("Local variable manufacturer: " + manufacturer);
        logger.info("Local variable manufacturingYear: " + manufacturingYear);

        // Creating objects of 'Car' class
        Car3 car1 = new Car3("Model S");
        Car3 car2 = new Car3("Model X");

        // Logging instance variables
        logger.info("Car 1 model: " + car1.model);
        logger.info("Car 2 model: " + car2.model);

        // Logging static variable
        logger.info("Number of cars: " + Car3.getNumberOfCars());

        // Modifying instance variable
        car1.setModel("Model S Plaid");
        logger.info("Updated Car 1 model: " + car1.model);
    }
}
//
//2024-12-26 16:09:59 [main] INFO  com.example.corejava.VariableTypes - Local variable manufacturer: Tesla
//2024-12-26 16:09:59 [main] INFO  com.example.corejava.VariableTypes - Local variable manufacturingYear: 2023
//2024-12-26 16:09:59 [main] INFO  com.example.corejava.VariableTypes - Car 1 model: Model S
//2024-12-26 16:09:59 [main] INFO  com.example.corejava.VariableTypes - Car 2 model: Model X
//2024-12-26 16:09:59 [main] INFO  com.example.corejava.VariableTypes - Number of cars: 2
//2024-12-26 16:09:59 [main] INFO  com.example.corejava.VariableTypes - Updated Car 1 model: Model S Plaid

