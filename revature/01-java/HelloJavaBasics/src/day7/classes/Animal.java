package day7.classes;

class A{}
class B{}
class C{
	public static void main(String[] args) {
		System.out.println("no freakin' way this works"); //random fact, the main method won't work in the
				//non public class
	}
}

public /* static */ class Animal {
	
	public static void main(String[] args) {
		System.out.println("hold the heck up..."); //this DOES work though
	}
	
	public static class InnerClass{
		//so YES, you CAN have a static class....but only if it is an inner class (aka nested class)
		
		/*btw, this is how you'd access this class from the main method:
		 * 
		 * 		Animal.InnerClass myInner = new Animal.InnerClass();
		 * 
		 * An example of a use case would be like Pokemon and Moves. YOu don't see a "watergun"
		 * running around without a water pokemon.
		 */
		public static void innerStaticMethod() {
			System.out.println(numOfAnimalsInExistance);
		}
		
	}
	
	///////////////////STATE (variable)

	/*
	 * The purpose of the "numOfAnimalsInExistance" variable is to count the number of objects that have
	 * been created of this class.
	 */
	static int numOfAnimalsInExistance = 0;
	
	String color = "blue";
	int weight = 100;
	double bodyTemp = 97.9;
	int speed= 25;
	String species = "shark";
	
	
	///////////////////BEHAVIOR (methods)
	int eat() {
		return weight+=10;
	}
	
	void sleep() {
		speed=0;
		System.out.println("nap time!!");
	}
	
	void move() {
		System.out.println("the object's current speed: "+  ++speed);
	}
	
	static void myStaticScopedMethod(int i) {
		//YYES, we can have static methods
		System.out.println("stuff");
	}

	////////////////////////CONSTRUCTORS
	
//	public Animal() {
//		/*
//		 * THIS is what the default constructor looks like
//		 * 
//		 * BY DEFAULT if you do NOT create a constructor, Java will give you a constructor. We refer to this
//		 * constructor as the "default constructor".
//		 * 
//		 * BY DESIGN, the "default constructor" happens to be a "no arg constructor" BUT that doesn't mean that
//		 * all no arg constructors are default constructor
//		 */
//	}
	
	
	public Animal() {
		/*
		 * THIS is a "no arg constructor". It simply means a constructor that has an empty parameter list.
		 * This is NOT a default constructor.
		 */
//		System.out.println("In the no args constructor");
		color= "sky blue";
		
		
//		System.out.println("----------");
//		System.out.println("An Animal Object has been created");
//		System.out.println("----------");
		
//		numOfAnimalsInExistance++;
	}
	
	public Animal(int i) {
		/*
		 * This is a "parameterized constructor"
		 */
//		System.out.println("In the 1-arg parameterized constructor");
		

//		System.out.println("----------");
//		System.out.println("An Animal Object has been created");
//		System.out.println("----------");
		
//		numOfAnimalsInExistance++;
	}
	
	public Animal(int i, String incomingColor) {
		/*
		 * This is a "parameterized constructor"
		 */
		color = incomingColor;
		speed = i;
		species = "hawk";
//		System.out.println("In the 2-arg parameterized constructor");
		

//		System.out.println("----------");
//		System.out.println("An Animal Object has been created");
//		System.out.println("----------");
		
//		numOfAnimalsInExistance++;
	}
	
	//CAN you have a static constructor?
	public /* static */ Animal(String s, int y, int x){
		//no, you may NOT have a static constructor
	}
	
	
	/////////////////////////////////////INITIALIZER BLOCK
	
	/*
	 * Let's talk a moment about the Java Initialization Order:
	 * 
	 * 1. static variables & methods
	 * 2. static initializer blocks
	 * 3. instance variables & methods
	 * 4. instance initializer blocks
	 * 5. constructor
	 */
	
	{
		//Initializer blocks are a way to modularize constructor logic or initialization logic
		System.out.println("In the initializer block");
		
//		System.out.println("----------");
//		System.out.println("An Animal Object has been created");
//		System.out.println("----------");
		
		numOfAnimalsInExistance++;
	}
	
	{
		System.out.println("Can we have multiple initializer blocks?");
	}
	
	static{
		//Yes, we can. it runs only once
		System.out.println("Can we have a STATIC initializer block?");
	}
	

	//////////////////////////////////
	////////////////SCOPES IN JAVA
	/*
	 * SCOPES DISCUSSION:
	 * 
	 * What is scope?
	 * 	The area where a variable exists. Outside of this area the variable doesn't exist.
	 * 
	 * This is NOT to be confused with access levels....that happen to determine who has access to a
	 * variable when it DOES exist. it deals with permissions, not existence.
	 * 
	 * 
	 * What are the scopes in java?
	 * -class scope (aka static scope)
	 * -object scope (aka instance scope)
	 * -method scope (aka local scope)
	 * -block scope
	 */
	

	static int myStaticScopeVar;
	int myInstanceScopeVar;
	
	void myInstanceScopeMethod(int methodParam) {//<---parameters are in what scope? method scope
		//ONCE INSIDE THE CURLY BRACES, WE'RE IN THE METHOD SCOPE
		
		int myMethodScopeVar=0;

		/*
		 * NOTE: if I DON'T initialize this method scope variable, then when I attempt to use it
		 * i will get a syntax error. So method scope variable do NOT take their default values.
		 * 
		 * Long story short, variables ONLY take their default values in the instance scope, static scope,
		 * and in uninitialized arrays.
		 */
		

		
		//YES, we can access a method scope var from this method scope
		System.out.println(myMethodScopeVar);
		System.out.println(methodParam);
		//YES, we can access a instance scope var from this method scope
		System.out.println(myInstanceScopeVar);
		//YES, we can access a static scope var from this method scope
		System.out.println(myStaticScopeVar);
		
		while(myInstanceScopeVar==1) {
			//ONCE INSIDE THE CURLY BRACES, WE'RE IN THE BLOCK SCOPE
			int myBlockScopeVar=0;
			

			/*
			 * NOTE: if I DON'T initialize this block scope variable, then when I attempt to use it
			 * i will get a syntax error. So method scope variable do NOT take their default values.
			 * 
			 * Long story short, variables ONLY take their default values in the instance scope, static scope,
			 * and in uninitialized arrays.
			 */

			//YES, we can access a block scope var from this block scope
			System.out.println(myBlockScopeVar);
//			//YES, we can access a method scope var from this block scope
			System.out.println(myMethodScopeVar);
//			//YES, we can access a instance scope var from this block scope
			System.out.println(myInstanceScopeVar);
//			//YES, we can access a static scope var from this block scope
			System.out.println(myStaticScopeVar);
		}
		


		//NO, we can NOT access a block scope var from this method scope
//		System.out.println(myBlockScopeVar);
	}
	
	{
		/////ONCE INSIDE THESE CURLY BRACES, WE'RE IN THE INSTANCE/OBJECT SCOPE
		//			(we're using an instance initializer block to demonstrate the instance scope

		
		//NO, we can NOT access a block scope var from this instance scope
//		System.out.println(myBlockScopeVar);
//		//NO, we can NOT access a method scope var from this instance scope
//		System.out.println(myMethodScopeVar);
//		//YES, we can access a instance scope var from this instance scope
		System.out.println(myInstanceScopeVar);
//		System.out.println(methodParam);
//		//YES, we can access a static scope var from this instance scope
		System.out.println(myStaticScopeVar);
		
		
		
		boolean bool = true;
		while(!bool) {
			int myOtherBlockScopeVar = 0;
		}
		
		//NO, you can't access block scope even now
//		System.out.println(myOtherblockScopeVar);
	}
	

	static {
		/////ONCE INSIDE THESE CURLY BRACES, WE'RE IN THE STATIC/CLASS SCOPE
		//			(we're using an static initializer block to demonstrate the static scope
		

		//NO, we can NOT access a block scope var from this static scope
//		System.out.println(myBlockScopeVar);
//		//NO, we can NOT access a method scope var from this static scope
//		System.out.println(myMethodScopeVar);
//		//NO, we can NOT access a instance scope var from this static scope
//		System.out.println(myInstanceScopeVar);
//		//YES, we can access a static scope var from this static scope
		System.out.println("mystatic scoped var: " +myStaticScopeVar);
		
		

		boolean bool = true;
		while(!bool) {
			int myOtherStaticBlockScopeVar = 0;
		}

		//NO, you can't access block scope even now
//		System.out.println(myOtherStaticBlockScopeVar);
	}
	
	
}
