package com.TestNG.Sep30;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	
	
	@Test
	public void hardAssert() {
		
		//Hard Assert - if at a particular line within the TestCase or within the Logic, Assert fails
		// other lines of code after failure of Assertion will not execute
		
		int i=1;
		int j=2;
		
		//Assert.assertTrue(i == j ); // this is failing
		Assert.assertTrue( i != j); // this is passing
		
		
		int a = 3;
		int b = 2;
		System.out.println(a+b); // 5 will not get printed because the assertion above it is false
		
		
	}
	
	@Test
	public void softAssert() {
		SoftAssert softassert = new SoftAssert(); //Step 1 declare soft assert
		int i=1;
		int j = 2;
		
		softassert.assertTrue( i==j); // this condition is false
		int a = 3;
		int b = 2;
		System.out.println(a+b);
		
		softassert.assertAll(); // this code will execute becuase softassert does not override code if incorrect, dont
		//forget to code this line, it means it is acculumulated all kinds of assertaion failures
		
	}

}
