package com.java.Oct_28_Exception_Handling;

public class Program4_How_to_Handle_Exception {

	public static void main(String[] args) {
		example1();
		

	}
	
	
	public static void example1() {
		
		//in this example we will work with a RunTime/Unchecked Exception
		
		int a = 10, b = 0;
		int c = a/b; // this is where the unchecked exception is taking place
		System.out.println(c);
				
		
		
	}
	
	public static void explanation() {
		//exception occurs in row 17. This line int c= a/b is under example1() method.
		//example1() method will create an object whenever it encounters an Exception
		//this object that is created has 3 things
			//1 Exception Name [it technically has the Class name]
			//2 Description [what type of exception it is]
			//3 StackTrace [tells you which line and method has the exception]
		
		//this object will be passed to the Java Virtual Machine (JVM), JVM will check if it can handle the exception
		//if JVM cannot handle the exception it will pass it on to Default Exception Handler(DEH)
		//but before JVM passes the object to DEH, it will abnormally terminate the program
		//DEH will print the exception
		
		// How to handle this exception manually?
		//By using 5 different keywords a programmer should know
		//1 try
		//2 catch
		//finally
		//throw
		//throws
		
		
		
		
	}

}
