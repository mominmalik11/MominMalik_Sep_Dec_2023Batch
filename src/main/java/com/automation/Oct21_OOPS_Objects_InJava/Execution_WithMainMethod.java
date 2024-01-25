package com.automation.Oct21_OOPS_Objects_InJava;

public class Execution_WithMainMethod {

	public static void main(String[] args) {
		//You intend to execute the logic of Dependent Class
		
		Dependent_Without_A_MainMethod.red();//this is used to call static methods from another class
		Dependent_Without_A_MainMethod.blue();
		Dependent_Without_A_MainMethod.green();
		Dependent_Without_A_MainMethod.yellow();
		
		Dependent_Without_A_MainMethod defref = new Dependent_Without_A_MainMethod();//this is how you call non static methods in another class
		defref.pink();
		defref.violet();
		
		
		Execution_WithMainMethod executeWithinSameClass = new Execution_WithMainMethod();
		
		executeWithinSameClass.hello1();
		executeWithinSameClass.hello2();
		executeWithinSameClass.hello3();
		

	}
	
	public void hello1() {
		System.out.println("This is hello1 non static method inside execution class");
	}

	public void hello2() {
		System.out.println("This is hello2 non static method inside execution class");
	}
	
	public void hello3() {
		System.out.println("This is hello3 non static method inside execution class");
	}
}
