package com.example;
import java.io.*;

public class FileReadWrite{

    public static void main(String[] args) {
        String fileName = "example.txt";

        // Step 1: Create and write to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("This is the initial content of the file.\n");
            writer.write("Learning file operations in Java is fun!");
            System.out.println("File created and initial content written.");
        } catch (IOException e) {
            System.err.println("Error while writing to the file: " + e.getMessage());
        }

        // Step 2: Read the file contents and print them
        System.out.println("\nReading the initial contents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading the file: " + e.getMessage());
        }

        // Step 3: Append to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("\nThis is the appended content.");
            System.out.println("\nAppended new content to the file.");
        } catch (IOException e) {
            System.err.println("Error while appending to the file: " + e.getMessage());
        }

        // Step 4: Read and print the updated file contents
        System.out.println("\nReading the updated contents of the file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error while reading the updated file: " + e.getMessage());
        }
    }
}
