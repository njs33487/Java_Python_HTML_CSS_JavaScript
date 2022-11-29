package day5.methods;

/*
 * What is overloading?
 * 	two or more methods with the same name BUT different parameters
 * 
 * you may want to overload for self-documenting reasons, readability, intuition building, and to create a type of consistency
 * 
 * 	drawRectangle(int x, int y, int height, int width);
 * 	drawRectangle(int x, int y, int height, int width, double alphaTransparency)
 * 
 * 
 * There are THREE WAYS to properly overload a method:
 * -change the parameter datatypes
 * -change the number of parameters
 * -change the ORDER of parameters
 * (and YES going from 1 parameter to 0 parameters is also changing the number of parameters)
 * 
 * 
 * Overloading is a type of polymorphism
 * Specifically, this is compile-time polymorphism
 */
public class OverloadingExample {

	public static void main(String[] trevins) {//<---notice that we can change the name of even the main method's parameter
		
		ourMethod(5);
//		ourMethod(5, 'x');
//		ourMethod('y');
//		ourMethod();
//		ourMethod('x', 5);

		ourMethod(5,'x', 10, 15, 20); //first varargs execution
		ourMethod(5, 'x', 10, 15, 20, 108, -8); //second var args execution
		ourMethod(10, 'y', new int[] {5,6,7,8}); //third var args execution, you can give varargs and array if you'd like
		
		ourMethod(new char[] {'t', 'r', 'i', 'x'}); //the array
//		ourMethod('t', 'r');
		
		
//		asdfasfaf;   //this is a COMPILE TIME issues
		
		
		Object obj = null;
//		obj.toString(); //this is a RUNTIME issue

	}
	
	
	static void ourMethod(int i, char c, int... myValue /* , int... c */) {
		//"..." is the "var-args" syntax. A variable number of arguments.
		
		System.out.println("What in the blue blazes is happening here?");
//		System.out.println(myValue); //this is a memory address
		
		for(int tempInt : myValue) {
			System.out.print(tempInt+"\t"); //NOT printing a newline character (print)
		}
		System.out.println(); //print a newline character (println)
	}
	
//	static void ourMethod(int[] c) {
//		System.out.println("in array overload");
//	}
	
	static void ourMethod(char[] c) {
		System.out.println("btw, methods CAN take in arrays as parameters");
	}
	
	
	
	
	static void ourMethod(int i) {
		System.out.println("in first");
	}
	
	static void ourMethod(char c)  {//changing the datatype DOES overload
		System.out.println("in second");
	}
	
	static void ourMethod(int i, char c) {//changing the number of parameters DOES overload
		System.out.println("in third");
	}
	

	static void ourMethod() { //changing the number of parameters DOES overload
		System.out.println("in third, part 2");
	}
	
	static void ourMethod(char c, int i) {//changing the ORDER of parameters DOES overload
		System.out.println("in fourth");
	}
	
	
	
	static int ourMethod(char j, int i, int k){
		/*
		 * Even though changing the return type isn't the REASON this method is overloaded...
		 * you can still change the return type of an overloaded method
		 */
		System.out.println("you CAN change the return type");
		return 5;
	}
	
//	static int ourMethod(int i) { //changing the return type does NOT lead to overloading
//		System.out.println("in first");
//		return 5;
//	}
	
	
//	static void ourMethod(int myVar) { //changing the variable names does NOT lead to overloading
//		System.out.println("in fifth");
//	}

}
