package com.mypractice;

import java.util.Arrays;



public class RemovingRepeatedElements {
	
	public static void main(String[] args) {
		int arr[] = {123,124,123,479,124,125,234,234,345,347,347,478,467,478,500,600,600};
	
	 //A HashSet is a collection that does not allow duplicate elements, 
	//and it is typically used to "store unique elements".
	//This set will be used to store the unique elements from the "array arr".
		
		
		
		int[] uniqueArray = Arrays.stream(arr).distinct().toArray();
		
		//Arrays.stream(array):  converts the array into a stream of integers.
		//.distinct(): distinct() operation removes duplicate elements from the stream.It appears only once. 
		//.toArray(): After removing duplicates, we convert the stream back into an array using the toArray() method.
		
		System.out.println("UniqueElements " +Arrays.toString(arr));
		System.out.println("Duplicates Removed "+Arrays.toString(uniqueArray));
	}
}