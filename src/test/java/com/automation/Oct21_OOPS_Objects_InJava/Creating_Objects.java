package com.automation.Oct21_OOPS_Objects_InJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Creating_Objects {

	// name of the class is Creating_Objects
	// Instance of a class; object lives inside the class
	
	String name;// instance variable
	int rollNumber;// instance variable
	boolean promotion;// instance variable

	//these three are non static entities because the class above does not have static written
	public static void main(String[] args) throws Exception {
		
		

		Creating_Objects reference = new Creating_Objects();// the text in green is the new object that you have
															// created. the text in dark blue is the class
		// the "reference" on top is not part of the object it is the reference variable

		Properties properties = new Properties();// another example, this class can be instantiated so you can create an
													// object out of the class

		//System system = new System();// however some classes cannot be instanstiated, like this you cannot create an
										// object out of this class

		//FileInputStream ipFileInputStream = new FileInputStream("");// this cannot remain empty it needs a directory
																	// path in the bracket

		// How many objects of a class can you create?
		// Inumerable, you just have to change the reference variable

		Creating_Objects reference1 = new Creating_Objects();// the reference has been changed
		Creating_Objects reference2 = new Creating_Objects();
		Creating_Objects reference3 = new Creating_Objects();

		// Java defines Object are a collection of non static entities of the Class
		
		logic2();//this is a static method
		reference.logic1();// this is a non static method in order to use it in a static method you need to recall the reference above
		reference.name = "Momin";
		reference.rollNumber = 101;
		reference.promotion = true;
		reference.logic2();// Will this work? Yes this will work we can also use the reference to call static entities. This is not recommended as
		// static entities can we called directly as written above

	}
	
	
	public void logic1() {//non static method since static isnt wrtten,
		
	System.out.println("this is logic 1 a non static method that can be executed in a static main method using a reference");
	
		
	}
	
	public static void logic2() {// this is a static method,  you can put it in the main method since thats static too
		System.out.println("This is logic 2 static method");
		
		
	}

}