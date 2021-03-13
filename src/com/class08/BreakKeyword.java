package com.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		
		boolean rain=true;
		int temp=40;
		while(rain) {
			 System.out.println("I stay at home");
			 
			 if (temp>75) {
				 System.out.println("I will walk");	 //if temp ex88 will print out once "I will walk"
				 break;
			 }
			 temp+=2; //otherwise "I stay at home" will run forever
		} 
			 
//System.out.println("I code at home");code unreachable because of break;
		 
		
		System.out.println("==============");
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello");
			if(i==5) {
						
			break;
		}
		
			System.out.println("I am inside the loop"); //executes 3 times
		}
		
		

	}

}
