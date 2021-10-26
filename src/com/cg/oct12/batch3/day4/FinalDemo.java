package com.cg.oct12.batch3.day4;

public class FinalDemo {
	
//	private static final int numberOfOvers=20;
	private static final int NUMBER_OF_OVERS=20;
	
	
	private static final int NUM1=10;
	private static int num2=20;
	
	public static void main(String[] args) {
		System.out.println(FinalDemo.NUM1);
		System.out.println(FinalDemo.num2);
		
		//FinalDemo.num1=50;   //Compilation error -> as final members cannot be change
		FinalDemo.num2=60;
		
		System.out.println(FinalDemo.NUM1);
		System.out.println(FinalDemo.num2);
		
		System.out.println(FinalDemo.NUMBER_OF_OVERS);
	}

}
