package com.multithreading;

public class sleepDemo extends Thread  {
	
	public void run()  {
	for(int i=1; i<=5; i++) {
		try {
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		System.out.println(i);
	}
}
	
	public static void main(String[] args) {
	sleepDemo t1 = new sleepDemo();
	t1.start();
	}

} 

/*public class sleepDemo {
	public static void main(String[] args) throws InterruptedException {
	
	
	System.out.println("111");
	Thread.sleep(1000);
	System.out.println(1234);
	Thread.sleep(2000);
	System.out.println(5000);
		
	}
} */
