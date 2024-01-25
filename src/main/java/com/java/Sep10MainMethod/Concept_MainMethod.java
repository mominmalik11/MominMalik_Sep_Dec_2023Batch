package com.java.Sep10MainMethod;

public class Concept_MainMethod {

	public static void main(String[] args) {// interview question:
		// if you swap the words public and static it wont affect anything
		//if you mess with the void keyword then it will mess up
		//main method is the point of execution 
		//main method will always be static because it is related at a class level
		//main method can be overloaded
		//main method will have the public access modifier
		
		System.out.println("Hello World");
		logic1();// step 2 add logic1() main method from bottom up here 
		//like this now both statements will be printed
		
		

	}
	
	public static void logic1() {
		// step 1 lets say you have another main method with very good logic since
		//this isnt part of the main method above the bottom will not be printed
		System.out.println("I wanna use this right here");
		//
	}

}
