package com.java.Oct22_OOPs__Abstraction_Interface_InJava;


public interface Introduction {
	
	int i = 10;
	String name= "Tom";
	
	//final static int i= 10; it can be written this way. Variables assigned in an interface are final and cannot be changed
	
	public abstract void display();
	void display1();// all methods are by default abstract in nature so you do not have to write abstract when creating a method
	abstract void display2();
	public void display3();// all methods are by default abstract in nature so you do not have to write abstract when creating a method
	
	default void check() {
		
	}
	
	private void check1() {
		
	}
	
	public static void check2() {
		
	}
	
	
	

}
