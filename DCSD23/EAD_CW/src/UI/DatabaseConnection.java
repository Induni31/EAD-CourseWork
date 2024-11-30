/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection createDatabaseConnection() {
        Connection con = null; // Declare the Connection object

        try {
            String url = "jdbc:mysql://localhost:3306/registration;"; // Correct database URL
            String username = "root"; // Replace with your username if different
            String password = "0131"; // Replace with your password

            con = DriverManager.getConnection(url, username, password); // Initialize the connection
            System.out.println("Database connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Error establishing connection: " + e.getMessage());
        }

        return con; // Return the connection
    }
}
