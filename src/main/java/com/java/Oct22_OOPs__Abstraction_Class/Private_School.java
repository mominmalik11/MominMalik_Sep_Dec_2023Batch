package com.java.Oct22_OOPs__Abstraction_Class;

public class Private_School extends Student {
	
	public static void main(String[] args) {
		
		Private_School ps= new Private_School();
		
		System.out.println(ps.age=20);
		System.out.println(ps.name = "JohnJohn");
		
		//we cannot create the Object of Abstract Class
		
		//We wil use the Parent Class to refer the Object of Child Class
		
		Student ref = new Private_School();
		//student is the parent abstract class
		//ref is the reference var
		//new Private_School() is the object of the Child Class
		
		//A Parent reference is pointing towards the object of child class
		
		ref.studentMarkSheet();
		ref.studentPlayground();
		ref.studentLibrary();
		
		
	}
public void privateSchoolCourseCurriculum() {
		
		System.out.println("This is the private school's course curriculum");
		}
	
	public void privatePrayerHall() {
		
		System.out.println("This is the private school's prayer hall method");
	}
	@Override
	public void studentMarkSheet() {
		System.out.println("Private school student grades");
	}
	@Override
	public void studentPlayground() {
		System.out.println("Private school playground");
		
	}

}
