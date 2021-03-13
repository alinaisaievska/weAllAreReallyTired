package com.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		double sum=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the size of the array: ");
		int size = input.nextInt();
		double [] a = new double [size];
		
		for (int i = 0; i<size; i++) {
			
			System.out.println("Please, enter a double value: ");
			a[i] = input.nextDouble();
			sum+=a[i];
			
		}

		System.out.println("Let’s print a sum of the values: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
