package com.cg.oct12.batch3.day3;

import com.cg.oct12.batch3.day4.AccessDemo;

public class AccessSampleInAnotherPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AccessDemo.publicMember);
//		System.out.println(AccessDemo.protectedMember);
//		System.out.println(AccessDemo.defaultMember);       ----> Compilation error
//		System.out.println(AccessDemo.privateMember);
	}

}
