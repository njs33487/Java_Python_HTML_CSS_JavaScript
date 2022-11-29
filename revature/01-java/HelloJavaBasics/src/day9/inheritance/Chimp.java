package day9.inheritance;

//Java does NOT support multiple inheritance
public class Chimp extends Monkey/* , Turtle */{
	
	//////////////////STATE
	
//	boolean isAlive= true;
//	int weight = 100;
//	int height = 12;
//	int speed = 10;
//	String species= "animal";	
	
	String gender = "female";
	
	String typeOfMonkey = "chimp"; //still shadowed, btw
	
	
	///////////////BEHAVIOR
	void makeTools() {
		System.out.println("perhaps a toothbrush?");
	}
	
	

	/*
	 * THIS VS SUPER KEYWORD
	 * 
	 * "this" is a reference to the current object we're currently inside of
	 * 						(specifically it will be reference the instance/static scoped members)
	 * 
	 * "super" is a reference to the current object's DIRECT parent class
	 * 				(specifically it will be referencing the instance/static scoped members)
	 * 
	 * We were able to use the super keyword with variables, methods, and constructors
	 * super.variableName  <-------accessing a variable
	 * super.methodName();	<-----calling a method
	 * super();				<----calling a constructor
	 */
	void whatTypeOfMonkeyAmI() {
		System.out.println("What type of monkey? "+typeOfMonkey);
		System.out.println("What type of monkey w/ this? "+this.typeOfMonkey);
		System.out.println("What type of monkey w/ super? "+super.typeOfMonkey);
		
//		this.breathe();
//		super.climb();
		
		//followup
		//if I use super.method() on a overriden method, do I get the parent's original or the new version?
//		super.breathe();
	}
	
	@Override
	void breathe() {
		super.breathe();
		System.out.println("chimp breathe in and out");
		super.breathe();
	}
	
	///////////////////////////SETTERS EXAMPLE
	public void setTypeOfMonkey(String typeOfMonkey) {
		//if a method scoped variable is declared with the same name as an instance scoped variable,
			//then the instance scoped variable is SHADOWED
		this.typeOfMonkey = typeOfMonkey;
	}
	
	///////////////////////CONSTRUCTORS
	public Chimp() {
		/*
		 * the FIRST implicit line of any constructor is "super()" which is a call the parent's no arg constructor.
		 * HOWEVER, if you explicitly put your OWN super() call...then you can call an overloaded version of
		 * the parent's constructor.
		 * 
		 * Note, the super() call MUST BE THE FIRST LINE OF THE CONSTRUCTOR...this means that you can't accidentally
		 * call the parent's constructor more than one, because it'll be a syntax error.
		 */
		
		//from inside of THIS constructor can I call Chimp's other constructor?
		this(15);
		
//		super(); //this is the implicit super call, it happens to call the no args parent constructor
//		super(12);
		
//		System.out.println("In Chimp constructor");
//		super(); //syntax error down here
	}
	
	public Chimp(int i) {
//		super();
		this("hello");
//		System.out.println("In Chimp SECOND constructor");
	}
	
	public Chimp(String s) {
		super();
//		this();
	}

}
