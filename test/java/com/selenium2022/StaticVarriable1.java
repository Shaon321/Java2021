package com.selenium2022;

public class StaticVarriable1 {
	
	 static int y = 15;
	 int z = 20;
	

	 public void var2() {
		 int x = 15;
		 int j = x+z;
		 System.out.println(j);
		 
	 }

	public static void main(String[] args) {
		
		StaticVarriable1 abc = new StaticVarriable1();
		abc.var2();
		System.out.println(abc.y);

		
	
	}

}
