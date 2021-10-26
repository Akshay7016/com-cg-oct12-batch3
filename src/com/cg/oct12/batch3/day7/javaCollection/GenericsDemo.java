package com.cg.oct12.batch3.day7.javaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo {
	public static void main(String[] args) {
		
//		ArrayList myMarks = new ArrayList();
//		myMarks.add(10);
//		myMarks.add(10.5);
//		myMarks.add("abc");
//		System.out.println(myMarks);
//		
//		Iterator it = myMarks.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		ArrayList<Integer> myMarks = new ArrayList<>();
		myMarks.add(10);
		//myMarks.add("abc");
		//myMarks.add(10.5);
		myMarks.add(20);
		
		System.out.println(myMarks);
		
	}
}
