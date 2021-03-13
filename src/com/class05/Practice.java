package com.class05;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		//1
		Scanner scan;
		int height;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		height=scan.nextInt();
		
		if (height<60) {
			System.out.println("Short");
		}else if (height>=60 && height<=72) {
			System.out.println("Medium");
		}else if (height>72) {
			System.out.println("tall");
		}
		
		
		
		
		
		
		
		
		

	}

}
