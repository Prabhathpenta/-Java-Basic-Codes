package com.mypractice;

public class RepetetiveCharacters {
	
	public static void main(String[] args) {
		String string ="prabha-here";
		
		for(int i=0;i<string.length();i++) {
			char currentcharacter = string.charAt(i);
			int count =0;
			
			for(int j=0;j<string.length();j++) {
				if (currentcharacter == string.charAt(j)) {
					count++;
					//System.out.println("Nothing is  repetitive character");       //ex : prabhu
				}
			}
		if(count>1) {
			System.out.println(currentcharacter + " is "+  +count+ " times ");
		}
		}
			
	}

}
