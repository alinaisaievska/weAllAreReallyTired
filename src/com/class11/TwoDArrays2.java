package com.class11;

public class TwoDArrays2 {

	public static void main(String[] args) {
		
		
		String [][] usa= {
				{"Alexandria", "Oakton", "Arlington", "Virginia Beach", "Fairfax"},
				{"Philadelphia", "Strasburg", "Pittsburg"},
				{"Boston", "Quincy", "Springfield", "Burlington"},
				{"Los Angeles", "Long Beach", "San Fransisco", "Sacramento", "Santa Barbara"},
				{"Miami", "Orlando", "Tampa", "Talahassi"}
		};
		System.out.println(usa.length); //5 total single arrays/5 rows total
		System.out.println(usa[0].length);//5 elements inside 1 array/ 5 columns in 1 row
		System.out.println(usa[1].length);//3 elements inside 2 array/ 3 columns in 2 row
		System.out.println(usa[2].length);//4 elements inside 3 array/ 4 columns in 3 row
		
		for (int r=0; r<usa.length; r++) {
			for(int c=0; c<usa[r].length;  c++ ) {
				System.out.println(usa [r][c]);
			}
		}
               System.out.println("--------using nested for each loop-----------");
		
		for (String[] cities:usa) {
			
			for(String city:cities) {
				System.out.print(city+"  ");
			}
			
			System.out.println();
			
			
			
			
		}
	}

}
