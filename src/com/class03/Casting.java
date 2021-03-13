package com.class03;

public class Casting {

	public static void main(String[] args) {
	
		int a=100;
		a+=500;
		System.out.println(a);
		
		a-=67;
		System.out.println(a);
		
		int cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		int cake=25;
		cake%=7;
		
		System.out.println(cake);
		
		
		
		System.out.println("---------------------");
		
		//int=i=10.00 type mismatch
		
		//widening or implicit casting
		double d=10;
		System.out.println(d);
		
		int num=10;
	
		//narrowing or explicit casting
		int i=(int)12.00;
		System.out.println(i);

		byte b=(byte)130;
		System.out.println(b);
		
		
		int number=12;
		double result=number/5;
		System.out.println(result);//2.0
		
		double newNum=10;
		newNum=newNum/3;
		System.out.println(newNum);//3.3333333333333335
		
		
		//int num1=10+10.5;
		double num1=10+10.5;
		System.out.println(num1);//20.5
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
