package com.mypractice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
	//int number= 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
	    int reverse =0;
	
	while(number != 0) {
		int remainder = number%10;         //123%10 =3
		reverse= reverse*10+remainder;	   // 0*10+3=3   and  3*10+2=32 and 32*10+1=321 
		number=number/10;				   // 123/10=12
	}
		System.out.println(reverse);
	
	}
}
