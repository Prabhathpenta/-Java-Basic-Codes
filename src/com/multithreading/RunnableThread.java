package com.multithreading;

public class RunnableThread implements Runnable {
	
		@Override
		public void run() {
			for(int i =1; i<=5; i++) {
				System.out.println(i);
			}
		}
		
		public static void main(String[] args) {
			RunnableThread obj=new RunnableThread();
			Thread t1= new Thread(obj);
			Thread t2 = new Thread(obj);
			t1.start();
			t2.start();     //output:12345
			
			//t1.run();         //output:12345
			//t2.run();            
			
		}


}
