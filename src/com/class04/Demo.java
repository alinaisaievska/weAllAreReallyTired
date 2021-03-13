package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	//shortcut to import cmd+shift+o
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter any text");
		
	String text=scan.nextLine();//scan.nextLine();-->capture your input from console
	                                 //once your enter text you must HIT ENTER
		
	System.out.println("Text that I entered is - "+text);
	
	System.out.println("Enter your name");
	
	String name=scan.next();//captures 1 word till space
	
	System.out.println("Nice to meet you "+name);
	
	System.out.println("Tell you age");
	
	int age=scan.nextInt();
	
	System.out.println("My name is "+name+" I am "+age);
	
	
	
	
	
	
	
	
	
		
	}

}
