package com.class04;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("Do you have a credit card?");
	String answer=scan.next();
	if (answer.equals("yes")) {
		
		System.out.println("What is balance on your card?");
		int balance=scan.nextInt();
		if (balance>1000) {
			
			System.out.println("Pay off immediately");
		}else {
			System.out.println("You can spend more");
		}
	}else {
		System.out.println("You can open a credit card");
	}
		

	}

}
