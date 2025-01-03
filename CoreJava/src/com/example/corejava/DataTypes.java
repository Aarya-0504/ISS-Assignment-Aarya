package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Vehicle {
    String type;
}

public class DataTypes {

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(DataTypes.class);

    public static void main(String[] args) {

        // Demonstrating Different Primitive Data Types
        byte byteValue1 = 12;
        byte byteValue2 = 8;
        byte byteResult = (byte) (byteValue1 - byteValue2);
        logger.info("Byte subtraction result: " + byteResult);

        short shortValue1 = 1000;
        short shortValue2 = 500;
        short shortResult = (short) (shortValue1 * 2 + shortValue2);
        logger.info("Short result: " + shortResult);

        int intValue1 = 50;
        int intValue2 = 3;
        int intResult = intValue1 / intValue2;
        logger.info("Integer division result: " + intResult);

        long longValue1 = 10000L;
        long longValue2 = 30000L;
        long longResult = longValue1 + longValue2;
        logger.info("Long addition result: " + longResult);

        float floatValue1 = 10.5f;
        float floatValue2 = 2.3f;
        float floatResult = floatValue1 * floatValue2;
        logger.info("Float multiplication result: " + floatResult);

        double doubleValue1 = 15.7;
        double doubleValue2 = 3.2;
        double doubleResult = doubleValue1 / doubleValue2;
        logger.info("Double division result: " + doubleResult);

        boolean isAvailable = true;
        logger.info("Boolean value: " + isAvailable);

        char grade = 'A';
        logger.info("Char grade: " + grade);

        // Demonstrating Reference (or Object) Data Types

        // Creating an object of 'Vehicle' class
        Vehicle vehicle = new Vehicle();
        vehicle.type = "Car";
        logger.info("Vehicle type: " + vehicle.type);

        // Creating an object of 'String' class
        String welcomeMessage = "Learning Java is fun!";
        logger.info(welcomeMessage);

        // Creating an array (reference data type)
        int[] numbers = {10, 20, 30, 40};
        logger.info("Array values: ");
        for (int number : numbers) {
            logger.info(number);
        }
    }
}

/*
 * Output:
 * 2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Byte subtraction result: 4
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Short result: 2500
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Integer division result: 16
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Long addition result: 40000
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Float multiplication result: 24.15
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Double division result: 4.906249999999999
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Boolean value: true
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Char grade: A
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Vehicle type: Car
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Learning Java is fun!
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - Array values: 
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - 10
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - 20
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - 30
2024-12-26 11:32:14 [main] INFO  com.example.corejava.DataTypes - 40

 * */
