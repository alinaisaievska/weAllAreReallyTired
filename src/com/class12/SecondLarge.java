package com.class12;

public class SecondLarge {

	public static void main(String[] args) {
		
		
int [] arr2 = { 900,900,200,900,3,300,300,45,900,145 };
		
		int large, secondLarge;
		large=0;
		secondLarge=0;
		
		for(int i=0; i<arr2.length; i++) {
			
			if (arr2[i]<large) {
				
				secondLarge=large;
				large=arr2[i];
				
			}else if (arr2[i]>secondLarge) {
				
				secondLarge=arr2[i];
			}
		}
		
		System.out.println("Largest num is "+large);		
		System.out.println("2nd largest num is "+secondLarge);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
