package com.class10;

public class AllElementsLoop {

	public static void main(String[] args) {
		
		
		//for each loop/enhanced for loop/advanced for loop
		//used only with arrays or collections
		
		int [] numbers= {10, 14, 78, 5, 90};
		for(int num : numbers) {  //for each
			System.out.print(num+" ");
		}
		System.out.println();
		
		String [] names= {"Alina", "Julia", "Monika", "Pete", "Steve"};
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i]+ " ");
		}
		System.out.println();
		System.out.println("================================");
	
		
		for(String n:names) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println("================================");
		
		char [] grades= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		
		for( char grade:grades) {
			System.out.print(grade+" ");
		}
		
		System.out.println();
		System.out.println("================================");
		
		
		boolean [] boo = { true, false, false, true, false};
		
		for(boolean b:boo) {
			System.out.print(b+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
