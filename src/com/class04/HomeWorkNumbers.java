package com.class04;

import java.util.Scanner;

public class HomeWorkNumbers {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Please, enter numbers of worked years");
	
	double years=scan.nextDouble();
	
	System.out.println("Please. enter your annual salary");
	
	int salary=scan.nextInt();
	
	if (years>=5) {
		System.out.println("You are eligible for the bonus");
		if(salary>=50000) {
			System.out.println("Your bonus is 5000");	
		}else {
			System.out.println("Your bonus is 3000");
		}
	}else {
		System.out.println("You are NOT eligible for the bonus");
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
