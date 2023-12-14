package com.multithreading;

public class Priorities implements Runnable {
	
	@Override
	public void run() {
		
		String name=Thread.currentThread().getName();
		int priority = Thread.currentThread().getPriority();
		
		for(int i =1; i<=5; i++) {
			System.out.println(name   + "("+priority+")"  +"," +i + " has executed");
		}
		
		//System.out.println();
	}
	
	public static void main(String[] args) {
	Priorities obj	=new Priorities();
	
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj);
	t1.setName("rahul");
	t2.setName("Dravid");
	t1.setPriority(1);
	t2.setPriority(10);
	t1.start();
	t2.start();
	System.out.println(Thread.currentThread().getPriority());
	}

}
