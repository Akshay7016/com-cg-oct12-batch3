package com.cg.oct12.batch3.day5.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee e = new Employee(10,"Akshay",5000);
		System.out.println(e.toString());
//		e.salary=10000;   //CE
		
		e.setSalary(10000);
		System.out.println(e.toString());
	}
}
