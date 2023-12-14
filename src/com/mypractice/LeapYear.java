package com.mypractice;


import java.util.Scanner;

// ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))

public class LeapYear {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int year = sc.nextInt();
		
		
		 //int year = 2008;
		//System.out.println("Enter the year :" +year);
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println(year+ " is a leap year ");
		} else {
			System.out.println("Not a leap year");
		}
	}

}
