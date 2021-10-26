package com.cg.oct12.batch3.day5.ExceptionHandling;

public class ThrowDemo {
	
	public static void checkEligibity(int age) throws CanNotVoteException {
		if(age<18) {
			//user defined exception
			throw new CanNotVoteException("Can not vote");
		}
		else {
			System.out.println("Vote for India...");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Election...");
		try {
			ThrowDemo.checkEligibity(15);
		} catch (CanNotVoteException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		System.out.println("Thanks...");
	}
}
