package com.class12;

public class MinAndMaxNumInArray {

	public static void main(String[] args) {
		
		int [] largeArray = { 663782478, 536, 62777, 10, 6 };
		
		int smallest=largeArray[0];
		int largest=largeArray[0];
		
		for(int i=0; i<largeArray.length; i++) {
			
			if (largeArray[i]<smallest) {
				
				smallest=largeArray[i];
				
			}else {
				
				largest=largeArray[i];
			}
		}
		
		System.out.println(smallest+" is min num in the array");		
		System.out.println(largest+" is max num in the array"); //not printing the largest???
		
		
		
		
		
		
		
		

	}

}
