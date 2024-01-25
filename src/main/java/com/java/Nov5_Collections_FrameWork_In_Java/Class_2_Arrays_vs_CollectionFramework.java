package com.java.Nov5_Collections_FrameWork_In_Java;

import java.util.ArrayList;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class Class_2_Arrays_vs_CollectionFramework {

	public static void main(String[] args) {

	}
	
	//Difference 1 - Arrays can store primitive and non primitive type of Data but collection framework can only store non primitive type of data
	
	public static void difference1() {
		
		int[] a= {1,2,3,4,5}; // array storing primitive int data
		
		Class_2_Arrays_vs_CollectionFramework obj1 = new Class_2_Arrays_vs_CollectionFramework();// make objects
		Class_2_Arrays_vs_CollectionFramework obj2 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj3 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj4 = new Class_2_Arrays_vs_CollectionFramework();
		Class_2_Arrays_vs_CollectionFramework obj5 = new Class_2_Arrays_vs_CollectionFramework();

		Class_2_Arrays_vs_CollectionFramework[] ref = {obj1, obj2, obj3, obj4, obj5};// an array storing non primitive Data type
		
		ArrayList a1 = new ArrayList();
		a1.add(10); //10 is an Integer object, non primitive data type
		a1.add("Java");
		a1.add('c');
		a1.add(obj1);
		}
	//Difference 2 - Arrays can store only homogeneous type of data except in some casses like in as it can be typecasted automatically 
		// Collection Framewrk can store heterogeneous type of data

	public static void difference2() {
		int[] a= {1,2,3,4,5};
		int[] a1 = {1,2,'c',3,4,5};// this case the Array can store int and char but only in this case, it cant store int and boolean or float, or double
	
		boolean[] b1 = {true,false, 1<2,2>4};// this array can only store boolean thats it
		
		
		
	}
	//difference 3 - array size is fixed. we cannot increa/decrease size of array during runtime but we can inc/dec the size of collection framework
	// entities during runtime
	
	//difference 4 - Arrays are inbuilt features of java, so algorithms have to be developed by the developer but Collection Framework is an API
	//which mean sthere are already pre-defined Classes and interfaces and methods inside the API that we can directly use it. 

	

}
