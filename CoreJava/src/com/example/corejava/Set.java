package com.example.corejava;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    // Creating a Logger instance
    private static final Logger logger = LogManager.getLogger(Set.class);

    public static void main(String[] args) {
        // 1. HashSet - Storing unique car brands
        HashSet<String> carBrands = new HashSet<>();
        carBrands.add("Toyota");
        carBrands.add("Ford");
        carBrands.add("BMW");
        carBrands.add("Tesla");
        logger.info("HashSet - Car Brands:");
        for (String carBrand : carBrands) {
            logger.info(carBrand);
        }

        // 2. LinkedHashSet - Storing favorite movie titles (insertion order preserved)
        LinkedHashSet<String> favoriteMovies = new LinkedHashSet<>();
        favoriteMovies.add("Inception");
        favoriteMovies.add("The Dark Knight");
        favoriteMovies.add("The Matrix");
        favoriteMovies.add("Interstellar");
        logger.info("LinkedHashSet - Favorite Movies:");
        for (String movie : favoriteMovies) {
            logger.info(movie);
        }

        // 3. TreeSet - Storing programming languages (sorted order)
        TreeSet<String> programmingLanguages = new TreeSet<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C++");
        logger.info("TreeSet - Programming Languages:");
        for (String language : programmingLanguages) {
            logger.info(language);
        }
    }
}

//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - HashSet - Car Brands:
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Toyota
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Tesla
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Ford
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - BMW
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - LinkedHashSet - Favorite Movies:
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Inception
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - The Dark Knight
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - The Matrix
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Interstellar
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - TreeSet - Programming Languages:
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - C++
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Java
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - JavaScript
//2024-12-26 15:27:18 [main] INFO  com.example.corejava.Set - Python

