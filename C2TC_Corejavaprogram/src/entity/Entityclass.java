package entity;
import java.util.*;

public class Entityclass {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Entityclass1[] students = new Entityclass1[3];

	        // Collecting student details
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter details for Student " + (i + 1));

	            System.out.print("Enter ID: ");
	            int id = scanner.nextInt();

	            scanner.nextLine(); // Consume newline left-over
	            System.out.print("Enter Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Enter Age: ");
	            int age = scanner.nextInt();

	            students[i] = new Entityclass1(id, name, age);
	            System.out.println();
	        }

	        // Display student details
	        System.out.println("=== Student Details ===");
	        for (Entityclass1 student : students) {
	            student.displayDetails();
	        }

	        scanner.close();
	    }
	
// TODO Auto-generated method stub

	}


