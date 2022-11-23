package day9.inheritance;

/*
 * 				OUR HIERARCHY
 * 
 * 				Object		(the Object class is the ancester or ALL other classes in Java)
 * 				  |
 * 				Animal
 * 				  |
 * 				/    \
 * 			  /		   \
 * 		Monkey		  Turtle
 * 		 |
 * 		Chimp
 * 
 * 	So we've effectively create a "parent/child" relationship aka an "is a" relationship
 * 
 * You can ALSO refer to the "parent" as the "super class"
 * and the "child" as the "sub class"
 * 
 * What is an "is a" relationship vs a "has a" relationship?
 * 	>"is a" means you ARE a type of the specific object;
 * 		it's like living a double life, where you have two identities
 * 	>"has a" means you CONTAIN a type of specific class;
 * 		it's like owning a car...you are NOT the car.....you just own one
 * 
 */

class A{}

class B extends A{
	//class B "is a" type of class A
}

class C{
	A myClass;
	
	//class C "has a" class A
}

public class InheritExample {

	public static void main(String[] args) {
		//let's take a detour for a moment....and look at the Object class.....
		/*
		 *	The object class is the oldest ancestor of EVERY object/class that will ever be created in Java.
		 *
		 * The Object class has methods that you should be at least somewhat familiar with because you'll
		 * have access to them at, pretty much, all times.
		 */
		
//		Object obj = new Object();
//		obj.
		
//		Animal an = new Animal();
//		an.
//		an.
		
//		Monkey mon = new Monkey();
//		mon.
		
		
//		Chimp chi = new Chimp();
//		chi.
		
		
//		Turtle turt = new Turtle();
//		turt.
		
		/////////////////////
		/*
		 * Types of polymorphism
		 * -overloading		(compile time)
		 * -upcasting		(aka widening, runtime)
		 * -downcasting		(aka narrowing, runtime)
		 * -overriding		(runtime)
		 */
		
//		Animal myAnimal = new Chimp(); //we are IMPLICITLY upcasting to an Animal type
		
		//question: will the myAnimal intellisense have the chimp members?
//		myAnimal. //the answer is "no"
		
//		Chimp secondChimp = new Chimp();
//		Animal secondAnimal = (Animal)secondChimp; //this is EXPLICIT upcasting
		
//		if(secondChimp == secondAnimal) {
////			System.out.println("yes, these animal objects are EXACTLY the same object");
////			System.out.println("because the memory address is exactly the same");
//		}else {
////			System.out.println("no, these animal objects are NOT the same object");
//		}
		

		////let's try this again:
		//question: will the intellisense have the chimp members?
//		secondChimp. //HERE I can see the chimp members
//		secondAnimal. //HERE I can see only the animal members
		
		//Question....is downcasting POSSIBLE in Java? Let's look at 3 scenarios
//		((Chimp)secondAnimal).makeTools(); //downcasting, the chimp members are restored in this scenario
		
//		Animal thirdAnimal = new Animal();
//		Chimp thirdChimp = (Chimp)thirdAnimal; //ClassCastException
		
//		Chimp fourthChimp = new Animal(); //syntax error
		
		//let's double down on what I'm saying here, we need to take a look at the instanceof operator
		//instanceof operator			object  instanceof class
//		System.out.println(secondAnimal instanceof Animal);
//		System.out.println(secondAnimal instanceof Turtle);
//		System.out.println(secondAnimal instanceof Chimp);

		/*RECAP
		 * Above, we just looked at 3 situations:
		 * -can I turn a chimp into an animal? (via upcasting)
		 * -can I turn an upcasted chimp back into a chimp? (via downcasting)
		 * -can I turn an animal into a chimp? (via downcasting)
		 * 
		 * IN short, you can NEVER downcast an object if it wasn't upcasted to begin with.
		 */
		
		
		
		


		///////////////////
		/*
		 * What is overriding?
		 *  A child class creating a method with the SAME NAME (and parameter list) as a method in
		 *  the parent class; this results in the behavior/functionality being altered.
		 *  
		 *  Also, yes you CAN overload accross a parent and child; clearly, from our previous examples
		 *  you don't HAVE to overload accross a parent and child. Overloading doesn't require
		 *  inheritance.
		 */
//		Animal fifthAnimal = new Animal();
//		Turtle fifthTurtle = new Turtle();
		
//		fifthAnimal.makeNoise(); //from the Animal class
//		fifthTurtle.makeNoise(); //from the Turtle class

//		((Animal)fifthTurtle).makeNoise();//from the Turtle, despite being upcast to an Animal
		
		//////Can I override a VARIABLE?
//		System.out.println(fifthAnimal.species); //from the Animal class
//		System.out.println(fifthTurtle.species); //from the Turtle class
		
//		System.out.println(((Animal)fifthTurtle).species); //from the Animal
		
		/*
		 * the truth is that....we can't override a variable in Java....In Java when a child class
		 * has a variable with the same name as a variable in the parent class...then
		 * we SHADOW the parent's variable.
		 * 
		 * This is a concept called "shadowing"; not overriding.
		 */
		
		 

		 //question: CAN I override an initializer block?
		 // the answer is NO...it doesn't make sense to
		 
		 //question: CAN I override a constructor?
		 // the answer is NO...it doesn't make sense to
		//		a constructor must have the same name as the class itself, so you can't put a constructor
		//		from another class in your class
		
		

		 //////////////////////////
		// let's look at the constructor output when ANIMAL, MONKEY, and CHIMP constructor
		//		all have sysouts
		Chimp sixthChimp = new Chimp();
		
		//////////////
//		sixthChimp.whatTypeOfMonkeyAmI();
//		sixthChimp.breathe();
		
		///question: Can I override a static method?
		Turtle sixthTurtle = new Turtle();
		sixthTurtle.myStaticMethod(); //prints from turtle
		((Animal)sixthTurtle).myStaticMethod(); //let's upcast back to animal, prints from animal
			//turns out, static methods are shadowed
		
		//keep in mind, this is a strange scenario above BECAUSE normally you should access static members
		//		in a static way
		Animal.myStaticMethod();
		Turtle.myStaticMethod();
		
		
		System.out.println("\n\nend of program");
	}

}
