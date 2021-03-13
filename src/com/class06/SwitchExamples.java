package com.class06;

public class SwitchExamples {

	public static void main(String[] args) {
		
		
		/*
		 * store gender using M or F
		 * based on the gender we will specify if M male or F female
		 * otherwise--> not sure
		 */
		
		char gender='F';
		String description;
		
		switch(gender) {
		
		case 'M':
			description="Male";
			break;
		case 'F':
			description="Female";
			break;
		default:
			description="N/A";
	}
		
		System.out.println(description);
		
		//limitations:
		//switch can't use relational or logical operators
		//it simply checks the value
		
		
		boolean sunny=true;
		if(sunny) {
			System.out.println("I'm happy");
		}
		
		//can't use boolean and double in switch
		
		
		
		
		
		
		
		

	}

}
