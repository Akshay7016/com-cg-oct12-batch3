package com.cg.oct12.batch3.day10.InterfaceDemo;

public class MyImplement implements MyInterface {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello.....");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("Bye....");
	}
	
	public static void main(String[] args) {
		MyImplement obj = new MyImplement();
		obj.sayHello();
		obj.sayBye();
	}
	
	

}
