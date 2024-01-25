package com.java.Oct22_OOPs__Objects_InJava;

public class Parent extends Grandparent {
	
	
	private String name = "Joel";
	
	
	
	
	public Parent() {// this is a constructor, it has no return type
		int i = 10;
		int j = 20;
		int k = i+j;
		System.out.println(k);
	}
	
	private void cashBox() { //since this is private that means this can only be used in THIS CLASS, even if you create an object of the parents class elsewhere
		System.out.println("Parents private Cashbox");
	}
	
	
	public void bankBalance() {
		System.out.println("This is parents bank balance");
	}
	
	public void farmHouse() {
		System.out.println("this is parents farmhouse");
		
	}
	
	
		
	}

class Uncle extends Parent{ //this is a nested class and since its nested it also needs to extend in order to be inheritted 
	public void gameZone() {
		System.out.println("unles gamezone");
	}
}



