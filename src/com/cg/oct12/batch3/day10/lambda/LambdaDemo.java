package com.cg.oct12.batch3.day10.lambda;

public class LambdaDemo {
	public static void main(String[] args) {
		FuncInterface obj = str -> str.length();
		
		System.out.println("Lenght of string is: "+obj.strLength("Akshay"));
	}
}
