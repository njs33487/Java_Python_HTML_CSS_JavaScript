package day9.inheritance;

public class Animal {
	
	/////////////////STATE
	boolean isAlive= true;
	int weight = 100;
	int height = 12;
	int speed = 10;
	String species= "animal species";
	
	///////////////////BEHAVIOR
	void breathe() {
		System.out.println("animal breathe in and out");
	}
	
	void speedUp() {
		System.out.println("speeding up");
		speed+=2;
	}
	
	void makeNoise() {
		System.out.println("make ANIMAL noises");
	}
	
	////////static method
	static void myStaticMethod() {
		System.out.println("Animal: in my static method");
	}
	
	///////////////CONSTRUCTORS
	public Animal() {
		super();
//		System.out.println("In Animal constructor");
	}
	
	
	////////////INITIALIZER BLOCK

	/////////////////INITIALIZER BLOCK
	{
		//stuff 1
	}
	{
		//stuff 2
	}
	{
		//stuff 3
	}

}
