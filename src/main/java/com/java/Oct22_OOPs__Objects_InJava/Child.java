package com.java.Oct22_OOPs__Objects_InJava;

public class Child extends Parent {//extends allows child class to become child of parent class 
	
	
	public Child() {
		super();// this super represents the constructor of th parent Class
	}
	
	
	public void superBike() {
		System.out.println("Childs super bike");
		
	}
	public void superCar() {
		
		System.out.println("Child's super car");
		
	}
	

}
