package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		
		/* we need to get time
		 * based on the time we need to identify 
		 * what is the time of the day
		 * 1-11 morning
		 * 12-13 noon
		 * 13-17 afternoon
		 * 18-21 evening
		 * 22-24 night
		 */
		
		Scanner scan;
		int time;
		String timeOfTheDay;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter the time in 24 hour format");
		time=scan.nextInt();
		
		if(time>=1 && time<=11) {
			timeOfTheDay="Morning";
		}else if (time>=12 && time<=13) {
			timeOfTheDay="Noon";
		}else if (time>=14 && time<=17) {
			timeOfTheDay="Afternoon";
		}else if (time>=18 && time<=21) {
			timeOfTheDay="Evening";
		}else if (time>=22 && time<=24) {
			timeOfTheDay="Night";
		}else {
			timeOfTheDay="Invalid";
		}
		
		System.out.println("Based on the entered time, it is "+timeOfTheDay);
		
		
		/*
		 * compiler can initialized variables to their default values:
		 * default value of int-->0
		 * double-->0.0
		 * boolean-->true
		 * string and all non primitives -->null
		 * 
		 */
		
		double d=10;
		System.out.println(d); //10.0
		
		

	}

}
