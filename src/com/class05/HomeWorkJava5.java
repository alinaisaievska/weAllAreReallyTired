package com.class05;

import java.util.Scanner;

public class HomeWorkJava5 {

	public static void main(String[] args) {
		
		
		Scanner scan;
		String month;
		String season;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your birth month");
		
		month=scan.next();
		
		if (month.equals("January")||month.equals("February")||month.equals("December")) {
			System.out.println("You were born in season: winter");
		}else if (month.equals("March")||month.equals("April")||month.equals("May")) {
			System.out.println("You were born in season: spring");
		}else if (month.equals("June")||month.equals("July")||month.equals("August")) {
			System.out.println("You were born in season: summer");
		}else if (month.equals("September")||month.equals("October")||month.equals("November")) {
			System.out.println("You were born in season: autumn");
		}
		
		
		
		
		
		
		
		

	}

}
