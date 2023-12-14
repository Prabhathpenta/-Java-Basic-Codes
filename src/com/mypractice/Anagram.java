package com.mypractice;

import java.util.Arrays;

//change to lowercase
//check length
//convert string to char array
//sort the char array and check with boolean they are same or not

public class Anagram {
	public static void main(String[] args) {
		String s1= "race";
		String s2 = "care";
		
		//Lowecase
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		//length
		if(s1.length() == s2.length()) {
			
			//convert string to char
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			
			//sort the char
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			boolean result = Arrays.equals(charArray1, charArray2);
			if(result) {
				System.out.println(s1 + " and " + s2 + " are anagram  "); 
					
				}else {
					System.out.println("Not anagram");
				}
			}
		}
}
