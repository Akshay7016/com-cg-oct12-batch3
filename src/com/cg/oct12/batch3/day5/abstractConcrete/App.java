package com.cg.oct12.batch3.day5.abstractConcrete;

//abstract and concrete 

//interface 

//abstract method - 
//has the keyword abstract 
//has only method signature 
//does not have method body 
//can be defined in abstract class 
//can not be defined in concrete class 
//If class has one abstract method then class need to be declared as abstract

//abstract class 
//has the keyword abstract 
//object can not be created 
//can contain zero or more abstract methods 
//can contain zero or more concrete methods 
//can also contain both 

//interface 
//mainly contain abstract methods 
//from java 8, also contain static and default methods 
//allow multiple inheritance in java 

interface FinanceMinistry{
	public abstract void payInterestOnDeposits();
}

interface StateGovt{
	public abstract void paySalaryToEmployees();
}

abstract class Rbi{
	abstract void doKyc();     //Aadhar, PAN, Voting card
	
	void openAccount() {
		System.out.println("Open account");
	}
	
	void payLoans() {
		System.out.println("Pay loans");
	}
}

class Hdfc extends Rbi implements FinanceMinistry,StateGovt{
	@Override
	void doKyc() {
		System.out.println("Aadhar");
	}

	@Override
	public void paySalaryToEmployees() {
		// TODO Auto-generated method stub
		System.out.println("Salary Paid");
		
	}

	@Override
	public void payInterestOnDeposits() {
		// TODO Auto-generated method stub
		System.out.println("Interest Paid");
		
	}
}

class Icici extends Rbi{
	@Override
	void doKyc() {
		System.out.println("PAN card");
	}
}

public class App {
	public static void main(String[] args) {
		Hdfc h = new Hdfc();
		h.doKyc();
		h.openAccount();
		h.payLoans();
		h.payInterestOnDeposits();
		h.paySalaryToEmployees();
		
		System.out.println("------------------------------");
		Icici i = new Icici();
		i.doKyc();
	}
}
