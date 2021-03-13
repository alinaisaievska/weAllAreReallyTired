package com.class10;

public class ArraysTask2 {

	public static void main(String[] args) {
		
        //1
		
		String [] names;
		names = new String[5]; 
		
		names[0] = "Alina";
		names[1] = "Julia";
		names[2] = "Monika";
		names[3] = "Pete";
		names[4] = "Steve";
		
		System.out.println(names[1]);
		
		
        String [] names2= {"Alina", "Julia", "Monika", "Pete", "Steve"};
        System.out.println("The names are  " + names2.length);
        System.out.println(names[1]);
		
		
        System.out.println("========Loop=======");
        
        //how get all elements from an array
		
        for (int i=0; i<names.length; i++) {
        	System.out.println(names[i]);
        }
        
        
        
        
        
        
        
        
		
		
		
		

	}

}
