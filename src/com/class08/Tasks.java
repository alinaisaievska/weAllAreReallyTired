package com.class08;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		
		//1
		
		for (int i=1; i<=50; i++) {
			if(i % 3==0) {
				continue;
			}
			System.out.println(i+" ");	
		}
		
		//2
		Scanner scan=new Scanner(System.in);
		boolean yes=true;
		System.out.println("Would you like to apply for a credit card?");
		yes=scan.nextBoolean();
		while(yes) {
			System.out.println("Thank you for appling");
			break;
		}if(!yes) {
			System.out.println("Apply for a new credit card");
		}
		
		
		
		
		
		
		
		
		

	}

}
