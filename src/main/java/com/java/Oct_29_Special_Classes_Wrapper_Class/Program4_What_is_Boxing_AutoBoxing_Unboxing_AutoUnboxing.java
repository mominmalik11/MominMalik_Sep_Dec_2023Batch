package com.java.Oct_29_Special_Classes_Wrapper_Class;

import java.util.concurrent.Flow.Publisher;



public class Program4_What_is_Boxing_AutoBoxing_Unboxing_AutoUnboxing {
	
	//the direct parent class of Character and Boolean Wrapper class --> Object class
	//direct parent of other Wrapper classes --> Number class
	
	//Boxing- the conversion of primitive data type to Wrapper Class Object
	//Unboxing- the convesion of Wrapper Class Objects to primitive data type

	public static void main(String[] args) {
		boxingExmaple();
		autoBoxingExample();
		unBoxingExample();
		autoUnBoxingExample();
		

	}
	
	public static void boxingExmaple() {// primitive to Wrapper
		
		int a = 10; // this is a primitive data type, lets conver it or box it 
		
		Integer b = Integer.valueOf(a);
		System.out.println(b);
	}
	public static void autoBoxingExample() {
		
		int a = 10;
		Integer b = a;
		System.out.println(b);// this will be the same output as above
	}
	
	public static void unBoxingExample() {//Wrapper to primitive
		Integer result= 200;
		
	int newresult = result.intValue();
	
	System.out.println(newresult);
		
		
		
	}
	
	public static void autoUnBoxingExample() {
		
		Integer result= 200;
		int newresult = result;
		System.out.println(result);
		
	}

}
