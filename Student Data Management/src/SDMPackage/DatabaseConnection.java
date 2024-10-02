package SDMPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	 private static final String URL = "jdbc:mysql://localhost:3306/StdManagement"; // Replace with your DB URL
	    private static final String USER = "root"; // Replace with your DB user
	    private static final String PASSWORD = "Jogannivas@123"; // Replace with your DB password

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USER, PASSWORD);
	    }
}
