package com.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		
		//4
		
		
		Scanner input=new Scanner (System.in);
		String item;
		int price;
		int money;
		int total;
		int remainder;
		int sum=0;
		
		System.out.println("Please enter the item you would like to buy");
		item=input.nextLine();
		
		System.out.println("Please enter the price of "+item);
		price=input.nextInt();
		
		do {
		System.out.println("Please pay for "+item);
		money=input.nextInt();
		sum+=money;	
		
		if(sum<price) {
					
			remainder=price-sum;
			
			System.out.println("Please enter "+remainder);
		}else if (sum>price) {
			remainder=sum-price;
			System.out.println("Here is your change "+remainder);
			break;
		}else {
			System.out.println("You got the right amount");
		}
		}while (price!=sum); {
			System.out.println("Thank you for shopping");
			
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
