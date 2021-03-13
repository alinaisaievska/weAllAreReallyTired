package com.class09;

public class NestedLoops {

	public static void main(String[] args) {
		
		
		for(int i=1; i<4; i++) {
			for (int j=1; j<5; j++) {
				System.out.println("Morning");
			}
			System.out.println("=========");
		}
		
		
		for(int i=5; i<7; i++) {
			System.out.println("Outer");
			for(int j=10; j<=12; j++) {
				System.out.println("Inner");	
			}
		}
		
		for(int i=1; i<3; i++) {
			for(int j=1; j<=4; j++)
				System.out.println(i+" "+j);
		}
		
		
		System.out.println("Print nums from 10-99 nested loop");
		
		for (int i=1; i<10; i++) {
			for (int j=0; j<=9; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		
		
		
		
		System.out.println("================car odometer=======================");	
		
		
		for (int a=0; a<10; a++) {
			
			for (int b=0; a<=9; b++) {
				
				for (int c=0; c<=9; c++) {
					
					for (int d=0; d<=0; d++) {
						
						System.out.println(a + "" + b + ""+ c + "" + d);
					}
				}
			}
		}
		
		
		
        
		
		
		
		
		

	}

}
