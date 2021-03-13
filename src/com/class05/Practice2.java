package com.class05;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		//2
		
		Scanner scan=new Scanner (System.in);
		int day=scan.nextInt();
		if(day<=1 || day<=5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		
		
		
		
		
		
	}

}
