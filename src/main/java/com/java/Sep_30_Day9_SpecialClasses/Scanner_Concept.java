package com.java.Sep_30_Day9_SpecialClasses;

import java.util.Scanner;

public class Scanner_Concept {
	
	//scanner class is a predefined class in java
			// Use of Scanner Class- it helps ackknowledge user input
			//Scanner class has a lot of inbuilt methods - next() nextint() nextLong()

	public static void main(String[] args) {
		
		//Create object of scanner class and you have to pass the System.in as the input parameter inside the Contructor
		
		Scanner scan = new Scanner(System.in); //System.in just means input
		
		System.out.println("Enter Name");
		String name = scan.next();
		
		System.out.println("Enter Gender");
		// M or F - one entity means you can store it as a character 
		char gender = scan.next().charAt(0);
		
		System.out.println("Enter age");
		int age = scan.nextInt();
		
		System.out.println("Enter Phone Number ");
		long phoneNumber = scan.nextLong();
		
		System.out.println("The name of the person is " + name);
		System.out.println("The gender of the person is " + gender);
		System.out.println("The age of the person is " + age);
		System.out.println("The phone number of the person is " + phoneNumber);



		
		
		
		
		
	}

}
