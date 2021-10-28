package com.cg.oct12.batch3.day9.conc.ArgumentsToCallable;

import java.util.concurrent.Callable;

public class DemoClass implements Callable<Integer>{
	
	private int num;

	public DemoClass() {
		super();
	}

	public DemoClass(int num) {
		super();
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int localVariable = this.num;     //As we don't have option to pass arguments to call
		//method. So use constructor, getters and setters to initialize instance variables.
		return localVariable;  
	}

}
