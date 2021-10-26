package com.cg.oct12.batch3.day5.encapsulation;

//Encapsulation - 
//bind data members with methods 
//to secure data 
//make fields as private 
//make public methods to access those fields 


//for entity classes, always - 
//create private fields 
//generate default constructor, full-parameterized constructor, getters-setters and toString 

public class Employee {
	private int eid;
	private String name;
	private double salary;    //read only field + writable
	
	public Employee() {
		super();
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	//right click -> source -> generate getters and setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
