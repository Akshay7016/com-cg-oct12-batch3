package com.cg.oct12.batch3.day4;

public class CastingDemo {
	public static void main(String[] args) {
		int i=10;
		char ch='a';
		
		System.out.println(i+ch);
		
		byte b1=10;
		byte b2=20;
		byte b3 = (byte) (b1+b2);
		System.out.println(b3);
	}
}
