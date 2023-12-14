package com.mypractice;

//sum of first two terms of a given number  

public class FibonacciSeries {
	public static void main(String[] args) {				 //Iteration method
		int num=15;               							 //no.of terms you  want  to generate
		int a = 0, b = 1;		   							// First two terms of the fb series
		
		System.out.println(a + " " + b + " ");					   //0,1,
		
		int nextTerm;     									 //Initialize a variable to store the next term.
		
		for(int i=2; i<num; i++) {							//Step 4: Start a loop to generate and print the rest of the terms.
															// We start from `i = 2` because we've already printed the first two terms.

		nextTerm =a+b;
		a=b;
		b=nextTerm;      									// Step 6: Update `a` to the value of `b` and `b` to the value of `nextTerm`.
		
		System.out.println(nextTerm);					//Ex: nextTerrm =a+b=>0+1=1 i.e-->b=nextTerm=1;  a=b-->a=1;
															//		nextTerrm =a+b=>1+1=2 i.e-->b=nextTerm=2;  a=b-->a=1;
		}
	}
	

}

