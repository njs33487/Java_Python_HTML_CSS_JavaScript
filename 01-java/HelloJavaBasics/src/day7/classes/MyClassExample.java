package day7.classes;

public class MyClassExample {
	
	public static void animalIntakeMethodExample(Animal an) {
		System.out.println(an);
		//more stuff here
	}

	
	public static void main(String[] trevins) {
		
		
		//What is the SIMPLEST way to create an object in Java?
//		new Animal();
		
		//we may have a method that takes in an animal object, and we don't have to always have a reference variable
//		animalIntakeMethodExample(new Animal());
		
		

//		Animal an0; //what THIS is doing is simply creating a reference variable for an Animal object...
		//but an Animal object hasn't actually been created yet
		
		//HERE we are creating an object AND assigning the address of that object to a reference variable
//		Animal an1 =new Animal();
//		System.out.println(an1); //prints the memory address
		

		//tangent: What is the difference between instantiation and initialization?
		//		initialization is assigning a value to a variable DURING the variable's declaration
		//		instantiation is when you create an instance of a class (when you create an object)
//		new Animal(); //instantiation
//		int i = 0; //initialization
//		Animal hippo = new Animal(); //BOTH, because of the precedence order, we're actually instantiating FIRST then initializing
//		Animal giraffe; //NEITHER, it's just a declaration
//		giraffe= new Animal(); //this isn't exactly initialization anymore becuase it isn't the INITIAL value. This is simple
				//assignment.
		
		

		////////////How do I access state and behavior?
		
//		Animal myAnimal = new Animal();
//		System.out.println(myAnimal.color);
//		myAnimal.move();

		//what if we DON'T use the dot operator?
//		System.out.println(myAnimal);
		
		

		
		/*
		 * As developers we do a LOT for the sake of readability (and ease of development).
		 * 
		 * Could you imagine having 50 different variables associated with a car (make, model, doorCount, etc...)
		 * and trying to pass those variables around to different methods? It'd be a nightmare.
		 * 
		 * Object Oriented Programming lets us contain all 50 variables in a single object for ease of use.
		 */
		
		
		/////////////////////////////////////////CONSTRUCTORS
		/*
		 * 
		 * -a constructor is a special type of method that is used to initialize the state of an object
		 * 	during its construction
		 * -a constructor has the same name as the class itself AND it doesn't have a return type
		 */
//		Animal someAnimal1 = new Animal(); //this line triggers both the constructor AND initializer
//		Animal someAnimal2 = new Animal(22, "brown"); //this line triggers both the constructor AND initializer
	
		

		//HERE we can also demo a concept called "initializer blocks"
		
		
		///////INSTANCE VARIABLES
		//like this --->>			[datatype]   [variable-name]
		//							Animal			monkey
		//
//		Animal monkey = new Animal();//we're creating an Animal object and assigning the memory address
									//to a reference variable named "monkey".
//		Animal wolf = new Animal();
//		Animal monkey2 = new Animal();
//		Animal wolf2 = new Animal();

//		System.out.println(monkey.color);
//		System.out.println(wolf.color);
		
//		wolf.color = "smokey grey";
		
//		System.out.println(monkey.color);
//		System.out.println(wolf.color);

		////////////////STATIC VARIABLES
//		System.out.println(monkey.numOfAnimalsInExistance);
//		System.out.println(wolf.numOfAnimalsInExistance);
		
//		wolf.numOfAnimalsInExistance=55;
		
//		System.out.println(monkey.numOfAnimalsInExistance);
//		System.out.println(wolf.numOfAnimalsInExistance);
//		System.out.println(Animal.numOfAnimalsInExistance);
		
		
		
		//There are literally utility methods that exist for various entities; and they are filled with
		//		static methods used for utility purposes
//		Arrays.
//		Collections.
//		Math.
		

		//for this following example you'll need to comment out all other logic in the main method
		/*
		 *  long story short, the static initializer blocks will fire the FIRST time you need the class or object
		 *  of that class type
		 *  
		 *  Also, static initializer blocks fire once, regular initializer blocks fire every time you use
		 *  the constructor
		 */
//		System.out.println("Hello World");
		
//		Animal.myStaticScopedMethod(0);
//		new Animal();
//		new Animal();
//		new Animal();
		
		
		
		/////////////////messing around with static classes
		
		Animal.InnerClass myInnerClass = new Animal.InnerClass();
		
	}

}
