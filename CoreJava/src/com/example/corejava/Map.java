package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(Map.class);

    public static void main(String[] args) {
        // 1. HashMap - Storing book authors and their publication years
        HashMap<String, Integer> bookPublicationYears = new HashMap<>();
        bookPublicationYears.put("J.K. Rowling", 1997);
        bookPublicationYears.put("George Orwell", 1949);
        bookPublicationYears.put("J.R.R. Tolkien", 1954);
        bookPublicationYears.put("Harper Lee", 1960);
        logger.info("HashMap - Book Authors and Publication Years:");
        bookPublicationYears.forEach((key, value) -> logger.info("Author: " + key + ", Year: " + value));

        // 2. LinkedHashMap - Storing fruits and their colors (maintaining insertion order)
        LinkedHashMap<String, String> fruitColors = new LinkedHashMap<>();
        fruitColors.put("Apple", "Red");
        fruitColors.put("Banana", "Yellow");
        fruitColors.put("Grapes", "Purple");
        fruitColors.put("Orange", "Orange");
        logger.info("LinkedHashMap - Fruit Colors:");
        fruitColors.forEach((key, value) -> logger.info("Fruit: " + key + ", Color: " + value));

        // 3. TreeMap - Storing employee IDs and their names (sorted by employee ID)
        TreeMap<Integer, String> employeeDirectory = new TreeMap<>();
        employeeDirectory.put(1021, "Alice");
        employeeDirectory.put(1003, "Bob");
        employeeDirectory.put(1010, "Charlie");
        employeeDirectory.put(1005, "Diana");
        logger.info("TreeMap - Employee Directory:");
        employeeDirectory.forEach((key, value) -> logger.info("Employee ID: " + key + ", Name: " + value));
    }
}

//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - HashMap - Book Authors and Publication Years:
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Author: J.R.R. Tolkien, Year: 1954
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Author: Harper Lee, Year: 1960
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Author: J.K. Rowling, Year: 1997
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Author: George Orwell, Year: 1949
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - LinkedHashMap - Fruit Colors:
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Fruit: Apple, Color: Red
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Fruit: Banana, Color: Yellow
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Fruit: Grapes, Color: Purple
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Fruit: Orange, Color: Orange
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - TreeMap - Employee Directory:
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Employee ID: 1003, Name: Bob
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Employee ID: 1005, Name: Diana
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Employee ID: 1010, Name: Charlie
//2024-12-26 15:24:56 [main] INFO  com.example.corejava.Map - Employee ID: 1021, Name: Alice

