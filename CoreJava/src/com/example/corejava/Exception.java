package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
    private static final Logger logger = LogManager.getLogger(Exception.class);

    // Example of a Checked Exception (IOException)
    public void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            logger.info("Read line: {}", line);
        }
        reader.close();
    }

    // Example of an Unchecked Exception (ArrayIndexOutOfBoundsException)
    public void accessArrayElement(int[] array, int index) {
        // This might throw an ArrayIndexOutOfBoundsException
        int element = array[index];
        logger.info("Accessed element: {}", element);
    }

    // Example of an Error (OutOfMemoryError)
    public void causeOutOfMemoryError() {
        // Attempting to create a very large array to cause an OutOfMemoryError
        int[] array = new int[Integer.MAX_VALUE];
        logger.info("Array created with size: {}", array.length);
    }

    public static void main(String[] args) {
    	Exception example = new Exception();

        // Handling Checked Exception (IOException)
        try {
            example.readFile("nonexistentfile.txt");
        } catch (IOException e) {
            logger.error("Checked Exception: IOException occurred", e);
        }

        // Handling Unchecked Exception (ArrayIndexOutOfBoundsException)
        int[] array = {1, 2, 3};
        try {
            example.accessArrayElement(array, 5); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Unchecked Exception: ArrayIndexOutOfBoundsException occurred", e);
        }

        // Handling Error (OutOfMemoryError)
        try {
            example.causeOutOfMemoryError(); // This will likely throw an OutOfMemoryError
        } catch (OutOfMemoryError e) {
            logger.error("Error: OutOfMemoryError occurred", e);
        }
    }
}

//Output:
//	2024-12-26 15:00:24 [main] ERROR com.example.corejava.Exception - Checked Exception: IOException occurred
//	java.io.FileNotFoundException: nonexistentfile.txt (The system cannot find the file specified)
//		at java.base/java.io.FileInputStream.open0(Native Method) ~[?:?]
//		at java.base/java.io.FileInputStream.open(FileInputStream.java:219) ~[?:?]
//		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:159) ~[?:?]
//		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112) ~[?:?]
//		at java.base/java.io.FileReader.<init>(FileReader.java:60) ~[?:?]
//		at CoreJava/com.example.corejava.Exception.readFile(Exception.java:14) ~[bin/:?]
//		at CoreJava/com.example.corejava.Exception.main(Exception.java:41) [bin/:?]
//	2024-12-26 15:00:24 [main] ERROR com.example.corejava.Exception - Unchecked Exception: ArrayIndexOutOfBoundsException occurred
//	java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
//		at CoreJava/com.example.corejava.Exception.accessArrayElement(Exception.java:25) ~[bin/:?]
//		at CoreJava/com.example.corejava.Exception.main(Exception.java:49) [bin/:?]
//	2024-12-26 15:00:24 [main] ERROR com.example.corejava.Exception - Error: OutOfMemoryError occurred
//	java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//		at CoreJava/com.example.corejava.Exception.causeOutOfMemoryError(Exception.java:32) ~[bin/:?]
//		at CoreJava/com.example.corejava.Exception.main(Exception.java:56) [bin/:?]

