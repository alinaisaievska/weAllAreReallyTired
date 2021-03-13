package com.class10;

public class ArraysTask3 {

	public static void main(String[] args) {
		
		
		int[] numbers= {10, 14, 78, 5, 90, 76, 1, 8}; //starts counting from 0 --> 7 nums
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println("--------------------------------------");
		
		
		//print in reverse
		
		
		for( int i=numbers.length-1; i>=0; i--) {  // that's why -1; because length 
			                                       //is 8 nums if we count regular from 1
			System.out.print(numbers[i] + " ");
		}
		
		
		
		
		
		
		
		

	}

}
