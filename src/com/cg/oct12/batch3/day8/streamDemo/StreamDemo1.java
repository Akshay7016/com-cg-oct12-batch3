package com.cg.oct12.batch3.day8.streamDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		
		//Create list
		
//1.	List<Integer> list1 = List.of(2,4,5,6,7);   //Immutable list
//2.	List<Integer> list2 = Arrays.asList(2,4,5,6,7);  //Immutable list
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		list3.add(87);
		list3.add(41);
		list3.add(90);
		list3.add(154);
		list3.add(250);
		list3.add(47);

		
		//Q) finding even numbers from list
		
		//without stream
		
		List<Integer> evenList = new ArrayList<Integer>();
		for(Integer i: list3) {
			if(i%2==0) {
				evenList.add(i);
			}
		}
		
		System.out.println("Even numbers without stream : "+evenList);
		
		
		//With stream
//		Stream<Integer> stream = list3.stream();
//		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(newList);
		
		List<Integer> newList = list3.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers using stream: "+newList);
		
		
		//Numbers greater than 50
		List<Integer> newList1 = list3.stream().filter(i->i>50).collect(Collectors.toList());
		System.out.println("Numbers greater than 50: "+newList1);
	}
}
