package com.cg.oct12.batch3.day3;

class HdfcBank{
	double balance;
	static String ifsc;
	
	void checkBalance() {
		System.out.println("Balance is: "+this.balance);
	}
}

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank hb = new HdfcBank();
		hb.balance=1000;
		hb.checkBalance();
		
		HdfcBank.ifsc = "HDFC00114";
		System.out.println("IFSC: "+HdfcBank.ifsc);
	}

}
