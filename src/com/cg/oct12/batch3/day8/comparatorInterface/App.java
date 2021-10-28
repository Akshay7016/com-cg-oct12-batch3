package com.cg.oct12.batch3.day8.comparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
//		Comparable<T>
		
//		Comparator<T>
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Sonu", 10.6));
		empList.add(new Employee(102, "Monu", 20.6));
		empList.add(new Employee(103, "Tonu", 40.6));
		empList.add(new Employee(104, "Ponu", 30.6));
		
		System.out.println("Before sort: ");
		for(Employee e: empList) {
			System.out.println(e.toString());
		}
		
		
		Collections.sort(empList,new SortBySalary());   // 1st arg -> list to sort
														// 2nd arg -> Create object of class which implements
														// Comparator interface and overrides compare() method

		System.out.println("After sorting: ");
		for(Employee e: empList) {
			System.out.println(e.toString());
		}

//		List<Integer> list = new ArrayList<>();     //Possible as List can be casted into LinkedList, Stack
//		System.out.println(list);
//		list = new LinkedList<>();
//		list = new Stack<>();
//
//		ArrayList<Integer> list2 = new ArrayList<>();   //Not possible as ArrayList cannot be casted into LinkedList
//		System.out.println(list2);
//   	list2 = new LinkedList<>();
	}
}
