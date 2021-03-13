package com.class05;

import java.util.Scanner;

public class HomeWork5Java {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		double num1, num2, num3, largestNum;
		
		System.out.println("Enter your first number");
		num1=scan.nextDouble();
		
		System.out.println("Enter your second number");
		num2=scan.nextDouble();
		
		System.out.println("Enter your third number");
		num3=scan.nextDouble();
		
		if (num1>num2 &&num1>num3) {
			largestNum=num1;
		}else if (num2>num1 && num2>num3) {
			largestNum=num2;
		}else {
			largestNum=num3;
		}
		
		System.out.println("The largest number is "+largestNum);
		
		
	//////////////////////////////////////////////////////////////////	
		
		if (num1>num2) {
			if (num1>num3) {
				largestNum=num1;
			}
		}else if (num2>num1) {
			if (num2>num3) {
				largestNum=num2;
			}
		}else {
			largestNum=num3;
		}
		
		System.out.println("The largest number is "+largestNum);
		

	}

}
