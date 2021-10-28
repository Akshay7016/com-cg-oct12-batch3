package com.cg.oct12.batch3.day8.equals;

public class App {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Sonu", 10.5);
		Employee emp2 = new Employee(102, "Monu", 10.6);
		Employee emp3 = new Employee(101, "Sonu", 10.5);

		System.out.println(emp1.equals(emp2));     //hashcodes are compared
		System.out.println(emp1.equals(emp3));	   // contents are checked

//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp3.hashCode());
	}
}
