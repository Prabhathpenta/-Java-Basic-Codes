package com.mypractice;


public class NumberPalindrome {
	
	public static void main(String[] args) {
		int num = 15051, reverse=0, rem, temp;   //variables initialization
		temp = num;
		
		while (temp!=0)
		{
			rem = temp%10;               	//rem=1
			reverse = reverse*10 + rem;     //reverse = 0+1
			temp /=10;						//1505
		};
		
		
		if(num ==reverse)
			System.out.println(num + " is Palindrome");
		else
			System.out.println(num + " is not Palindrome");
	}

}
