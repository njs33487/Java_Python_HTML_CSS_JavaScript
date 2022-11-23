package day12.abstraction;

/*
Abstraction - revealing WHAT something does, not HOW it does that something

Abstract classes and Concrete class have more similarities than they have differences.
Some of the differences include:
-Abstract classes cannot be instantiated
-AC can have abstract methods
    -an abstract method MUST be overridden eventually

 Beyond these differences, the inheritance works exactly the same as a concrete class.

 ------------------
 Differences between Abstract Classes (AC) and Interfaces:

        interfaces                                              AC
   -------------------------                        ------------------------------------------
   -abstract method (until default)                 concrete & abstract methods
   -implements keyword (extends other interfaces)   extends keyword
   -methods implicitly:
        abstract & public                           no implicit modifiers
   -variables implicitly:
        public, static, final
    -NO constructor                                 YES constructor
                    BOTH OF THESE MAY HAVE STATIC METHODS AND VARIABLES


   -------------------------------------
   why would we use one over the other?
   PRO ac: can provide concrete implementations (including methods and instance variables)
        (java 8 added default....so the interface can now have concrete methods)
   PRO ac:  constructor
   PRO i:   can implements multiple interfaces without taking up the ONE spot you have to extend a class

   ----------------
   If the parent (or binding contract) defines what the child's "destiny" or "purpose" is....
        then the parent should be an AC.
   If the parent (or binding contract) simply adds a couple additional functionalities to the "child"
        then the parent should be an interface.

*/
public class AbstractionExample {

	public static void main(String[] args) {
		
//		Food food = new Food(); // you cannot instantiate an abstract class
		
//		Edible edible = new Edible(); //you cannot instantiate an interface

		Banana banana = new Banana();
		Food food = new Banana(); //does this work? yes, we can still upcast
		
		
		//quick tangent about my Java game
		//new Claire();    vs     new Character();
		
//		Food.myStaticMethod();
		
//		System.out.println(Edible.myVar);
		
		Pizza pizza = new Pizza();
		Edible edible = new Pizza();
		Freezable freeze = new Pizza();
		
		pizza.myDefaultMethod();
		
	}
	
	

	abstract class Character {
		int health = -1;
		int strength = -1;
		int agility = -1;
	}

	class Claire extends Character {

//	int health;
//	int strength;
//	int agility;
	}

	class RainMan extends Character {

//	int health;
//	int strength;
//	int agility;
	}

	class Tessimal extends Character {

//	int health;
//	int strength;
//	int agility;
	}

}
