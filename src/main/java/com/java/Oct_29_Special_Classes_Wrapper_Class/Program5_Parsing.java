package com.java.Oct_29_Special_Classes_Wrapper_Class;

public class Program5_Parsing {
	
	//Parsing means converting a String representation into its corresponding data type

	public static void main(String[] args) {

		
		stringToDouble();
		stringToBoolean();
	}
	
	//Integer Parsing
	public static void stringToInteger() {
		
		
		String price1 = "450"; // what if you want to add theses two? you cant because theyre strings, you need to convert them to integers first
		String price2 = "250";
		//Total price???
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		System.out.println(p1+p2);
		}
	
	
	
	//Double Parsing
	
	public static void stringToDouble() {
		
		String price1 = "10.25";
		String price2 = "4.75";
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println(p1 + p2);
		
		
	}
	
	//Boolean Parsing
	
	public static void stringToBoolean() {// create string values first
		
		String result1 = "true";
		String result2 = "false";
		
		boolean gotPromotion = Boolean.parseBoolean(result1);
		boolean denyPromotion = Boolean.getBoolean(result2);
		
		System.out.println(gotPromotion==denyPromotion);
		
		
		
		
	}
	
	//Character Parsing
	
	public static void stringToCharacter() {// string cannot be parsed into character without the arraylist
		
		
		
	}
	
	//Long Parsing

}
