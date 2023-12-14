package com.mypractice;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		int n, fact=1;
		
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
	
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			System.out.println("Factorial of " +n +" is " +fact);
		}
	}

} 
 


/*public class Factorial {
	public static void main(String[] args) {
		int n = 6, fact =1;
			for(int i=1 ; i<=n ; i++)
			{
			fact = fact * i; }
			System.out.println(+n+ " factorial is " +fact); 
	}
} */



