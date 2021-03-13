package com.class07;

public class Practice {

	public static void main(String[] args) {
		
		/*
		 * print odd numbers between 20 and 50 (2ways)
		 */
		
		
		for (int i=20; i<=50; i++) {
			if (i%2==1) {
				System.out.print(i+ " ");
			}
		}
		
		System.out.println("==========================");
		
		for (int i=21; i<=50; i+=2) {
			System.out.print(i+ " ");
		}
		
		
		
		
		System.out.println("==========================");
		/*
		 * what is the output?
		 */
		
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;
		}
		System.out.println(sum); //15
		
		
		
		
		
		
		
		
		
		
		

	}

}
