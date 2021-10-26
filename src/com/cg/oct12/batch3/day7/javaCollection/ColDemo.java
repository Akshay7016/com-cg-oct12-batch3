package com.cg.oct12.batch3.day7.javaCollection;

import java.util.ArrayList;

public class ColDemo {
	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		
		System.out.println(myList);
		System.out.println(myList.size());
		
		myList.add("aaa");
		System.out.println(myList);
		System.out.println(myList.size());
		
		myList.remove(2);
		System.out.println(myList);
		System.out.println(myList.size());
		
		System.out.println("*********************************");
		
		ArrayList myList2 = new ArrayList();
		myList2.add(22);
		//myList2.add(myList);  //comment out next line
		myList2.addAll(myList);  //comment out previous line -> adds each element of myList as single object
		myList2.add("www");
		
		System.out.println(myList2);
		System.out.println(myList2.size());
	}
}
