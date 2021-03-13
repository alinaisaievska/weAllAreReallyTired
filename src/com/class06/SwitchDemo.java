package com.class06;

public class SwitchDemo {

	public static void main(String[] args) {
            
		
		String weekDay1;
		int day=1;
		
		switch(day) { //it is the value based
		//we can not have duplicate cases
		//values must match a variable type
		//must have break
		
		case 1:
			weekDay1="Monday";
			break;
		case 2:
			weekDay1="Tuesday";
			break;
		case 3:
			weekDay1="Wednesday";
			break;		
		case 4:
			weekDay1="Thursday";
			break;	
		case 5:
			weekDay1="Friday";
			break;	
		case 6:
			weekDay1="Saturday";
			break;	
		case 7:
			weekDay1="Sunday";
			break;	
		default:
			weekDay1="Invalid";
		}
		
		System.out.println(weekDay1);
		
		
		
		
		
		
		

	}

}
