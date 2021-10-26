package com.cg.oct12.batch3.day3;

public class Method {
	
	static void m1() {
		System.out.println("m1");
	}
	
	static int num() {
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");
		Method.m1();
		
		int output = Method.num();
		System.out.println(output);
		
		System.out.println(Method.num());

	}

}
