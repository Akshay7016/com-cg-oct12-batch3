package com.cg.oct12.batch3.day4;

public class AccessDemo {
	public static int publicMember=10;
	protected static int protectedMember=20;
	static int defaultMember=30;
	static private int privateMember=40;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AccessDemo.publicMember);
		System.out.println(AccessDemo.protectedMember);
		System.out.println(AccessDemo.defaultMember);
		System.out.println(AccessDemo.privateMember);

	}

}
