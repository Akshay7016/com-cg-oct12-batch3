package com.cg.oct12.batch3.day8.streamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		//1. empty / blank stream
		Stream<Object> emptyStream = Stream.empty();
		
		//2. array, object, collection
		
		String names[] = {"Akshay","Rohan","Prasad","Rushikesh"};
		
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e->{
			System.out.println(e);
		});
		
		
		//3. List, Set
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(2);
		list3.add(87);
		list3.add(41);
		list3.add(90);
		list3.add(154);
		list3.add(250);
		list3.add(47);
		
		Stream<Integer> stream2 = list3.stream();
		stream2.forEach(e->{
			System.out.println(e);
		});
	}
}
