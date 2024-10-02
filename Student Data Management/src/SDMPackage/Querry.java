package SDMPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Querry {
	    // CREATE
	    public void addStudent( int id ,String name, String school, String branch) {
	        String query = "INSERT INTO student (id ,name,school,branch) VALUES (?,?, ?, ?)";
	        try (Connection conn = DatabaseConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	        	
				pstmt.setInt(1,id);
	            pstmt.setString(2, name);
	            pstmt.setString(3, school);
	            pstmt.setString(4, branch);
	            pstmt.executeUpdate();
	            System.out.println("Learning person added successfully.");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // READ
	    public void getAllStudent() {
	        String query = "SELECT * FROM student";
	        try (Connection conn = DatabaseConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query);
	             ResultSet rs = pstmt.executeQuery()) {
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") +
	                        ", School: " + rs.getString("school") + ", Branch: " + rs.getString("branch"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // UPDATE
	    public void updateStudent(int Uid ,String Uname, String Uschool, String Ubranch) {
	        String query = "UPDATE student SET name = ?, school = ?, branch = ? WHERE id = ?";
	        try (Connection conn = DatabaseConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	        	
	        	pstmt.setString(1, Uname);
	            pstmt.setString(2, Uschool);
	            pstmt.setString(3, Ubranch);
	            pstmt.setInt(4, Uid);
	            		
	            int affectedRows = pstmt.executeUpdate();
	            if (affectedRows > 0) {
	                System.out.println("Learning person updated successfully.");
	            } else {
	                System.out.println("Learner not found.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // DELETE
	    public void deleteStudent(int id) {
	        String query = "DELETE FROM student WHERE id = ?";
	        try (Connection conn = DatabaseConnection.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(query)) {
	            pstmt.setInt(1, id);
	            int affectedRows = pstmt.executeUpdate();
	            if (affectedRows > 0) {
	                System.out.println("Learning person ID has been  deleted successfully.");
	            } else {
	                System.out.println("Learning person not found.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


