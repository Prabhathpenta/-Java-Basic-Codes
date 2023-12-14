package com.mypractice;

public class MethodOverloading {
	 public void display() {
		 System.out.println("Display");
	 }
	 public void display(int a) {
		 System.out.println("a:" +a);
	 }
	 public static void main(String[] args) {
	MethodOverloading A=new MethodOverloading();
	A.display();
	A.display(10);
	
	}
}
