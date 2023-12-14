package com.mypractice;


//t1 is waiting for s2, which t2 holds,||||| and t2 is waiting for s1, which t1 holds.

//The synchronized keyword is used to ensure that only "one thread" can enter a 'synchronized block of code' at a time;=

public class Deadlock {
	String s1="sireesh";
	String s2="laxman";
	
	Thread t1 = new Thread() {
		public void run() {								//t1 override the run method
			while(true) {
				synchronized(s1) {						//s1 is waiting for s2 lock  
					try {
						System.out.println(Thread.currentThread().getName() +" locked "+s1);    //output generated line
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}
				synchronized(s2) {
					System.out.println(Thread.currentThread().getName() +" locked "+s2);
				}
					System.out.println(s1+s2);
				}
				}
				
			}
		};
		Thread t2 = new Thread() {
			public void run() {                           //t2 override the run method
				while(true) {
					synchronized(s2) {                    //s2 is waiting for s1 lock
						
						System.out.println(Thread.currentThread().getName()+" locked "+s2);       	//output generated line
						
						synchronized(s1) {
							System.out.println(Thread.currentThread().getName()+" locked "+s1);
						}
						System.out.println(s1+s2);
					}
					}
					
				}
			};
		public static void main(String[] args) {
			Deadlock obj = new Deadlock();
			obj.t1.start();                             //calling t1
			obj.t2.start();								//calling t2
		}


}
	
