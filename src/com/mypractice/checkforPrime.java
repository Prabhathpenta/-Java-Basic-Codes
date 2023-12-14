package com.mypractice;

//check divisible by 2


public class checkforPrime {
	public static void main(String[] args) {
		int n = 53;
		checkPrime(n);         //This Method will determine if "num" is prime/not 
	}

	private static void checkPrime(int n) {
		int count = 0;
		
	//check for Non-Prime Conditions
		if(n<2) {
			System.out.println("giv num " + n + " is not prime" );
			System.exit(0);
		}
		
	//Loop to Count Divisors
		for(int i = 1; i<=n; i++) {
				if (n % i == 0)    			//53 % 1 is equal to 0, which means 1 is a divisor of 53.
					count +=1;				//count is incremented to 1.
	
			}								//i = 2:
											//53 % 2 is not equal to 0, so 2 is not a divisor of 53.
											//count remains 1.
			if (count>2)
				System.out.println("Giv num " +n+ " is not prime");
			else
				System.out.println("Giv num " +n+ " is prime");
				
			}
		
	}
	
