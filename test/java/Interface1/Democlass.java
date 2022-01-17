package Interface1;


  public class Democlass implements FirstInterface, SecondInterface {
 

	@Override
	public void myOtherMethod() {
		 System.out.println("Some text..");
		
	}

	@Override
	public void myMethod() {
		 System.out.println("Some other text...");
		
	}

}

