package com.mypractice;

public class variable {
	private String  prabha;
	private int number; 
   private double bignumber;
   private boolean flag;
   
   public void myvalues() {
	   System.out.println("Num:" +number);
	   System.out.println("Name:" +prabha);
   }
   public static void main(String[] args) {
	   	variable v=new variable();
	   	v.myvalues();
}

}
