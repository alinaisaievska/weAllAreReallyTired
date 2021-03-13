package com.class04;

public class Task {

	public static void main(String[] args) {
		//1
		boolean diploma=true;
		double gpaScore=3.5;
		
		if (diploma) {
			System.out.println("Congratulations");
				if (gpaScore>=3.5) {
		    System.out.println("You are eligible for schoolarship");
		      }else {
		    System.out.println("You shoul study harder");
		      }
	    
		}else {
		    System.out.println("Get a degree");
		}
		
		
		//2
		int mortgageRate=5;
		int mortgagePrice=10600;
		
		if (mortgageRate>4.5) {
			System.out.println("Not buy a house");
				
		}else {
			System.out.println("Will consider");
			
		    if (mortgagePrice>200000) {
			
			System.out.println("Pay cash");
		    }else {	
		
			System.out.println("Take a loan");	
	}
		
		}

	
	
	
	
	
	}

			}
