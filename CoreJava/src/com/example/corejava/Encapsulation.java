package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// Class to demonstrate Encapsulation
class Car2 {
    private static final Logger logger = LogManager.getLogger(Car2.class);

    private String brand;
    private String model;
    private int year;
    private double price;

    // Constructor
    public Car2(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        setYear(year);  // Using setter for validation
        setPrice(price); // Using setter for validation
    }

    // Getter and Setter methods for brand
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter methods for model
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter methods for year
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year > 1885 && year <= 2024) { // Validating year (Cars weren't invented before 1885)
            this.year = year;
        } else {
            logger.warn("Invalid year. Please provide a year between 1886 and 2024.");
        }
    }

    // Getter and Setter methods for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            logger.warn("Price must be positive.");
        }
    }

    // Method to display car details
    public void displayCarInfo() {
        logger.info("Car Brand: " + brand);
        logger.info("Model: " + model);
        logger.info("Year: " + year);
        logger.info("Price: $" + price);
    }
}

public class Encapsulation {
    private static final Logger logger = LogManager.getLogger(Encapsulation.class);

    public static void main(String[] args) {
        // Creating a Car object
        Car2 car = new Car2("Toyota", "Camry", 2022, 24999.99);

        // Displaying initial car details
        logger.info("Initial car details:");
        car.displayCarInfo();

        // Modifying car details using setter methods
        car.setBrand("Honda");
        car.setModel("Civic");
        car.setYear(2023);
        car.setPrice(22999.99);

        // Displaying modified car details
        logger.info("Modified car details:");
        car.displayCarInfo();

        // Attempt to set invalid year and price
        car.setYear(1800);  // This should trigger a warning
        car.setPrice(-5000.00);  // This should trigger a warning
    }
}

//output:
//	2024-12-26 14:06:23 [main] INFO  com.example.corejava.Encapsulation - Initial car details:
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Car Brand: Toyota
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Model: Camry
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Year: 2022
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Price: $24999.99
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Encapsulation - Modified car details:
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Car Brand: Honda
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Model: Civic
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Year: 2023
//		2024-12-26 14:06:23 [main] INFO  com.example.corejava.Car2 - Price: $22999.99
//		2024-12-26 14:06:23 [main] WARN  com.example.corejava.Car2 - Invalid year. Please provide a year between 1886 and 2024.
//		2024-12-26 14:06:23 [main] WARN  com.example.corejava.Car2 - Price must be positive.
