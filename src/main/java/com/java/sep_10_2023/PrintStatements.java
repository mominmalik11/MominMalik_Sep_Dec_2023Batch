package com.java.sep_10_2023;

public class PrintStatements {

	public static void main(String[] args) {

		System.out.println("the grass is green my dude, keep pushing"); //println() is a method and ln means new line
		System.out.println(1+2);
		System.out.println(1> 456); // != means not equals sign
		
		System.out.println("the sky is blue");
		System.out.print("rose is red"); 
		// ln is taken out so no new line is made and next print output is on same line
		System.out.println("buffalo is black");
		
		int a = 15;
		int b = 15;
		
		System.out.print("The sum of these two variables is :");
		System.out.println(a+b); // we made a sentence before the answer printed
		
		// or you could concatenate (join two operations)
		
		System.out.println("The sum of these lovely two numbers is : " + (a+b));
		
		// another way is to create a sum
		
		int sum = a+b;
		
		System.out.println("The sum of these lovely two numbers is : " + sum);
		
	

	}

}
