package com.cg.oct12.batch3.day8.comparableInteface;

public class Employee implements Comparable<Employee>{
	int eid;
	String name;
	double salary;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		if(salary == o.salary)
			return 0;
		else if(salary > o.salary)
			return 1;
		else
			return -1;
	}
	
	
}
