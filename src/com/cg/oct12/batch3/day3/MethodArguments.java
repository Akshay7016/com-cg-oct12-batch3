package com.cg.oct12.batch3.day3;

public class MethodArguments {
	
	static int addTwoNumbers(int i, int j) {
		return i+j;
	}
	
	static void addTwoAndPrint(int i, int j) {
		System.out.println("Addition is: "+(i+j));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int output = MethodArguments.addTwoNumbers(10, 20);
		System.out.println(output);
		
		System.out.println(MethodArguments.addTwoNumbers(20, 30));
		
		MethodArguments.addTwoAndPrint(5, 5);

	}

}
