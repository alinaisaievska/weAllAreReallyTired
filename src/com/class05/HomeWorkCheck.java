package com.class05;

import java.util.Scanner;

public class HomeWorkCheck {

	public static void main(String[] args) {
	
	//credit card
		
		
		boolean creditCard;
		double balance;
	    Scanner scan;
	    
	    scan=new Scanner(System.in);
	    
	    
	    System.out.println("Do you have a credit card?");
	    creditCard=scan.nextBoolean();
	    
	    if (creditCard) {    //if string it will be  -->  if(creditCard.equals(("yes"))
	    	 System.out.println("What is the balance on the cc?");
	    	 balance=scan.nextDouble();
	    	 if (balance>1000) {
	    		 System.out.println("Pay off");
	    	 }else {
	    		 System.out.println("Spend money");
	    	 }
	    }else {
	    	 System.out.println("Would you like to open a credit card?");	
	    }
	
	//equalsIgnoreCase doesn't !!! matter about uppercase
	
	

	}

}
