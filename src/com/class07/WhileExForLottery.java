package com.class07;

import java.util.Scanner;

public class WhileExForLottery {

	public static void main(String[] args) {
		
		

		Scanner input;
		input=new Scanner(System.in);
		int num;
		int lotteryNumber=17;
		
		System.out.println("Please enter any number from 1-100 to win");
		num=input.nextInt();
		
		while (num!=lotteryNumber) {
			System.out.println("Please enter any number from 1-100 to win");
			num=input.nextInt(); //again
		}
		System.out.println("Congrats!");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
