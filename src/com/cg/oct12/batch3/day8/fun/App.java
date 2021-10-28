package com.cg.oct12.batch3.day8.fun;

//3. abstract method usage - using lambda expression (only with functional interface)
// functional interface -> contains only one abstract method. And may contain one or more default and static methods
public class App{
	public static void main(String[] args) {
		FunIn obj = () -> {
			System.out.println("functionalMethod");
		};
		
		obj.functionalMethod();
	}
}


////2. abstract method usage - by anonymous inner class
//public class App {
//	public static void main(String[] args) {
//		FunIn obj = new FunIn() {    //anonymous inner class
//
//			@Override
//			public void abstractMethod() {
//				System.out.println("abstractmethod");
//				
//			}
//
//			@Override
//			public void anotherAbstractMethod() {
//				System.out.println("anotherAbstractMethod");
//				
//			}
//			
//		};
//		
//		obj.abstractMethod();
//		obj.anotherAbstractMethod();
//	}
//}



/// 1. abstract method usage - by implementing the interface 
//public class App implements FunIn {
//
//	public static void main(String[] args) {
//
//		FunIn.staticMethod();
//
//		App obj = new App();
//		obj.abstractMethod(); // this example 
//		obj.defaultMethod();
//		obj.anotherDefaultMethod();
//
//	}
//
//	@Override
//	public void abstractMethod() { // this example 
//		System.out.println("abstractMethod");
//	}
//}
