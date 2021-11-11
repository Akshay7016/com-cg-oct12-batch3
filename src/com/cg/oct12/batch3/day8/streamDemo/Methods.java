package com.cg.oct12.batch3.day8.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {
	public static void main(String[] args) {
		
		//filter() demo
		//names starts with A in list
		List<String> names = new ArrayList<String>();
		names.add("Akshay");
		names.add("Ankit");
		names.add("Aman");
		names.add("Durgesh");
		
		List<String> newList =names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(newList);
		
		
		//map() demo
		
		//Q) Square of all numbers in list
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		
		List<Integer> newNumbers = numbers.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(newNumbers);
	}
}
