package SDMPackage;

import java.util.Scanner;

public class StudentManagementApp {
	 public static void main(String[] args) {
	        Querry studentCRUD = new Querry ();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Student Data Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Student");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                	System.out.print("Enter ID: ");
	                	int id=scanner.nextInt();
	                    System.out.print("Enter Name: ");
	                    String name = scanner.next();
	                    System.out.print("Enter Email: ");
	                    String school = scanner.next();
	                    System.out.print("Enter Department: ");
	                    String branch = scanner.next();
	                    studentCRUD.addStudent(id ,name, school, branch);
	                    break;

	                case 2:
	                    studentCRUD.getAllStudent();
	                    break;

	                case 3:
	                    System.out.print("Enter Student ID to update: ");
	                    int Uid = scanner.nextInt();
	                    System.out.print("Enter New Name: ");
	                    String Uname = scanner.next();
	                    System.out.print("Enter New Email: ");
	                    String Uschool = scanner.next();
	                    System.out.print("Enter New Department: ");
	                    String Ubranch = scanner.next();
	                    studentCRUD.updateStudent(Uid, Uname, Uschool, Ubranch);
	                    break;

	                case 4:
	                    System.out.print("Enter Student ID to delete: ");
	                    int deleteId = scanner.nextInt();
	                    studentCRUD.deleteStudent(deleteId);
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice, try again.");
	            }
	        } while (choice != 5);
	        scanner.close();
	    }
	}

		


