package Abstraction1;

public class MainClass {

	public static void main(String[] args) {
		 Pig myPig = new Pig(); // Create a Pig object
		    myPig.animalSound();
		    myPig.sleep();
		    
		    
		// Animal2 obj = new Animal2(); //This is Abstract class extend by another Abstract class. Can't create an object.
		 
		  Pig2 myPig2 = new Pig2();
		  myPig2.animalSound();
		  myPig2.animalSound1();
		  myPig2.sleep();
		  myPig2.sleep2();
	}

}
