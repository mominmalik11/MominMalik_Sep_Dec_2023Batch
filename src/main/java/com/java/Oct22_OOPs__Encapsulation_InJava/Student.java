package com.java.Oct22_OOPs__Encapsulation_InJava;

public class Student {
	
	private String name; //data hiding
	private int age;//data hiding
	
	
	public void setData(String name, int age) {
		
		this.name = name;// since using the same var as above the compiler will get confused so "this." keyword means only this in class is the var defined 
		this.age = age;
		
	}
	
	public String getData1() {
		return name;
	}
	
	public int getData2() {
		return age;
	}

}
