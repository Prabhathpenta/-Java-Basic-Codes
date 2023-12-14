package com.mypractice;

import java.util.Arrays;
import java.util.Collections;


public class ReversinganOrderofWords {
	public static void main(String[] args) {
		String sentence = "Trust No one kill any one";
		String Revsentence = ReverseSentence(sentence);  
		
		System.out.println("sentence is : " +sentence );
		System.out.println("ReverseSentence is : " +Revsentence);
	}

	public static String ReverseSentence(String sentence) {
		
		String[] words = sentence.split(" ");  		//Divide sentence into words wherever there is space
		Collections.reverse(Arrays.asList(words));	//we convert the array into list  using (Arrays.asList(words))
													//and Collections.reverse used to reverse the order of List
		return String.join(" ", words);
		
	
	}

}
