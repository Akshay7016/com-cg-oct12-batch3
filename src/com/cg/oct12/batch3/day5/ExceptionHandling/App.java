package com.cg.oct12.batch3.day5.ExceptionHandling;

import java.util.Scanner;

//exception handling 
//try catch finally throw throws 

//checked exception - is checked by JVM at compile time 
//SqlException 


//unchecked exception - is NOT checked by JVM at compile time 
//ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException

public class App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		System.out.println("Enter another number to divide: ");
		int b = scan.nextInt();
		
		try {
			System.out.println("Division is: "+(a/b));
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Division is not possible");
		}
		
		finally {
			System.out.println("End");
			scan.close();
		}
		
		
	}
}
