package com.mypractice;

/*public class StringPalindrome {
	public static void main(String[] args) {
		String s ="racecar";
		String rev = "";     								 //to store the reversed version in empty string
	
	for (int i =s.length()-1; i>=0; i--)  		 			//s.length=7-->7-1=6  -->s.charAt(6)=r 
		
		rev = rev+s.charAt(i);			 					 //then rev = r
	
	if(s.equals(rev))
		System.out.println("string is palindrome");
	else
		System.out.println("string is not palindrome");
	}

} */






public class StringPalindrome {
	
	public static void main(String[] args) {
		String s= "racecar";
		String rev = "";
		
		for(int i = s.length()-1; i>=0; i--)
		rev = rev+s.charAt(i);
		
		if(s.equals(rev))
		System.out.println("palindrome");
		else 
		System.out.println("Not palindrome");
		
		System.out.println(rev );
		
		
	}
	
}






















