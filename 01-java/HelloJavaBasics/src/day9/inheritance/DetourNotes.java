package day9.inheritance;

public class DetourNotes {
	
	
	
	

	
	
	/////////////////////DETOUR.......Let's talk about WHY upcasting & downcasting is useful
	
//	void processingMethod(Chimp c) {
//		//55 lines of logic that puts an animal into a zoo
//	}
//	
//	void processingMethod(Monkey m) {
//		//55 lines of logic that puts an animal into a zoo
//	}
//	
//	void processingMethod(Turtle t) {
//		//55 lines of logic that puts an animal into a zoo
//	}


	//what if instead.....I upcasted during the logic
	void processingMethod(Animal a) {
		/*
		 * this method could be called like:
		 *     processingMethod(new Monkey())
		 *     OR
		 *     processingMethod(new Chimp())
		 *     OR
		 *     processingMethod(new Turtle())
		 */
	
	
		//55 lines of logic that puts an animal into a zoo
	
		/*
		 * we can also downcast to the appropriate datatype if we'd like
		 * 
		 * 
		 * if(...)
		* 		(Monkey)a
		* else if(...)
		* 		(Turtle)a
		*/
	}
	
	////////////FURTHER DETOUR, LET'S TALK ABOUT TIGHTLY COUPLED CODE & DECOUPLING
	/*
	*   quick high level description of decoupling vs spaghetti code
	*   
	*   What is spaghetti code? (aka tightly coupled code)
	*   	code that is written in such a way where small changes to one file creates a wave of changes
	*   	many other source code files. This is an issue because it creates more work for your team and
	*   	for the project. Your code is tangled up like sphaghetti.
	*   	(like a house of cards)
	*   
	* 
	* class Animal { }
	* 
	* class Chimp { }
	* class Wolf { }
	* class Hawk { }
	* class Turtle { }
	*   //and we have 46 more of these animal classes
	*   
	*   //what if later a coworker says the Chimp class is obselete...and the team has made a ChimpTwo class?
	*   
	*   
	*   //NOW...let's visit two scenarios...first....
	* 
	* 	//ONE CONTAINER FOR CHIMP
	*	class ChimpZooContainer{
	*		Chimp c;
	*
	*		ChimpZooContainer(Chimp incomingChimp){
	*			c = incomingChimp;
	*		}
	*
	*		method1() { //operates on this animal }
	*
	*		method2() { //operates on this animal }
	*	}
	*
	*	//ONE CONTAINER FOR WOLF
	*	class WolfZooContainer{
	*		Wolf w;
	*
	*		WolfZooContainer(Wolf incomingWolf){
	*			w = incomingWolf;
	*		}
	*
	*		method1() { //operates on this animal }
	*
	*		method2() { //operates on this animal }
	*	}
	*
	*	//48 more times....
	*
	*
	*	////WHAT IF WE HAD A SINGLE CONTAINER FOR ALL THE ANIMALS!?!?
	*	class AnimalZooContainer{
	*		Animal a;
	*
	*		AnimalZooContainer(Animal incomingAnimal){
	*			a = incomingAnimal;
	*		}
	*		
	*		method1() { //operates on this animal }
	*
	*		method2() { //operates on this animal }
	*
	*		setA(Animal a) { this.a = a;}
	*	}
	*
	*/
}
