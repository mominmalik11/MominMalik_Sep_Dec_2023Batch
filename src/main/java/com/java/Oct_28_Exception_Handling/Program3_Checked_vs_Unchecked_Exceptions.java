package com.java.Oct_28_Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program3_Checked_vs_Unchecked_Exceptions {
	
	//Interview Questions:
		//What are CompileTime Exceptions and what are RunTime Exceptions?
		//Exceptions always occur during Runtime. Exceptions never occur at CompileTime
			//RunTime is the period of time when a program is running and generally occurs after CompileTime
			// java --> compile--> class--> execute, Runtime is when you are executing your code and CompileTime when java is compiling
			// CompileTime(checked) exceptions are the exceptions which can be handled or warned by the compiler at Compile Time
			//RunTime(unchecked) exceptions are the exceptions which cannot be handled by the compiler at compile time

	public static void main(String[] args) {
		
		arithmeticExceptionValidation();
		classNotFound();
		fileNotFoundExceptionValidation();
		

	}
	
	public static void fileNotFoundExceptionValidation() {
		//my intention is to handle a particular file in my laptop
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\misfo\\Desktop\\AUTOMATION TRAINING\\eclipse\\abc.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //this file does not exist on my desktop
			//theres a warning here bc you know this file exists, but the oompiler does not know
			// this is a CompilerTime execption because the compiler is warning you about this during the compile time
			// when you get a error message in the console this is known as compile time exception 
		
		
		
		}
	
	public static void classNotFound() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void arithmeticExceptionValidation() {
		int a = 10, b = 0;
		int c = a/b; //Here lies the Exeception...is compiler giving you a warning??? No! This is an exmaple of Runtime exception since compiler
					// cant handle  and is not giving any type of error 
		System.out.println(c);
		
		
		
		
	}
	
	
}
