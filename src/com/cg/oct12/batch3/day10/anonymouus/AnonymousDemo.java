package com.cg.oct12.batch3.day10.anonymouus;

public class AnonymousDemo {
	public static void main(String[] args) {
		
		//Anonymous class
		MyInter obj = new MyInter() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("Hello.....");
			}
			
			@Override
			public void sayBye() {
				// TODO Auto-generated method stub
				System.out.println("Bye......");
			}
		};
		
		obj.sayHello();
		obj.sayBye();
	}
}
