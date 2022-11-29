package day12.fnalexample;

/*
 * The "final" modifier
 * 
 * What does the "final" keyword do in Java?
 * -It will make the variable immutable (cannot be changed) after it has been assigned
 * 
 * Final keyword on:
 * 
 * -Final on a variable means that the variable is immutable (it's a constant)
 * -Final on a method means the method cannot be overridden
 * -Final on a static method means the static method cannot be shadowed
 * -Final on a class means the class cannot be extended
 * 
 * 
 * NO we may not have a final constructor
 * NO we may not have a final initializer block
 */
public /* final */ class FinalExample {
	
//	final double PI = 3.14159265;
	final double PI;
	
	static final double E_VALUE= 2.71;

	
	//////////////CONSTRUCTOR
	public /* final */ FinalExample() {
		PI=3.14; //you CAN initialize the final variable in a constructor
	}
	
	
	/////////////INITIALIZER BLOCK
	/* final */{
//		PI=3.1415; //you CAN initialize the final variable in an initializer block
	}
	
	
	////////////////MAIN METHOD
	public static void main(String[] args) {
	
		FinalExample myEx = new FinalExample();
//		myEx.PI = 15.5; //a final variable is immutable
		
//		E_VALUE = 5.5; //still immutable when static
		
		final int i = 0; //i CAN make final values inside of a method/block
		//remember, you can't put modifiers like "public" or "static" on a method scoped variable
	}
	
	
	//let's test final on a method
	final void myFinalMethod() {
		//stuff
	}
	
	final static void myStaticMethod() {
		//stuff
	}

}
