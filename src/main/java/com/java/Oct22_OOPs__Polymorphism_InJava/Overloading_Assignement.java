package com.java.Oct22_OOPs__Polymorphism_InJava;


public class Overloading_Assignement {

	public static void main(String[] args) {
		// creat an object out of the class
		
		Overloading_Assignement ref = new Overloading_Assignement();
		
		ref.add();
		ref.add(1,1);
		ref.add(1.1,2.2);
		ref.add("Hello","World");
		
		
		
		
		
		

	}
	
	public int add() {
		int i= 10,  j = 20;
		int k = i+j;
		System.out.println(k);

		return k;
		
	}
	
	public int add(int a, int b) {
		
		int c = a+b;
		System.out.println(c);

		return c;
		
		
	}

	public void add(double a, double b) { //double is for decimal numbers
		double c = a + b;
		System.out.println(c);

		
	}
	
	public void add(String a, String b) {
		String c = a+b;
		System.out.println(c);
		
	}
}
