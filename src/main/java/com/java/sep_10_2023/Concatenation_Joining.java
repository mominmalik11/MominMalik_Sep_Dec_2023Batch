package com.java.sep_10_2023;

public class Concatenation_Joining {

	public static void main(String[] args) {

		// concatenation represents the joining of two or more operations

		int a = 20;
		int b = 30;

		System.out.println(a + b);
		String S1 = "Hello";
		String S2 = "World";

		System.out.println(a + b + S1 + S2);

		System.out.println(S1 + a + b + S2);
		// the output console shows that a and b concatenated not added the + symbol put
		// them together not adding them up

		String assignment = "ThisyearwasverylittlesnowinMD";
		// We want this long sentence to see this year was very less snow in MD ( with
		// spaces between the words)
		
		System.out.println("This" + " " + "year" + " " + "there" + " " + "was" + " " + "very" + " " + "little" + " " +"snow" + "in" + "MD");

	}

}
