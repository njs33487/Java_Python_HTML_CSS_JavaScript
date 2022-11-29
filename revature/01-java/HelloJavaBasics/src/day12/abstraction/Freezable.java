package day12.abstraction;

public interface Freezable {
	
	default void myDefaultMethod() {
		System.out.println("in default method 2");
		/*
		 * the "default" keyword come along in java 8, and allows us to
		 * have concrete method implementations inside of an interface
		 */
		
	}

}
