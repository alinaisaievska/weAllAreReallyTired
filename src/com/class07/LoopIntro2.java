package com.class07;

public class LoopIntro2 {

	public static void main(String[] args) {
		
		int time=7; //
		if(time<12) {
			System.out.println("Hello");//executes 1 time
		}
			
		while (time<12) {
			System.out.println("Hello");//executes forever
			time--; //will check numbers negative also; infinite loop
		}
				
		System.out.println("----------- Print numbers 1=10");
		int num=1;
		
		while(num<11) {
			System.out.println(num);
			num++; //123456789printout
		}
		num=20;
		
		while (num<=40) {
			System.out.println(num);
			num++; //no horizontal, vertical --> print, no println; add " " to make a space	
		}
		
		
		
		
		
		
		
	}

}
