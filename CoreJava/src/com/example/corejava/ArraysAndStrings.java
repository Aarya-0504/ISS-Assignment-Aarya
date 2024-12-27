package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraysAndStrings {
    private static final Logger logger = LogManager.getLogger(ArraysAndStrings.class);

    public static void main(String[] args) {
        // String example: Store name
        String storeName = "Aarya's Bookstore";
        logger.info("Welcome to {}", storeName);

        // Array example: List of available genres
        String[] genres = {"Fiction", "Non-Fiction", "Science", "History", "Fantasy"};
        logger.info("Available Genres:");
        for (String genre : genres) {
            logger.info("Genre: {}", genre);
        }

        // 2D Array example: Inventory of books (rows: genres, columns: count)
        int[][] inventory = {
            {10, 5, 12, 8, 15}, // Fiction
            {7, 9, 10, 6, 4},   // Non-Fiction
            {8, 6, 7, 5, 10}    // Science
        };
        String[] genreNames = {"Fiction", "Non-Fiction", "Science"};

        logger.info("Book Inventory (Genres x Copies):");
        for (int i = 0; i < inventory.length; i++) {
            logger.info("Genre: {}", genreNames[i]);
            for (int j = 0; j < inventory[i].length; j++) {
                logger.info("Copies for {}: {}", genres[j], inventory[i][j]);
            }
        }
    }
}

//Output:
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Welcome to Aarya's Bookstore
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Available Genres:
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Fiction
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Non-Fiction
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Science
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: History
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Fantasy
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Book Inventory (Genres x Copies):
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Fiction
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Fiction: 10
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Non-Fiction: 5
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Science: 12
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for History: 8
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Fantasy: 15
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Non-Fiction
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Fiction: 7
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Non-Fiction: 9
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Science: 10
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for History: 6
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Fantasy: 4
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Genre: Science
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Fiction: 8
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Non-Fiction: 6
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Science: 7
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for History: 5
//	2024-12-26 11:54:14 [main] INFO  com.example.corejava.ArraysAndStrings - Copies for Fantasy: 10
