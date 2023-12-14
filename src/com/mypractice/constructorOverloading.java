

package com.mypractice;

public class constructorOverloading {
  
	constructorOverloading() {
	
	  System.out.println("constructor-overloading");
}
   constructorOverloading(int A) {
	  
	  System.out.println("A:" +A);
  }
   
  public static void main(String[] args) {
		   
		   
		   constructorOverloading obj1=new constructorOverloading();
		   constructorOverloading obj2=new constructorOverloading(10);
	  
  }
   }
