package com.cg.oct12.batch3.day10.revision;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		List<Integer> firstFivePrimeNUmbers = new ArrayList<Integer>();
		firstFivePrimeNUmbers.add(2);
		firstFivePrimeNUmbers.add(3);
		firstFivePrimeNUmbers.add(5);
		firstFivePrimeNUmbers.add(7);
		firstFivePrimeNUmbers.add(11);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<Integer>(firstFivePrimeNUmbers);
		System.out.println(firstTenPrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<Integer>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		System.out.println(nextFivePrimeNumbers);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
		}
}
