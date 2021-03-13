package com.class06;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner scan;
		String country, language;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=scan.nextLine();
		
		switch (country) {
		case "USA":
			language="English";
			break;
		case "Canada":
			language="English";
			break;	
		case "Italy":
			language="Italian";
			break;	
		case "France":
			language="French";
			break;
		case "Ukraine":
			language="Ukrainian";
			break;	
		case "Russia":
			language="Russian";
			break;		
		case "German":
			language="German";
			break;	
		case "Greece":
			language="Greek";
			break;		
		default:
			language="unknown";				
		}
		System.out.println("Your language is "+language);
		
		
		
		
		
		
		
		

	}

}
