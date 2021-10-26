package com.cg.oct12.batch3.day5.polymorphism;

//polymorphism - 

//one object takes many forms 

//method overloading - compile-time polymorphism 
//method overriding - runtime polymorphism 

public class App {
	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		System.out.println(over.addNumbers(10, 20));
		System.out.println(over.addNumbers(10, 20, 30));
		System.out.println(over.addNumbers(10, 20, 30, 40));
		
		System.out.println();
		
		Child c = new Child();
		c.someMethod();
		
		
	}
}
