package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
     for(int i=1; i<=10; i++) {
    	 System.out.println("Hello");
    	 if(i==3) {
    		 continue;
    	 }
    	 System.out.println("Inside loop");
     }
		
		
		
		//break ==>breaks the loop
        //continue==> I have to go back
		
     System.out.println("----------------------------------");
		/*
		 * need to print all numbers from 1-10 except 5&6
		 */
		
		for (int i=1; i<=10; i++) {
			if(i==5 || i==6) {
				continue; //skips
			}
			System.out.println(i+" ");	
		}
		
		
		System.out.println("----------------------------------");
		
		/*
		 * print number 1-40, except number divisible by 4
		 */
		
		for (int i=1; i<=40; i++) {
			if (i%4==0) { //checking equality
				continue;
			}
				System.out.println(i+" ");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
