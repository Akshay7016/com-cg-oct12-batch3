package com.cg.oct12.batch3.day5.multiThreading;

public class MtDemo extends Thread{
	
	public void myLoop() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
	
	@Override
	public void run() {
		this.myLoop();
	}
	
	public static void main(String[] args) {
		MtDemo o1 = new MtDemo();
		o1.start();
		
		MtDemo o2 = new MtDemo();
		o2.start();
	}

}
