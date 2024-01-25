package com.java.Oct22_OOPs__Polymorphism_Method_Overriding;

public class Student extends School  {// inheritance has to be here to use run time polymorphism and override

	public static void main(String[] args) {
		Student student = new Student();
		
		student.education();
		student.mandatoryFees(200);
		}
	
	public void education() {
		System.out.println("This is the child's class education method");
	}
	
	public void mandatoryFees(int i) {
		System.out.println("This is the child's class mandatory fee method");
	}

}
