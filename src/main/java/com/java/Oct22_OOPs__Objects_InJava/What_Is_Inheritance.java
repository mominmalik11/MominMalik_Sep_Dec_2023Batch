package com.java.Oct22_OOPs__Objects_InJava;

public class What_Is_Inheritance {
	
	//you are an offspring, you will inherit your parents property
	//in java you can make a child class and a parent class
	//the child class will inherit the properties of the parent class
	
	//Inheritance is inheriting the properties of the parent class into the child class
	// in java it is the mechanism in which in one object(child) acquires all the properties and behaviors of a parent object
	
	//Inheritance represents the IS-A relationship which is also known as a parent-child relationship
	// Dog IS-A animal (animal is the parent class)
	//Truck IS-A vehicle
	//Surgeon IS-A doctor
	
	//What are the advantages of inheritance?
	//1 Code reusability
	//2 it promotes runtime polymorphism by allowing method overriding
	
	//Disadvantages;
	// The parent and child classes get tightly coupled
	
	//Inheritance is achieved by using the 'extends' keyword
	
	//What does not part in heritance?
	//1 Constructor
	//	A child class can inherit all the members(fields, methods,nested class) from its parents class. Constructors are not members, so they are not inherited.
		//But the constructor of the parent class can be invoked from the child class
	
	//2 Private Members
	//	Private members are not inherited from the parent class, however if the parent class is public or protected methods (like getters and setters) for accessing
	//	its private fields, these can be used by child class
	
	//Note: there can only be one parent class, Java does not support multiple inheritance
	//Note: Parent class is known as super class and child class is known as sub class
	
	//Types of inheritance
	//1 Single inhertiance - one child class extends one parent class
	//2 Multilevel inheritance - one child class extends one parent class which extends grandparent class
	//3 Heirarchial inheritance - one child class is inherited by multiple child classes


	//HW how can Child class inherit nested Class of Parent

}



