package com.class04;

import java.util.Scanner;

public class Trying {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your city?");
		
		String text=scan.nextLine();
		
		System.out.println("What is the temperature?");
		
		double F=scan.nextDouble();
		double C=(F-30)/2;
		
		System.out.println("The temperature in "+text+" is "+C);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
