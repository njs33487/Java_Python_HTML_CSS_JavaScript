package day3.start;

//This is a comment. Text that does not execute. It's for documentation.


/*
 * This is a block comment
 * you can put many comments
 * in one place
 * if you'd like
 * 
 */

/**
 * what is this?
 * 
 * These are JavaDocs; these describe what the functionality does...
 * 
 * In Short, JavaDocs are DOCUMENTATION
 * 
 * @author TrevinChester
 *
 *	@param myParam this thing does some CRAZY stuff
 *
 *@return the return information is crazy too!
 */

public class HelloWorld {
	
	public static void notMain(String[] args) {
		System.out.println("Not main method!");
	}

	/**
	 * YOu can ALSO use javadocs for methods
	 * @param args these are command line arguments
	 */
	public static void main(String[] trevinsangels) {
		/*
		 * What is the main method?
		 * 
		 * The main method is the entry point into your program's logic.
		 * It's the first method your JVM will call/invoke.
		 */
		
		notMain(null);
		
		
		/*
		 * There are TWO best friends you have in the STS/eclipse IDE
		 * 
		 * 1.   ctrl + click
		 * 2.   ctrl + space
		 */
		System.out.println();
		System.out.println("HelloWorld");
		
		int refactorNameExample = 0;
 
		System.out.println(refactorNameExample);
		System.out.println(refactorNameExample);
		System.out.println(refactorNameExample);
		System.out.println(refactorNameExample);
		System.out.println(refactorNameExample);
		System.out.println(refactorNameExample);
		System.out.println(refactorNameExample);
		//250 more times in your code base
	}

}
