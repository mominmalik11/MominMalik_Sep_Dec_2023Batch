package com.java.Oct_28_Exception_Handling;

public class Program10_Throw_Keyword_Part1 {

	public static void main(String[] args) {
		
		Program10_Throw_Keyword_Part1 prog = new Program10_Throw_Keyword_Part1();
		prog.divideByZero();
		
		

	}
	
	public static void divideByZero() {
		int a = 10, b = 0;
		
		int c = a/b;
		System.out.println(c); // what if you add a throw here
		throw new ArithmeticException(); //here the exception object will be created but the twist is progammer is creating it manually on purpose 
		
		//throw keyword is basically used for Custom/user-defined exceptions
		//Note: Avoid using it for pre-defined exceptions
	}
	
	//divideByZero() will an exception Object and jvm will ask divideByZero() if it can hadle the exception
	//divideByZero will deny the handling of the exception, so  jvm will abruptly terminate divideByZero method
	//now jvm will ask the caller method (main()) method if it will be able to handle the exception or not
	//(main()) will also deny saying it cant handle the exception, so jvm will also terminate the jvm the main method
	//jvm has no choice but to transfer this to DEH will print the Objects in the output console

}
