package com.java.Oct10_OOPS_Pillar1;

public class Methods_Intro {
	
	//Methods are independent units of execution. Logical units/factories of java coding logic execution
	//What happens in a factory - you have a raw material > Brain > Finished Product
	
	//How many methods are there?
	//1 Concrete method
		//method which has an access modifier, a return type, a body
	//2 Unimplemented method 
	
	

	public static void main(String[] args) {// this is a concrete method; public is the modifier, void is the return type, main is the
		//name of the method
		
	}
	
	
	
	
	public static int adding() {//when you change void to anything else you can return that data,
		//whats the point of returning data
		
		int i=10;
		int j=20;
		int k= i+j;
		System.out.println(k);
		return k; //whats the point of changing void and returning? its so if there is no main method this will still execute.
		// if you need this class for another code it will still execute
		
		
	}
	
	public static String jointThreeStrings() {
		
		String S1 = "my";
		String S2 = " name is";
		String S3 = " Momin Malik";
		String S4 = S1 + S2 + S3;
		System.out.println(S4);
		return S4;
		
	}
	
	public static boolean validateSalaryIncrease() {
		boolean salaryinc2022 = true;
		boolean salaryinc2023 = false;
		int performance = 95;
		int expectation = 100;
		if(performance> expectation) {
			System.out.println("No salary increase");
		}else {
			System.out.println("salary incrase");
		}
		
		boolean expectationFrom2024 = false;
		return expectationFrom2024;
			
		
			
		}
		
	
}

	


