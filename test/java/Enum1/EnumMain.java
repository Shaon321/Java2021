package Enum1;

public class EnumMain {
	 enum Level {
		    LOW,
		    MEDIUM,
		    HIGH
		  }

		  public static void main(String[] args) {
		    Level myVar = Level.MEDIUM; 
		    System.out.println(myVar);
		  
		  
		  for (Level myVar1 : Level.values()) {
			  System.out.println(myVar1);
			}

		  }
}
