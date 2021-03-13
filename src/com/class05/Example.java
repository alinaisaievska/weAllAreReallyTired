package com.class05;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner scan;
		double saleAmount, comission;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your daily sale amount");
		saleAmount=scan.nextDouble();
		
		if (saleAmount<10) {
			comission=0;
		}else if (saleAmount>=10 && saleAmount<=100) {
			comission=saleAmount*0.1;
		}else if (saleAmount>100 && saleAmount<=500) {
			comission=saleAmount*0.2;
		}else if (saleAmount>500 && saleAmount<=1000) {
			comission=saleAmount*0.3;	
		}else {
			comission=saleAmount*0.5;
		}
		
		//if the commission is more than 500 --> You are an amazing seller
		
		if (comission>500) {
			System.out.println("You are an amazing seller");
		}
		
		
	}

}
