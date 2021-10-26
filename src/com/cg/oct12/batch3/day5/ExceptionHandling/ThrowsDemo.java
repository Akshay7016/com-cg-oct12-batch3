package com.cg.oct12.batch3.day5.ExceptionHandling;

//throws only indicates the exception, it not handles the exception

public class ThrowsDemo {
	
	public static int divideNumbers(int dividend, int divisor) throws ArithmeticException{
		return dividend/divisor;
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		try {
			System.out.println(ThrowsDemo.divideNumbers(10, 0));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("End");
		}
	}
}
