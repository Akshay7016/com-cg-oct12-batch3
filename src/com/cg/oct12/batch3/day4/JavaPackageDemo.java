// java.lang    -> import not required
//java.util     -> import required

package com.cg.oct12.batch3.day4;

import java.util.Random;
import java.util.Scanner;

public class JavaPackageDemo {
	public static void main(String[] args) {
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//random number
		Random random = new Random();
		System.out.println(random.nextInt());
		
		//Fully Qualified Name(FQN)
		java.util.Random r = new java.util.Random();
		System.out.println(r.nextDouble());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		System.out.println("Name is: "+name);
	}
}
