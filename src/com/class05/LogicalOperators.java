package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/*                      and operator
		 * 
		 * we have to identify if number is small medium large xlarge
		 * if number between 1 and 10 small
		 * if number between 11-100 medium
		 * if number between 101-1000 large
		 * if number between 1001-100000 xlarge
		 */
		
		
		int num=100;
				if (num>1 && num<10) {
					System.out.println(num+" is a small number");
				}else if (num>=11 && num<=100) {
					System.out.println(num+" is a medium number");
				}else if (num>=101 && num<=1000) {
					System.out.println(num+" is a large number");
				}else if (num>=1001 && num<=100000) {
					System.out.println(num+" is a xlarge number");
				}
		
		
		
		
		
		
		
		
		

	}

}
