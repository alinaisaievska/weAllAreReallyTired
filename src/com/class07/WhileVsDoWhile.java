package com.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		
		int num=6;
		while (num<=5) {
			System.out.println(num);
			num++; //gives no code
		}
		
		System.out.println("-------Do While-------");
		
		
		
		int num1=6;
		do {
			System.out.println(num1);
			num1++;
		}while (num1<=5); //gives one 
			
		
		//works same way but 	
		
		
		/*
		 * while = first check and execute
		 * do = first execute than check
		 * 
		 * Even when condition is false DO will execute code AT LEAST ONE 
		 * 
		 * While is more popular
		 * 
		 */

	}

}
