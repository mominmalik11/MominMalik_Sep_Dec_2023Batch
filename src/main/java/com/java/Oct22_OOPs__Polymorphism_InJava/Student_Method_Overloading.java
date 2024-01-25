package com.java.Oct22_OOPs__Polymorphism_InJava;


public class Student_Method_Overloading {
	
	
	

	public static void main(String[] args) {//this is method overloading, using the same class name but adding parameters to keep being able to use that name
		Student_Method_Overloading student = new Student_Method_Overloading();
		student.name();
		student.name(10);
		student.name(10,11);
		student.name("Momin");
		student.name("Hello, World");
		student.name(new StringBuilder("Tom"));// to invoke a string builder you need to create an object
		student.name(new StringBuffer("Tim"));// to invoke a string buffer you need to create an object
		
	}
	
	
	public void name() {
		System.out.println("This is a simple no argument/parameter method");
	}
	
	public void name(int i) {//normally this method wouldnt work because the class name is the same but if you put info in the bracket
								//youre overloading the method and allowing it to work
		System.out.println("This has one int datatype argument/parameter method");
		
	}
	
	public void name(int i, int j) {
		System.out.println("This is a simple two int datatype arguments/parameters method");
		
	}
	public void name(String S) {
		System.out.println("This is a simple method having one String type argument/parameter");
	}
	public void name(String S, String S2) {
		System.out.println("This is a simple two String type arguments/parameters method");
	}
	public void name(StringBuffer S) {
		System.out.println("This is a simple  StringBuffer type arguments/parameters method");
	}
	public void name(StringBuilder S) {
System.out.println("This is a simple  StringBuilder type arguments/parameters method");
	}






}
