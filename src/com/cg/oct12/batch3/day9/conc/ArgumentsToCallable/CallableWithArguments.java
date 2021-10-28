package com.cg.oct12.batch3.day9.conc.ArgumentsToCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithArguments {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("Start");
		DemoClass demo = new DemoClass(15);   //Constructor injection
//		demo.setNum(15); //using setter  // Setter injection
		ExecutorService executeService = Executors.newSingleThreadExecutor();
		Future<Integer> future = executeService.submit(demo);
		
		Integer result = future.get();
		System.out.println(result);
		
		executeService.shutdown();
		System.out.println("End");
		
		
	}
}
