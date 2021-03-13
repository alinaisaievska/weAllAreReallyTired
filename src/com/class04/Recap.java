package com.class04;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner anyVariableName;
		
		anyVariableName=new Scanner(System.in);
		
		//to capture entire sentence
		
		String sentence=anyVariableName.nextLine();
		System.out.println(sentence); //you print first
		
		//to capture number
		
		int num=anyVariableName.nextInt();
		
		//to capture double
		
		double d=anyVariableName.nextDouble();
		
		//to capture single character
		
		char singleCharacter=anyVariableName.next().charAt(num);
		
		//boolean
		
		boolean yesOrNo=anyVariableName.nextBoolean();
		
		
		

	}

}
