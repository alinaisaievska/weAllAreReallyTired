package com.class07;

import java.util.Scanner;

public class DoWhileEX {

	public static void main(String[] args) {
		
		
		Scanner input;
		input=new Scanner(System.in);
		int num;
		int lotteryNumber=17;
		
		do {
		System.out.println("Please enter any number from 1-100 to win");
		num=input.nextInt();
		}while(num!=lotteryNumber);
		
		System.out.println("Congrats!");
		
		
		
		
		
		
		
		

	}

}
