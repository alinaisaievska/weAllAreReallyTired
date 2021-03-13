package com.class11;

import java.util.Scanner;

public class ArrayWithScanner {

	public static void main(String[] args) {
		
		
		Scanner scan;
		String[]array;
		
		scan=new Scanner(System.in);
		System.out.println("How many elements would you like to store?");
		int size=scan.nextInt();
		
		array = new String[size];
		
		for(int i=0; i<size; i++) {
				System.out.println("Please enter a string");
				
		array[i]=scan.next();
		
		}
		
		
		System.out.println("Lets see what we stored");
		
		for(String str: array) {
			System.out.print(str+" ");
		}
		
		
		

	}

}
