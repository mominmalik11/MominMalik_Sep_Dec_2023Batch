package com.java.Oct22_OOPs__Abstraction_Class;

public abstract class Student {// you have to make this abstract to make abstract method below
	
	String name;
	int age;
	
	public void studentLibrary() {
		
		System.out.println("This is a concrete or normal or simple method");
	}
	
	//abstract(undefined/unimplemented) method
	//how do you create a abstract method
		//By using the abstract keyword
		//By not creating the method body
	
	public abstract void studentMarkSheet();// not body in this method so no {} brackets
	
	public abstract void studentPlayground();
	
	

}
