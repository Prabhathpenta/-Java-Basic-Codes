package com.multithreading;

class match1 extends Thread {
	public void run() {
		try {
			System.out.println("ind vs eng match starts at 9am");
			Thread.sleep(2000);
			System.out.println("ind vs eng completed 2pm");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	


class match2 extends Thread {
	public void run() {
		try {
			System.out.println("pak vs nzl match starts at 10am");
			Thread.sleep(3000);
			System.out.println("pak vs nzl completed 3pm");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	


class match3 extends Thread  {
	public void run() {
		try {
			System.out.println("Aus vs SA match starts at 11am");
			Thread.sleep(4000);
			System.out.println("Aus vs SA completed 4pm");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}



public class JoinDemo {
	public static void main(String[] args) throws InterruptedException{
		match1 m1 = new match1();
		m1.start();
		m1.join();
		
		match2 m2 = new match2();
		m2.start();
		m2.join();
		
		match3 m3 = new match3();
		m3.start();
		m3.join();
	}

}

