package com.class12;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * check given number is prime or not	
	 */
		
		int num=-10;
		boolean prime=true;
		
		for( int i=2; i<num; i++) {
			if(num%1==0) {
				prime=false;
				break;
			}
		}
		
		
		if (prime) {
			
			System.out.println(num+ " is a prime number");						
		}else {
			System.out.println(num+ " is NOT a prime number");
		}
		
		
	}

}
