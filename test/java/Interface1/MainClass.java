package Interface1;

public class MainClass {

	public static void main(String[] args) {
		PigReg myPig = new PigReg();  // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	    
	    Pig2Reg myPig2 = new Pig2Reg();
	    myPig2.animalSound();
	    myPig2.animalSound1();
	    myPig2.sleep();
	}

}
