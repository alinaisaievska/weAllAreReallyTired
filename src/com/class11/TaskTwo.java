package com.class11;

public class TaskTwo {

	public static void main(String[] args) {
		
		String [][] grocery= {
				{"Veggies:", "Tomato", "Cucumber", "Carrot"},
				{"Fruits:", "Apple", "Peach", "Grape"},
				{"Dairy:", "Milk ", "Eggs", "Chese"},
				{"Sweets:", "Candy ", "Cake", "Gum"}
				
		};
		for (int r=0; r<grocery.length; r++) {
			for(int c=0; c<grocery[r].length;  c++ ) {
				System.out.print(grocery [r][c]+"  ");
			}
			System.out.println();
		}
       System.out.print("====================Each loop=======================");
		
        for (String[] buy:grocery) {
			
			for(String grocery1:buy) {
				System.out.print(grocery1+"  ");
			}
			
			System.out.println();
        }
			
	}

}
