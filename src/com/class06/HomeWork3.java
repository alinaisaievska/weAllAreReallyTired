package com.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		
		Scanner scan;
		int number, number2, total;
		char operator=0;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		number=scan.nextInt();
		
		System.out.println("Please enter second number");
		number2=scan.nextInt();
		
		System.out.println("Please enter one operator");
		operator=scan.next().charAt(operator);
		
		switch (operator) {
		
		case '+':
			total=(number+number2);
			break;
		case '-':
			total=(number-number2);
			break;	
		case '*':
			total=(number*number2);
			break;	
		case '/':
			total=(number/number2);
			break;		
		default:
			total=0;
			System.out.println("Operator not found");

		 }		
		    System.out.println(number+" "+operator+" "+number2+" = "+total);

	}

}
