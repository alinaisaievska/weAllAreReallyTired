package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		

		boolean rain=true;
		 if(!rain) {  //no rain
			 System.out.println("Go to park");
		 }
		
		
		boolean boo=!true;
		System.out.println(boo);//false
		
		boolean boo1=!false;
		System.out.println(boo1);//true
		
		boolean traffic=true;
		if(!traffic) {
			System.out.println("I am on time");
		}
				
		String day="Friday";
		if(!day.equals("Friday")) {
			System.out.println("It's not Friday");
		}
				
		System.out.println("--------------------------");
		
		
		boolean homework=false;
		if(!homework) {
			System.out.println("I am happy");//I am happy
		}
		
		//NOT operator always places before condition
		//it reverse boolean condition
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
