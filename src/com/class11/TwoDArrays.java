package com.class11;

public class TwoDArrays {

	public static void main(String[] args) {
		//2d arrays is array of arrays
		
		int [][] num = new int [3][4];
		
		//1st array or 1st row		
		num[0] [0]=1;
		num[0] [1]=2;
		num[0] [2]=3;
		num[0] [3]=4;
		
		//2nd array or 2nd raw		
		num[1] [0]=10;
		num[1] [1]=20;
		num[1] [2]=30;
		num[1] [3]=40;
				
		//3rd array or 3rd raw				
		num[2] [0]=100;
		num[2] [1]=200;
		num[2] [2]=300;
		num[2] [3]=400;
		
		//we store elements based on indexes
		
		System.out.println(num[1][3]); //40
		System.out.println(num[2][3]); //400
		
		//2d arrays is combination of the raws and columns
		// raws --------- columns ||||||||
		
		System.out.println("======Another way=====");
		
		int [] [] numbers = {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400},
		};
		System.out.println(numbers [0][2]); //3
		System.out.println(numbers [1][1]); //20
		
		//what is the output?
		
		int sum = numbers [1][2] + numbers [0][3];
		System.out.println(sum);
		
		//what is the output?
		//System.out.println(numbers [0][4]); element does not exist
		
		numbers[2][2] = 500; //reassign the value
		System.out.println(numbers [2][2]); //500
		
		
		
		
		
		
		
		
		
		

	}

}
