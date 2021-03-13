package com.class09;

public class Patterns2 {

	public static void main(String[] args) {
		
		
		for (int r=1; r<=6; r++) { //rows
			
			for(int c=1; c<=8; c++) { //columns
				
				System.out.print("* ");
				
			}
			
			System.out.println(); //print empty line 
		}
		
		
		//outer=rows
		//inner=columns
		
        for (int r=1; r<=4; r++) { 
			
			for(int c=1; c<=5; c++) { 
				
				System.out.print(c+ " ");
				
			}
			
			System.out.println(); 
		}
		
		
        
        
        
          for (int r=1; r<=5; r++) { 
			
			for(int c=6; c>0; c--) { 
				
				System.out.print(c+ " ");
				
			}
			
			System.out.println(); 
		}
        
        
        
        for  (int r=1; r<=5; r++) {
        	for(int c=6; c>=1; c--) {
        		System.out.print(r+" ");
        	}
        	System.out.println();
        }
        
        
        System.out.println("================StarsTriangle==================");
        
        
        for(int r=1; r<=5; r++) {
        	for (int c=1; c<=r; c++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        
        
        
        
		
	}

}
