package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
					
		Scanner input;
		String country, food;
		
		input=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=input.nextLine();
		
		switch (country.toLowerCase()) {
		case "USA":
			food="burger";
			break;
		case "Afganistan":
			food="kebab";
			break;	
		case "Vietnam":
			food="pho";
			break;	
		case "Poland":
			food="pierogi";
			break;	
		case "Kazakstan":
			food="horse";
			break;	
		case "Belarus":
			food="draniki";
			break;	
		case "Tajikistan":
			food="plov";
			break;	
		case "Mexiko":
			food="taco";
			break;	
		default:
			food="unknown";					
		}
		System.out.println("Your favorite food is "+food);

	}

}
