package com.cg.oct12.batch3.day5.ExceptionHandling;

class InvalidVoterException extends Exception{
	public InvalidVoterException(String s) {
		super(s);
	}
}

public class UserDefinedException {
	void checkAge(int age) throws InvalidVoterException{
		if(age<18) {
			throw new InvalidVoterException("Not eligible");
		}
		else {
			System.out.println("Vote for India...");
		}
	}
	
	
	public static void main(String[] args) {
		UserDefinedException ud = new UserDefinedException();
		try {
			ud.checkAge(17);
		}
		catch(InvalidVoterException e) {
			System.out.println("Voter");
			System.out.println(e.getMessage());
		}
	}
}
