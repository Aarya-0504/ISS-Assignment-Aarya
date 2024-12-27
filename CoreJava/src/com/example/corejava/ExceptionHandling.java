package com.example.corejava;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExceptionHandling {

    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(ExceptionHandling.class);

    public static void main(String[] args) {
        // Handling NumberFormatException
        String invalidNumber = "123a";
        try {
            int number = Integer.parseInt(invalidNumber);
            logger.info("Parsed number: " + number);
        } catch (NumberFormatException e) {
            logger.error("NumberFormatException thrown: ", e);
            writeToFile("NumberFormatException: " + e.getMessage());
        } finally {
            logger.info("Finished attempting to parse number.");
        }

        // Handling ArithmeticException
        try {
            int result = 10 / 0;
            logger.info("Result of division: " + result);
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException thrown: ", e);
            writeToFile("ArithmeticException: " + e.getMessage());
        } finally {
            logger.info("Attempted division operation.");
        }

        // Handling FileNotFoundException and IOException for a properties file
        FileInputStream file = null;
        String fileName = "config.properties";
        try {
            file = new FileInputStream(fileName);
            int data = file.read();
            logger.info("First byte of the properties file: " + data);
        } catch (FileNotFoundException f) {
            logger.error("FileNotFoundException: ", f);
            writeToFile("FileNotFoundException: " + f.getMessage());
        } catch (IOException i) {
            logger.error("IOException: ", i);
            writeToFile("IOException: " + i.getMessage());
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException i) {
                    logger.error("IOException while closing the file: ", i);
                    writeToFile("IOException while closing the file: " + i.getMessage());
                }
            }
            logger.info("File handling operation completed.");
        }
    }

    // Helper method to write exception details to a file
    private static void writeToFile(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("exceptions_log.txt", true))) {
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            logger.error("Error writing to file: ", e);
        }
    }
}

//Output:
//	2024-12-26 15:03:34 [main] ERROR com.example.corejava.ExceptionHandling - NumberFormatException thrown: 
//		java.lang.NumberFormatException: For input string: "123a"
//			at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67) ~[?:?]
//			at java.base/java.lang.Integer.parseInt(Integer.java:588) ~[?:?]
//			at java.base/java.lang.Integer.parseInt(Integer.java:685) ~[?:?]
//			at CoreJava/com.example.corejava.ExceptionHandling.main(ExceptionHandling.java:15) [bin/:?]
//		2024-12-26 15:03:34 [main] INFO  com.example.corejava.ExceptionHandling - Finished attempting to parse number.
//		2024-12-26 15:03:34 [main] ERROR com.example.corejava.ExceptionHandling - ArithmeticException thrown: 
//		java.lang.ArithmeticException: / by zero
//			at CoreJava/com.example.corejava.ExceptionHandling.main(ExceptionHandling.java:26) [bin/:?]
//		2024-12-26 15:03:34 [main] INFO  com.example.corejava.ExceptionHandling - Attempted division operation.
//		2024-12-26 15:03:34 [main] ERROR com.example.corejava.ExceptionHandling - FileNotFoundException: 
//		java.io.FileNotFoundException: config.properties (The system cannot find the file specified)
//			at java.base/java.io.FileInputStream.open0(Native Method) ~[?:?]
//			at java.base/java.io.FileInputStream.open(FileInputStream.java:219) ~[?:?]
//			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:159) ~[?:?]
//			at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112) ~[?:?]
//			at CoreJava/com.example.corejava.ExceptionHandling.main(ExceptionHandling.java:39) [bin/:?]
//		2024-12-26 15:03:34 [main] INFO  com.example.corejava.ExceptionHandling - File handling operation completed.

