package com.cg.oct12.batch3.day3;

public class FieldsDemo {
	//static variable
	static int i;
	
	//instance variable
	int j;

	public static void main(String[] args) {
		
		//local variable
		int loc;
		loc = 5;
		System.out.println("Local variable: "+loc);
		
		FieldsDemo fd = new FieldsDemo();
		System.out.println("Static variable: "+FieldsDemo.i);  //default value will be printed
		System.out.println("Instance variable: "+fd.j);
		
		
		

	}

}
