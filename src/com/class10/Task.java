package com.class10;
public class Task {
	public static void main(String[] args) {
		
		int sum=0;
        int [] array = new int [5];
		
		array[0]=5;   
		array[1]=10;
		array[2]=15;
		array[3]=20;
		array[4]=25;
		
		for( int i=0; i<array.length; i++) {
			 sum += array[i];
		}
		System.out.println("The sum of numbers are "+ sum);
		
		
		
		
		
				
	}
}
