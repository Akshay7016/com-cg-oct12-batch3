package com.cg.oct12.batch3.day4;

public class ThisKeyword {

	static int num1;
	int num2;
	
	static void staticMethod() {
		System.out.println(ThisKeyword.num1);
		ThisKeyword t = new ThisKeyword();
		System.out.println(t.num2);
	}
	
	void nonStaticMethod() {
		System.out.println(ThisKeyword.num1);
		System.out.println(this.num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword.staticMethod();
		
		ThisKeyword obj = new ThisKeyword();
		obj.num2=10;
		obj.nonStaticMethod();
		
		

	}

}
