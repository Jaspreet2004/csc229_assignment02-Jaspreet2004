package com.mycompany.csc229_211review_lab02hw;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class DriverClass {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student std1= new Student("James", (short) 20); // Making a new Student object with the name and age

		System.out.print("Enter GPA for " + std1.getName() + ": "); // Getting the user to give a GPA value for the student
		double GPA = scanner.nextDouble();
		std1.setGPA(GPA);

		System.out.println(std1); // Printing the student information

	}

}