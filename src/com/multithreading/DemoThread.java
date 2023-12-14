package com.multithreading;

public class DemoThread extends Thread {
	@Override
	public void run() {
		for(int i =1; i<=5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		DemoThread obj=new DemoThread();
		Thread t= new Thread(obj);
		t.start();
		}
	}
