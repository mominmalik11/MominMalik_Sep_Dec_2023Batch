package com.java.Oct22_OOPs__Polymorphism_InJava;


public class Automatic_Promotion {

	public static void main(String[] args) {
		
		Automatic_Promotion ref = new Automatic_Promotion();
		ref.display(1);
		ref.display('c');// character is converted to integer
		System.out.println(ref);
		
	

	}
	
	public void display(int i) {
		System.out.println("int parameter method");
	}

}
