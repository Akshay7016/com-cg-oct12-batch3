package com.cg.oct12.batch3.day5.polymorphism;

//method overriding
class Parent{
	public void someMethod() {
		System.out.println("some method from Parent");
	}
}

class Child extends Parent{
	@Override
	public void someMethod() {
		System.out.println("some method from Child");
	}
}

public class Overriding {
	
	
}
