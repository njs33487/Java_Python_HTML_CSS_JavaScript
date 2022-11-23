package day9.inheritance;

public class Turtle extends Animal {
	
	////////////////////STATE
	
//	boolean isAlive= true;
//	int weight = 100;
//	int height = 12;
//	int speed = 10;
//	String species= "animal";
	
	boolean shell = true;
	String color = "green";
	
	int speed = 25;//this concept is called......"shadowing"
	String species= "turtle species";//this concept is called......"shadowing"
	
	//////////////////BEHAVIOR
	void hideInShell() {
		System.out.println("What was that!?!?! Did you hear that!?!?!");
	}
	
//	@Deprecated
	@Override //<------annotation (in Angular this is called a "Decorator")
	void makeNoise() {
		System.out.println("make TURTLE noises");
	}

	/*
	 * The override annotation is for clarity/readability AND it ensures that there IS a
	 * method in the parent class that you are overriding
	 * (it protects us from misspelling that method name)
	 *
	 * The deprecated annotation lets the developers know that this functionality will no longer
	 * be supported in the future. IT STILL DOES FUCTION, but the devs should move to a newer
	 * functionality that is designed to replaced this existing deprecated functionality.
	 */
	
	

	////////static method
//	@Override
	static void myStaticMethod() {
		System.out.println("Turtle: in my static method");
	}
	
	
	///////////////////CONSTRUCTORS
	public Turtle() {
		System.out.println("In Turtle constructor");
	}
	
//	@Override
//	public void Animal() {
//		//Can I override a constructor?
//		//no, you can't override a constructor
//	}
	
	////////////INTIALIZER BLOCK

	/////////////////INITIALIZER BLOCK
//	@Override
//	{
//		//Can I override an initializer block?
//		// No, no we can't
//	}

}
