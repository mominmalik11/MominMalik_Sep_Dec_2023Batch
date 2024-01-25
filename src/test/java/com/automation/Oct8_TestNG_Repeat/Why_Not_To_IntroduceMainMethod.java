package com.automation.Oct8_TestNG_Repeat;

import org.testng.annotations.Test;

public class Why_Not_To_IntroduceMainMethod {// do not add main method when using TestNG, its basically two alpha males arguing

	public static void main(String[] args) {
System.out.println("This is the main method");
	}
	
	@Test
	public void executionEngine() {
		System.out.println("This is execution engine of TestNG");
		
	}

}
