package com.class11;

public class TaskOne {

	public static void main(String[] args) {
		
		String [][] cars= {
				{"American:", "Ford", "Jeep", "Tesla"},
				{"German:", "BMW", "Volkswagen", "Mercedes-Benz"},
				{"Korean:", "Chevrolet ", "KIA", "Hyundai"},
				{"Italian:", "Lamborghini ", "Maserati", "Fiat"}
				
		};
		
		
		for (int r=0; r<cars.length; r++) {
			for(int c=0; c<cars[r].length;  c++ ) {
				System.out.print(cars [r][c]+"  ");
			}
			System.out.println();
		}
		
		System.out.print("====================Each loop=======================");
		
        for (String[] brands:cars) {
			
			for(String car:brands) {
				System.out.print(car+"  ");
			}
			
			System.out.println();
        }
			
		
		
		
		
		
		
		
		

	}

}
