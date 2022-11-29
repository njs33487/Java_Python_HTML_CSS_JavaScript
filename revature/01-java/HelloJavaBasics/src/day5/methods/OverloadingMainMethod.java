package day5.methods;

public class OverloadingMainMethod {
	

	public static void main(int[] args) {
		System.out.println("In the int array main method");
//		main(new String[] {"hello", "world", "barnacles"});
		
	}
	

	public static void main(String[] thisIsTheOriginal) {
		/*
		 * Note, that our project here has MANY main methods accross MANY files.
		 * 
		 * When you run a Java program you're running SINGLE main method from a SINGLE file.
		 * The other main methods are just normal average, everyday methods
		 */
		System.out.println("In the original main method");

		main("hello");
		
		OverloadingExample.main(thisIsTheOriginal); //I can run main methods from other files if I'd like
	}
	
	public static void main(String args) {
		System.out.println("In the String main method");
		
//		main(new String[] {"hello", "world"});
	}

}
