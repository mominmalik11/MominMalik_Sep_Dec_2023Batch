package com.java.Oct_28_Special_Classes;

import java.util.Scanner;

public class Scanner_Calculator {

	public static void main(String[] args) {

		//I will give you two numbers
		//Add, Subtract, multiply, divide them using scanner class
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int number1 = scan.nextInt();
		
		System.out.println("Enter second number");
		int number2 = scan.nextInt();
		
		System.out.println("Select mathematical operation ( + , - , * , /) ");
		String mathetmaticalOperation = scan.next();
		
		//How many cases are there? 4 ( + , - , * , /)
		//Whatever opertation you choose, you will get a result. That result will be an int since were using int only
		
		int result;
		
		switch(mathetmaticalOperation) {
		
		case "+" : result = number1 + number2;
		System.out.println("The sum of two numbers is :" + result);
		break;
		
		
		case "-" : result = number1 - number2;
		System.out.println("The differnce of two numbers is :" +result);
		break;
		
		case "*" : result = number1 * number2;
		System.out.println("The multiplication of two numbers is :" +result);
		break;
		
		case "/" : result = number1 / number2;
		System.out.println("The division of two numbers is :" +result);
		break;
		
		default: System.out.println("invalid mathetmaticalOperation "); // this is coded just in case there is an invalid mathematical operation
		
			
		
		
		
		
		
		
		}
		
		
		
		
		
	
	}
	
	}


