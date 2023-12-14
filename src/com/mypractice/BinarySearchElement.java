package com.mypractice;

import java.util.ArrayList;

import java.util.Collections;

public class BinarySearchElement {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i<10; i++) {
			numbers.add(i);
		}
		System.out.println("list Elements is : "  +numbers);
	
		int position = Collections.binarySearch(numbers, 4);
		System.out.println("INDEX Position of value 4 is : " +position);
	}
}

