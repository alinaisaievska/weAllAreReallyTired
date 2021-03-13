package com.class05;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		
		boolean loan=true;
	    String eligibility;
	    int score;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Do you need a loan?");
			loan=scan.nextBoolean();
      
	    if(loan==true){
	     System.out.println("What is your credit score?"); 
      
	    score=scan.nextInt();
	    eligibility=scan.nextLine(); 

	    if(score<600){
	      eligibility="Not eligible";
	    } else if(score>=600 && score<=700){
	      eligibility="Maybe eligible";
	    }else if(score>=700 && score<=800){
	      eligibility="Eligible";
	    }else {
	     eligibility="Definitely eligible"; 
	    }
	    if (loan==true){
	          eligibility="Unknown"; 
	         }
      System.out.println("The eligibility is "+eligibility);
      }
		
		
	}
			
			
			
    }
	


