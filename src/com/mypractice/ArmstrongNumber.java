package com.mypractice;

//It is  a number that is equal to the sum of cubes of its digits  1,153,370,371  -->27+343=370

public class ArmstrongNumber {

		public static void main(String[] args) {
			
		int num =153;
		int temp = num;
		int r, sum=0;
		
		while(num>0) {
			r=num%10;        //153%10=3
			num=num/10;		 //153/10=15
			//sum=sum+(r^3);
			sum=sum+ r*r*r;		//0+27=27
			
		}
		if(temp==sum)
			System.out.println(+temp+ " num is armstrong");
		else
			System.out.println(+temp+ " num is not Armstrong");
		}
	
}
