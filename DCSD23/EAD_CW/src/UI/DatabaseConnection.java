
package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection createDatabaseConnection() {
        Connection con = null; // Declare the Connection object

        try {
            String url = "jdbc:mysql://localhost:3306/registration"; 
            String username = "root"; 
            String password = "0131"; 

            con = DriverManager.getConnection(url, username, password); 
            System.out.println("Database connection established successfully.");
        } catch (SQLException e) {
            System.err.println("Error establishing connection: " + e.getMessage());
        }

        return con; 
    }
}
