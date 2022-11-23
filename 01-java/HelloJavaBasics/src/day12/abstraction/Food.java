package day12.abstraction;


/*
 * 
 * Abstract classes w/ methods:
 * -You CAN have abstract methods inside of an abstract class
 * -You CAN have concrete methods inside of an abstract class
 * -You CAN have an abstract class with ZERO abstract methods
 * -You can NOT have abstract methods inside of a concrete class
 * 
 * Abstract classes w/ static methods:
 * -You CAN have static methods in an abstract class
 * -You can NOT have abstract static methods
 * 
 * Abstract classes w/ variables:
 * -You CAN have variables in an abstract class
 * -You can NOT have abstract variables
 * 
 * Abstract classes w/ constructors:
 * -You CAN have a constructor in an abstract class
 * -You can NOT have an abstract constructor
 * 
 * Abstract classes w/ initializer blocks:
 * -You CAN have an initializer block in an abstract class
 * -You can NOT have an abstract initializer block
 * 
 */
public abstract class Food {
//	abstract String foodName; //you can NOT have an abstract variable
	String[] ingredients;
	

	/*
	 * ABSTRACT METHOD
	 * Note: the child class MUST override any abstract methods before
	 * the object can be concrete. So if your child class itself is an abstract class
	 * then your child DOESN'T need to override this method....instead your concrete GRANDCHILD
	 * must override the method.
	 * (while your abstract class isn't FORCED to override your abstract method, it CAN to save
	 * your grandchild the headache of overriding)
	 */
	public abstract void goBad();
	
	public void myConcreteMethod() {
		//yes, we CAN have a concrete method in an abstract class
	}
	
	//CAN we have a constructor in an abstract class?
	public /* abstract */ Food() {
		System.out.println("Can this constructor in Food actually be called?");
	}
	
	//CAN we have an initializer block in an abstract class?
	/* abstract */{
		//yes
	}
	
	//CAN we have a static members inside of an abstract class?
	public static int myStaticVariable = 5;
	public static void myStaticMethod() {
		//no problem
	}
	
	//CAN we have a static abstract method?
//	public abstract static void myStaticAbstractMethod(); //no, you can't

	//final and abstract are essentially at odds;
	//final means you can't override, abstract means you MUST override
//	public abstract final void myFinalMethod();

	//you CAN'T have a private abstract method, because private methods can't be accessed by children classes
//	private abstract void myPrivateMethod();

}
