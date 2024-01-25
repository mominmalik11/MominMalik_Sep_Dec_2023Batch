package com.java.Oct22_OOPs__Polymorphism_InJava;

public class Can_The_MainMethod_Be_Overloaded {

	public static void main(String[] args) {
		//INTERVIEW QUESTION
		// Can the main method be overloaded?
		//It is possible

		main(10);
		main(args = new String[3], args = new String[4]);
		
	}
	
	public static void main(int i) {
		
		
		System.out.println(200 + 200);
		
		
		
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("This is the overloaded main method with 2 String [] args");
		
		
		
	}

}
