package com.class04;

public class NestedIfMoreExamples {

	public static void main(String[] args) {
		
		//if its friday -->go to see movie;otherwise stay at home and study
		//if its friday-->check the day if 113th-->watch scary
		//if not 13th--> watch any
		
		boolean isFriday=true;
		int day=13;
		
		if (isFriday) {
			System.out.println("It is a movie day!");
			
		if (day==13) {
			System.out.println("I will watch a scary movie");
		}else {
			System.out.println("I will watch any movie");
		}
		}else {
			System.out.println("I will stay at home and study Java");
			
		}
		
		/*
		 * check assignment and based on the score we display a message
		 */

		boolean comleted=true;
		int score=90;
		
		if(comleted) {
			if (score>90) {
				System.out.println("Great job");
				
			}else if(score>80){
				System.out.println("Good job");
			}else if(score>70) {
				System.out.println("Lets try to do better");
			}else {
				System.out.println("Study more");
			}
			
		}else
			System.out.println("Please make sure to complete all assignments on time");
		
		
		
		
		
		
	}

}
