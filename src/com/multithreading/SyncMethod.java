package com.multithreading;


class BookTickets {
	
	int total_seats=10;
	
	synchronized void SeatsReq(int seats) {
		if(total_seats>=seats) {
			System.out.println( "seats selected :" +seats);
			total_seats=total_seats-seats;
			System.out.println("seats left : " +total_seats);
		} else {
			System.out.println("Required seats are not available");
			System.out.println("there have only :" +total_seats);
		}
		
	}
}

public class SyncMethod extends Thread {
	
	static BookTickets b;                    //'b' is the reference object of "BookTickets" class ----1
	int seats;								 //----3
	
	public void run() {
		b.SeatsReq(seats);                   // ----4
	}
	
	public static void main(String[] args) {
		b= new BookTickets();              //new instance is created-------2
		
		SyncMethod s1=new SyncMethod();
		s1.seats=5;
		s1.start();
		
		SyncMethod s2=new SyncMethod();
		s2.seats=5;
		s2.start();
	}

}
