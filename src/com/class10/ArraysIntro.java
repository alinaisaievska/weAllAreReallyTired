package com.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		
		
		int [] array = new int [5];
		
		array[0]=10;  //indexes 
		array[1]=12;
		array[2]=15;
		array[3]=9;
		array[4]=13;
		
		System.out.println(array[2]);
		
		
		double [] numbers = new double [2]; //we can use + - * / between arrays
		numbers [0] = 10.99;
		numbers [1] = 19.01;
		
		numbers [0] = 11.99;//changed the value
				
		System.out.println(numbers[0]); //now it's 11.99
		
		//arrays are fixed in size!!!
		
		String [] names = new String[3]; //always put a value
		
		names[0] = "Jah";
		names[1] = "Al";
		names[2] = "Ko"; //if put less ==> null
		//names[3] = "Ko"; Array index out of bounds exceptions 
		
		System.out.println(names[2]);
		
		int []nums = new int [3];  //more preferable way 
		System.out.println(nums[1]); //if no values stored, compiler adds default values to the array  --> 0
				
		
		
		boolean b [] = new boolean [3];
 		
		b [0]=true;
		b [1]=false;
		b [2]=false;
		
		System.out.println(b[2]);
		
		
		
		int size = b.length;
		System.out.println("Size of array is " + size);
		
		
		
		
		
		

	}

}
