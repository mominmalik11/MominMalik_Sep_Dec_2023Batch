package com.java.Oct22_OOPs__Abstraction_Interface_InJava;

public class Test_Execution extends Secret_Money implements Introduction, Conclusion{
	//The test_Execution is the implenting class of Interface Introduction and Conclusion, and has a parent class 

	public static void main(String[] args) {
		
		//we cannot create the object of abstract class
		//Interface is more abstract than abstract class so interface object create is not possible
			// Secret_Money , Introduction, Conclusion cannot have objects created from the class
		
		Introduction intro = new Test_Execution(); //use interface reference to refer to object of implementing class whis is Test_Execution
		
		//how is this concept used in automation?
		//refer to com.automation.Oct22_Application_Of_OOPs_Interface
		
		

	}

	@Override
	public void display() {
		
	}

	@Override
	public void display1() {
		
	}

	@Override
	public void display2() {
		
	}

	@Override
	public void display3() {
		
	}

	@Override
	public void tearDown() {
		
	}

	@Override
	public void tearDown1() {
		
	}

	@Override
	public void tearDown2() {
		
	}

	@Override
	public void blackMoney() {
		
	}

}
