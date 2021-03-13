package com.class07;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			
			System.out.println("Hello"); //we know exactly how many times to execute
			
		}
		
		System.out.println("=============print nums from 1-50====================");
		
		for (int i=1; i<=50; i++) { //+++++++
			
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("=============print nums from 10-1====================");
		
		for (int i=10; i>=1; i--) { //------
			
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("=============what is output====================");
		
		for (int a=0; a<=10; a+=2) {
			System.out.print(a+" "); //even numbers
		}
		
		
		System.out.println();
		System.out.println("=============what is output2====================");
		
		for (int i=5; i<=50; i+=5) {
			System.out.print(i+" ");  // 5 10 15 20....
		}
		
		
		
		
		
		
		
	}

}
