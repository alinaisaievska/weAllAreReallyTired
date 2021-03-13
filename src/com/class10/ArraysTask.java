package com.class10;

public class ArraysTask {

	public static void main(String[] args) {
		
		
		//arrays chars 
		
		//1 way
		char [] grade; 
		grade = new char[6];
		
		grade [0]='A';
		grade [1]='B';
		grade [2]='C';
		grade [3]='D';
		grade [4]='E';
		grade [5]='F';
		
		System.out.println(grade[1]);
		
		
		
		// 2 way 
		
		
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'}; //added G
		
		System.out.println(grades[5]);//prints F
		System.out.println(grades);//prints all letters
		System.out.println(grades[6]);//prints G
		
		System.out.println("Number of elements in 2 arrays " + grades.length); //8 letters
		
		//using ==>      .length 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
