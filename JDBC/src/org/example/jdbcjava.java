package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcjava {
    public static void main(String[] args) {
        // Database URL, username, and password
        String jdbcURL = "jdbc:mysql://localhost:3306/aarya";
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        // Establish a connection
        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            System.out.println("Connected to the database!");

            // Create a Statement object
            Statement statement = connection.createStatement();

            // Execute a query
            String sql = "SELECT * FROM employees";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process the ResultSet
            System.out.println("Employees:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                double salary = resultSet.getDouble("salary");

                System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Output:
//	Connected to the database!
//	Employees:
//	ID: 1, Name: Alice, Department: HR, Salary: 50000.0
//	ID: 2, Name: Bob, Department: IT, Salary: 60000.0
//	ID: 3, Name: Charlie, Department: Finance, Salary: 55000.0
