package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*
		 * we need to calculate final price after discount
		 * we check if there is sale
		 * if no sale --> not going for shopping
		 * 
		 * if there is a sale-->ask about the price and item
		 * 
		 * if price is less than $10 than we will apply 5% discount
		 * if price between 10 and 100 -->10% discount
		 * if price between 100 and 500 --> 20%
		 * if price more than 500 --> 30%
		 * 
		 * which item you purchased, what was original price, what discount apploes and final price
		 */ 
		
		double price, discount=0, finalPrice=0;
		String item;
		Scanner scan=new Scanner(System.in);
		System.out.println("We have sale today");
		
		boolean sale=scan.nextBoolean();
		 if(!sale) {
			 System.out.println("I am not going for shopping") ;
		 }else {
			 System.out.println("Do you have the item?");
			 item=scan.next();
			 System.out.println("What is the price for this item?");
			 price=scan.nextDouble();
			 
			 if (price<10) {
				 discount=price*0.05;
				 finalPrice=price-discount;
			 }else if (price>=10 && price<100) {
				 discount=price*0.1;
				 finalPrice=price-discount;
			 }else if (price>=100 && price<=500) {
				 discount=price*0.2;
				 finalPrice=price-discount; 
			 }else if (price>500) {
				 discount=price*0.3;
				 finalPrice=price-discount; 
			 }
			System.out.println("You are buying "+item+" with original price = "
			 +price+" after discount "+discount+" your final price is = $ "+finalPrice);
			 
			 
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
