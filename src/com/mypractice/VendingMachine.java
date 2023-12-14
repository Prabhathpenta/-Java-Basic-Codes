package com.mypractice;

import java.util.Scanner;

public class VendingMachine {
	private int balance;
	
	public VendingMachine() {
		balance = 0;
	}
	public void insertCoin(int amount) {
		balance += amount;  //balance=balance+amount
	}
	
	public void selectProduct(int price) {
		if (balance >= price) {
			System.out.println("Product Dispensed. Enjoy!");
			balance -= price;
		}else {
			System.out.println("Insufficient balance. Please insert more coins");
		}
	}
	public int getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Insert coin");
			System.out.println("2. Select product");
			System.out.println("3. Check balance");
			System.out.println("4. Exit");
			System.out.println("Choose an option : ");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Insert Coin : ");
				int coin = sc.nextInt();
				vendingMachine.insertCoin(coin);
				break;
			case 2:
				System.out.println("Enter product price : ");
				int price =sc.nextInt();
				vendingMachine.selectProduct(price);
				break;
			case 3:
				System.out.println("current balance: " + vendingMachine.getBalance() );
				break;
			case 4:
				System.out.println("Thank you for using Vending Machine");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again");
			}
		}
			
	}
}
		
