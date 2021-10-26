package com.cg.oct12.batch3.day4;

public class WrapperDemo {
	public static void main(String[] args) {
		int a=20;
		Integer b = 30;
		
		String s1="7";
		String s2="5";
		
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		
		int i3 = i1+i2;
		String s3 = Integer.toString(i3);
		System.out.println(s3);
	}
}
