package com.multithreading;

public class getsetExtends extends Thread{
	@Override
	public void run() {
		//Thread.currentThread().setName("Deepak");
		System.out.println("task:" +Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("thread is:" +Thread.currentThread().getName());
	
		 getsetExtends t1=new getsetExtends();
		 t1.start();
		 
		 getsetExtends t2 = new getsetExtends();
		 t2.setName("Rambo");
		 t2.start();
		 
		 System.out.println(Thread.currentThread().isAlive());
	}

}
