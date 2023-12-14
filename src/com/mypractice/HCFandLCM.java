package com.mypractice;

public class HCFandLCM {
	public static void main(String[] args) {
		int a=12,b=18;
		
		int HCF = findHCF(a,b);
		int LCM = a*b/ HCF;
		
		System.out.println("The numbers is " +a+ " and " +b );
		System.out.println("HCF is " + HCF );
		System.out.println("LCM is " + LCM );
	}

	private static int findHCF(int a, int b) {
		if(b==0) {
			
		return a;
	}
		return findHCF(b, a%b);
	}
	
}
