package com.cg.oct12.batch3.day8.fun;

public class App2 {
//	static int num = 15;
	
	public static void main(String[] args) {
		
//		FunIn2 obj = (int i, int j) -> {
//			return i+j;
//		};
//		System.out.println(obj.getNums(10, 20));
		
		FunIn2 obj = (int i, int j) -> i+j;    //Automatically return value
		int output = obj.getNums(20, 30);
		System.out.println(output);
		
//		FunIn3 obj1 = () -> num;
//		System.out.println(obj1.getNum());
	}
}
