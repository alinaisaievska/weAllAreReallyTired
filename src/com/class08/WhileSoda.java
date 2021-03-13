package com.class08;

import java.util.Scanner;

public class WhileSoda {

	public static void main(String[] args) {
		
		
		/*
		 * we need to make a user to pay for soda
		 * keep asking a user to pay you until it enters 3
		 * 
		 * if user gives > $3 --> please give less money
		 * if user gives < $3 --> please give more money
		 * 
		 */
		
		
		Scanner input=new Scanner(System.in);
		int money;
		
		System.out.println("Please pay for your soda");
		money=input.nextInt();
		while(money!=3) {
		if (money<3) {
			System.out.println("Please give more money");
		}else if (money>3) {
			System.out.println("Please give less money");
		}
		money=input.nextInt();
		}
		
		System.out.println("Thank you for your purchase");
		
		
		
		
		
		
		
		
		
		

	}

}
