package com.cg.oct12.batch3.day10.lambda;

public class MultiThreading {

	public static void main(String[] args) {
		// Lambda expression

		Runnable thread1 = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Value of i: " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread t = new Thread(thread1);
		t.setName("Akshay");
		t.start();
	}
}
