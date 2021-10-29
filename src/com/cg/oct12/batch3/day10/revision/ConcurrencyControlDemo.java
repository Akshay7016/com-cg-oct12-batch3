package com.cg.oct12.batch3.day10.revision;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class ConCtrl implements Runnable{
	
//	public List<Integer> list= new ArrayList<>();
	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();   //This class has more advantages than Lists

	@Override
	public void run() {
		System.out.println("RUN");
		for(int i=31;i<=40;i++) {
			this.list.add(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

public class ConcurrencyControlDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("START");
		
		ConCtrl cc = new ConCtrl();
		Thread thread = new Thread(cc);
		thread.start();
		
		for(int i=1;i<=10;i++) {
			cc.list.add(i);
			Thread.sleep(10);
		}
		
		System.out.println(cc.list);
		System.out.println(cc.list.size());
		System.out.println("END");
		
	}
}
