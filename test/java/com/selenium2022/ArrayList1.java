package com.selenium2022;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		 ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
	
		    System.out.println(cars);
		    
		   for (int i = 0; i < cars.size(); i++) {
		        System.out.println(cars.get(i));
		      }
		    
		    for (String i : cars) {
		        System.out.println(i);
		      }
		    
		    System.out.println(cars.size());
		    
		    System.out.println(cars.get(0));
		    
		    cars.set(0, "Opel");
		    System.out.println(cars);
		    
		    cars.remove(0);
		    System.out.println(cars);
		    
		    cars.clear();
		    System.out.println(cars);
		    
		    
		    
		    
		    
		    
		    
	}

}
