package com.mypractice;

import java.util.Scanner;

public class SqrtNumber {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 
		 //Read a number from the user
			//int number = sc.nextInt();	
		 
		 double number = sc.nextDouble() ;
			
		 
		//calculate the sqrt 
		// int squareRoot =  (int) Math.sqrt(number);
		 
		double squareRoot = Math.sqrt(number);
		 
		
			System.out.println("sqrt of " +number+ " is " +squareRoot );
		
		 
	}

}
