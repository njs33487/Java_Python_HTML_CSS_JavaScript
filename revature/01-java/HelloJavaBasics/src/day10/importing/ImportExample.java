package day10.importing;

//THIS is the syntax for importing
//import day7.classes.Animal;
//import day9.inheritance.Animal;

//if we wanted, we can import ALL classes from a package
//the "*" is a wildcard that will import all entities from the given package.
import day7.classes.*;


//import day9.inheritance.Monkey;

//this will import ONLY THE STATIC MEMBERS of this class into your package's view (as if they were your own members)
import static day9.inheritance.Monkey.*;

public class ImportExample {

	public static void main(String[] args) {

		//we can import the class into our package's visibility range
		Animal myAnimal = new Animal();
		

		//we can use the full qualifier name of the objects "package1.package2.class"
		//the full qualifier name CAN BE USED to defeat import ambiguity
//		day7.classes.Animal myAnimal01 = new day7.classes.Animal();
//		day9.inheritance.Animal myAnimal02 = new day9.inheritance.Animal();
		
//		System.out.println(myAnimal02.toString());
//		System.out.println(new Object().toString()); //let's go back to the memory address again
		
		
//		Monkey.myStaticImportedMethod();
		myStaticImportedMethod(); //we can access the static method from the Monkey class because of the
		//static import
//		Monkey mon = new Monkey();//syntax error, we didn't get the ENTIRE Monkey class, just the static members
	}

}
