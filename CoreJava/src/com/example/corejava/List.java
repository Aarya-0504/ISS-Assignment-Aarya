package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;

public class List {
    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(List.class);

    public static void main(String[] args) {
        // 1. ArrayList - Managing a list of fruits
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("Apple"); // List: ["Apple"]
        fruitList.add("Banana"); // List: ["Apple", "Banana"]
        fruitList.add(1, "Orange"); // List: ["Apple", "Orange", "Banana"]
        logger.info("ArrayList of Fruits: ");
        for (String fruit : fruitList) {
            logger.info(fruit); // Logs each fruit in the list
        }

        // 2. LinkedList - Storing a queue of tasks
        LinkedList<String> taskQueue = new LinkedList<>();
        taskQueue.add("Prepare Presentation"); // ["Prepare Presentation"]
        taskQueue.add("Write Code"); // ["Prepare Presentation", "Write Code"]
        taskQueue.add(0, "Attend Meeting"); // ["Attend Meeting", "Prepare Presentation", "Write Code"]
        logger.info("LinkedList of Tasks: ");
        Iterator<String> taskIterator = taskQueue.iterator();
        while (taskIterator.hasNext()) {
            logger.info(taskIterator.next()); // Logs each task in the queue
        }

        // 3. Vector - List of countries in a region
        Vector<String> countryVector = new Vector<>();
        countryVector.add("India"); // ["India"]
        countryVector.add("Pakistan"); // ["India", "Pakistan"]
        countryVector.add("Bangladesh"); // ["India", "Pakistan", "Bangladesh"]
        countryVector.remove("Pakistan"); // ["India", "Bangladesh"]
        logger.info("Vector of Countries: ");
        Iterator<String> countryIterator = countryVector.iterator();
        while (countryIterator.hasNext()) {
            logger.info(countryIterator.next()); // Logs each country in the vector
        }

        // 4. Stack - Managing browser history (using a stack)
        Stack<String> browserHistory = new Stack<>();
        browserHistory.push("www.google.com"); // ["www.google.com"]
        browserHistory.push("www.stackoverflow.com"); // ["www.google.com", "www.stackoverflow.com"]
        browserHistory.push("www.github.com"); // ["www.google.com", "www.stackoverflow.com", "www.github.com"]
        browserHistory.pop(); // Removes "www.github.com"
        browserHistory.push("www.reddit.com"); // ["www.google.com", "www.stackoverflow.com", "www.reddit.com"]
        browserHistory.push("www.linkedin.com"); // ["www.google.com", "www.stackoverflow.com", "www.reddit.com", "www.linkedin.com"]
        browserHistory.pop(); // Removes "www.linkedin.com"
        logger.info("Stack of Browser History: ");
        for (String site : browserHistory) {
            logger.info(site); // Logs each site in the stack
        }
    }
}

//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - ArrayList of Fruits: 
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Apple
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Orange
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Banana
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - LinkedList of Tasks: 
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Attend Meeting
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Prepare Presentation
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Write Code
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Vector of Countries: 
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - India
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Bangladesh
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - Stack of Browser History: 
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - www.google.com
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - www.stackoverflow.com
//2024-12-26 15:21:54 [main] INFO  com.example.corejava.List - www.reddit.com

