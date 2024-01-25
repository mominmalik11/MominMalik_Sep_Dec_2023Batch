package com.java.Oct22_OOPs__Objects_InJava;

public class Test_Execution {

	public static void main(String[] args) {
			//I will create the Object of Child Class
		
		
		Child child = new Child();// the constructor will be printed here, 30
		child.superBike();
		child.superCar();
		child.bankBalance();
		child.farmHouse();
		
		

		Child2 child2 = new Child2();// the constructor will be printed here, 30
		child2.bar();
		child2.guitar();
		child2.bankBalance();// this is inherited from the same parents Child is 
		child2.creditUnion();//this is inherited from the grandparent class
		
		
		//create object of Parent Class
		
		Parent parent = new Parent();// the constructor will be printed here, 30
		parent.bankBalance();
		parent.farmHouse();
		
		Grandparent grandparent = new Grandparent();// this is inherited from grandparent to parent to child
		child.creditUnion();
		child.politcalOffice();
		parent.creditUnion(); // parent inheriting from grandparent
		
		
	}

}
