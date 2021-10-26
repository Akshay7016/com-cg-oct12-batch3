package com.cg.oct12.batch3.day4;

class Employee{
	int id;
	String name;
	double salary;
	
	//Default constructor
	public Employee() {
		System.out.println("Zero parameter constructor");
	}

	//Parameterized constructor       -> right click -> source -> generate constructor using fields
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override     // right click -> source -> generate toString
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	// Overrided method
//	public String toString() {
//		return "blah blah blah";
//	}
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.id=10;
		e1.name="Akshay";
		e1.salary=1000;
		//System.out.println(e1.id+" "+e1.name+" "+e1.salary);
		System.out.println(e1.toString());
		
		Employee e2 = new Employee();
		e2.id=15;
		e2.name="Rohan";
		e2.salary=5000;
		//System.out.println(e2.id+" "+e2.name+" "+e2.salary);
		System.out.println(e2.toString());
		
		Employee e3 = new Employee(15,"Rushikesh",5000);
		//System.out.println(e3.id+" "+e3.name+" "+e3.salary);
		System.out.println(e3.toString());
		
	}

}
