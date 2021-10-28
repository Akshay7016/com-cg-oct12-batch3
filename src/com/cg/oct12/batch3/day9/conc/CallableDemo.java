package com.cg.oct12.batch3.day9.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo implements Callable<Integer>{
	public int getNum() {      //Business method
		int total = 0;
		for (int i = 1; i < 10; i++) {
			total = total + i;
		}
		return total;
	}

	@Override
	public Integer call() throws Exception {
		return getNum();
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableDemo cd = new CallableDemo();
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future<Integer> future = executorService.submit(cd);
		
		Integer result = future.get();
		System.out.println(result);
		
		executorService.shutdown();
	}
	
	
}
