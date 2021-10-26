package com.cg.oct12.batch3.day3;

public class MethodDemo {
	
	//static -> free access
	static void hello() {
		System.out.println("Hello World");
	}
	
	//non static -> restricted access
	void hi() {
		System.out.println("Hi!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		MethodDemo.hello();  //can call without class name
		
		MethodDemo obj = new MethodDemo();
		obj.hi();
		System.out.println("End");
	}

}
