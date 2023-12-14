package com.mypractice;

public class ParameterOverloading {
	
	int a=5, b=6;
	
	public static void main(String[] args) {
		ParameterOverloading p = new ParameterOverloading();
		System.out.println("a+b:" +p.a+p.b);
		System.out.println("a+b:" +(p.a+p.b));
	}

}
