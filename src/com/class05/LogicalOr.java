package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * variable day 
		 * if day is Tuesday or Wednesday-->manual class
		 * if day is Monday or Friday --> free
		 * if day is Saturday or Sunday --> java class
		 * if day is Thursday --> review class 
		 */
		
		
		String day="Saturday";
		
		if (day.equals("Monday")|| day.equals("Friday")) {
			System.out.println("Have no class");
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("Review class");
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Java class");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
