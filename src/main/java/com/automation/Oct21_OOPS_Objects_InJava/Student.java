package com.automation.Oct21_OOPS_Objects_InJava;

public class Student {

	
	//public Employee() {// this is a constructor, it looks like a method but doesnt have a return type ie void, int, string, object [][] etc}
	
	String name ="Tom"; // what is the default value of String?? null
	int age = 10;// what is the default value of an int? 0
	boolean promotion = true;// the default value of boolean is false
	
	String classRoomEnrollment = "4B";
	String primarySubject = "Science";
	
	public Student(String name, int age, boolean promotion,String classRoomEnrollment, String primarySubject) {
		
		this.name = name;
		this.age = age;
		this.promotion = promotion;
		this.classRoomEnrollment = classRoomEnrollment;
		this.primarySubject = primarySubject;
		
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		//Student student = new Student();//object has been created
		//a constructor is invoked the moment the object is created. Employee() is the constructor 
		
		//System.out.println(student.name);
		//System.out.println(student.age);
		//System.out.println(student.promotion);
		//System.out.println(student.classRoomEnrollment);
		//System.out.println(student.primarySubject);
		
		//this isnt the most efficient way if there are 10000 students
		
		Student student1= new Student("John", 10, true, "4B", "Science");
		// you created an Object and passed the parameters (student info in constructor)
		//But have you manually invoked the constructor yet? No
		
		System.out.println(student1.name + "---" + student1.age + "---" + student1.promotion + "---" + student1.classRoomEnrollment + "----" + student1.primarySubject);
		
		
	}
	





}
		
	


