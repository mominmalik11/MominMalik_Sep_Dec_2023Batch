package com.java.Oct_29_this_Keyword;

public class Program4 {
	
	//Use 2 - this keyword can be used to invoke current class method (implicity)

	
		void display() {//this is a current class
			System.out.println("hello");
			
			
		}
		
		void show() {
			display();
			this.display();
			//even if you do not use .this keyword the compiler automatically adds this keyword while invoking the method
			// hence both display() and this.display() work the same
		}

	public static void main(String[] args) {
		
		Program4 prog = new Program4();
		
		prog.show(); //once this is called itll go to show method which is calling the display method which syso "hello"

	}

}
