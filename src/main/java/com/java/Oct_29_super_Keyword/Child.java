package com.java.Oct_29_super_Keyword;


public class Child extends Parent {
	
	
	int a = 20;
	
	//parent class constructor can be invoked as well, create a child constructor and enter super

	Child(){
		super();
	}
		
		
	
	
	
	void show(int a) {
		System.out.println(a);//30
		System.out.println(this.a);//20
		System.out.println(super.a);// 10, super will always go to the parent class and find out what it is 
		super.takeAway();// you can use super to directly call method class from parent class
		
		//parent class constructor can be invoked as well, create a child constructor and enter super
		
		}
		
		
		
		
	
public static void main(String[] args) {
	//Create object of the Child class
	
	Child child = new Child();
	child.show(30);
		

		

	}

}
