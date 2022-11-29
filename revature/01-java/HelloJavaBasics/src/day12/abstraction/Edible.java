package day12.abstraction;

/*
 * What is an interface?
 * An interface is a CONTRACT between itself and any implementing classes
 * 
 * Just like a real world contract, the implementing class needs to fulfill
 * the contract's requirements.
 * 
 * To utilized an interface on a class...you must use the keyword "implements"
 * 
 * Note, interfaces EXTENDS other interfaces (not implements)
 * 
 * Note2, yes interface CAN extends MULTIPLE other interfaces
 */
public interface Edible extends Heatable/* , Freezable */{

	/*
	 * What are implicit modifiers on variables in an interface?
	 *  public static final
	 */
	/* public static final */ int myVar=15;
	
	
	
	/*
	 * What are implicit modifiers on methods in an interface?
	 * 		public abstract
	 * 
	 * (note, that these implicit modifiers don't happen IF the method is static)
	 */
	/* public abstract */ void breakDownIntoNutrients();
	
	default void myDefaultMethod() {
		System.out.println("in default method");
		/*
		 * the "default" keyword come along in java 8, and allows us to
		 * have concrete method implementations inside of an interface
		 */
		
	}
	
	public static void myStaticMethod() {
		//apparently you CAN have a static implementation inside of an interface
	}
	

//	public Edible() {
//	//interfaces cannot have constructors
//	}
	
//	{
//	//interfaces cannot have initializer blocks	
//	}
	

//	static{
//	//interfaces cannot have initializer blocks, not even a static one
//	}
}
