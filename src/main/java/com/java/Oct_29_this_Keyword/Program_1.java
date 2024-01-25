package com.java.Oct_29_this_Keyword;

public class Program_1 {
	
	//this keyword is also a reference var which refers to the object
	
	int i; //this is an instance variable
	
	void setValues(int i) {
		//i = x;// program2 will show the value of 10
		i = i; // this will show 0, because this is a local variable not instance.When you have the same naming convention for both local and inst var
				// and you equate them the compiler gets confused
		
		this.i=i; //if you use this. keyword the compiler wont  get confused with the local var and instance var. This keyword refers to the Current class instance var
				//alone this will refer to the object but if we write this.i refers to the instance variable
		
		
	}
	
	void show() {
		System.out.println(i);
	}

}
