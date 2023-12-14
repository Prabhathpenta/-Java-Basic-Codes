package com.mypractice;

import java.util.HashMap;
import java.util.Map;

public class firstUniqueCharacter {
	
	public static char  firstUniquechar(String s) {
		
		//Create a Hashmap to store characters frequencies
		Map<Character, Integer> charCount = new HashMap<>();
		
		//count the frequency of each character in the string
		for(char c: s.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0)+1);
		}
		
		//Iterate through the string to find the first unique character
		for(char c: s.toCharArray()) {
			if(charCount.get(c) == 1) {
				return c;
			}
		}
		
		return '#';
		
	}
	
	public static void main(String[] args) {
		String input = "leetcode";
		char result = firstUniquechar(input);
		System.out.println("The first Unique character is : " +result);
	}

}
