package Methods1;

public class Method2 {

	//Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.
	
	  public static void myMethod(String fname, int age) {
	    System.out.println(fname + " is " + age);
	  }

	  public static void main(String[] args) {
	    myMethod("Liam", 5);
	    myMethod("Jenny", 8);
	    myMethod("Anja", 31);
	  }
}
