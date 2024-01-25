package com.automation.Oct21_OOPS_Objects_InJava;

import bsh.This;
import ch.qos.logback.core.encoder.NonClosableInputStream;

public class Static_VS_NonStatic {
	
	static int wheels;
	String name;
	static int rollNumber;
	boolean promotion;
	

	public static void main(String[] args) {
		// static means - it is purely for the class
		//non static means it is purely for the object
		
		//Rules for static
		//Static can only call static
		//static can not call non static
		
		//Rules for nonstatic
		//non static can call non static
		//non static can also call static but not recommended
		
		logic1();// static calling static
		logic3();//static calling static
		wheels = 4;// static calling static
		rollNumber = 101;// static calling static
		
		Static_VS_NonStatic reference = new Static_VS_NonStatic();
		
		reference.logic2();
		reference.logic4();
		reference.promotion = true;
		reference.name="Momin";
		
		
	}
	
	public static void logic1() {
		System.out.println("This is static logic1 method");
		logic3();// logic 1 is static so it can call logic3
		wheels=66;// logic 1 is static so it can call wheels
		
	}
	
	
	public  void logic2() {
		System.out.println("This is non static logic2 method");
		
		logic4(); // non static calling non static
		name = "John";
		logic1();//non static calling static however this is not recommended
		
	}
	
	public static void logic3() {
		System.out.println("This is static logic3 method");
		
		rollNumber = 123;
		
	}
	
	public  void logic4() {
		System.out.println("This is static logic4 method");
		
	}

}
