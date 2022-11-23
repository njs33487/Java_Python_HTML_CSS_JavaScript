package day9.inheritance;

public class Monkey extends Animal {
	
	////////////////STATE
	
//	boolean isAlive= true;
//	int weight = 100;
//	int height = 12;
//	int speed = 10;
//	String species= "animal";
	
	int numOfHands = 4;
	String typeOfMonkey = "monkey";
	
	///////////////BEHAVIOR
	void eatBanana() {
		System.out.println("monkey eating this delicious banana");
	}
	
	void climb() {
		System.out.println("climbing so much stuff");
	}
	
	////////////////////////////CONSTRUCTORS
	
	public Monkey() {
		super();
//		System.out.println("In Monkey FIRST constructor");
	}
	
	public Monkey(int i) {
		super();
//		System.out.println("In Monkey SECOND constructor");
	}

	


	/////////////THIS PORTION OF THE EXAMPLE IS USED TO DEMO THE IMPORTING EXAMPLE FROM DAY 10
	public static void myStaticImportedMethod() {
		//stuff
	}
}
