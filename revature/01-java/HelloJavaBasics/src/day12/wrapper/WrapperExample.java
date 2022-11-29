package day12.wrapper;


/*
 * What is a wrapper class?
 * -Wrapper classes are reference type counterparts to the primitive datatypes.
 * In other words, It's a class that "wraps" itself around a primitive datatype to
 * give the primitive functionality.
 * 
 * Each primitive datatype has a wrapper class counterpart:
 * 
 * int			Integer
 * double		Double
 * float		Float
 * char			Character
 * boolean		Boolean
 * byte			Byte
 * short		Short
 * long			Long
 * 
 * 
 * The wrapper classes have a TON of static utility methods that
 * assist with both wrapper classes and their primitive counterparts.
 * 
 */
public class WrapperExample {

	public static void main(String[] args) {
		Integer i = new Integer(5);
		Character c = new Character('t');
		Boolean bool = new Boolean(true);
		//and so on.....



		/*
		 * This is called "autoboxing"
		 * 
		 * So when a wrapper class is given the primitive counterpart it will AUTOMATICALLY convert the primitive
		 * to the respective wrapper class.
		 */
		Integer myIntWrapper = 99; //autoboxing happens IMPLICITLY
		Object obj = 55; //<----autoboxing is SMART

		


		/*
		 * This is called "unboxing"
		 * 
		 * The opposite of autoboxing
		 */
		int myPrimInt = new Integer(91); //unboxing happens IMPLICITLY
		
		
		

//		System.out.println("Hello"+"World"); //strings are ALSO psuedo primitives that have special functionality
//		System.out.println(new Object() + new Object()); //will not work

		myMethod(new Integer(99)); //you can use autoboxing and unboxing with method calls, etc
		
		

		Integer myInteger; //ctrl + click
//		Integer.
//		Character.
//		Boolean.
		
		
		//Demo of wrapper class' utility methods
		Integer i3 = Integer.valueOf("4");
//		System.out.println(i3);
		
		int i4 = Integer.parseInt("3");
//		System.out.println(i4);
		
		i3.toString();

//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		
		

		//ALL wrapper classes have similar functionality
//		false
//		"false"
//		Boolean.parseBoolean(null)
		
		
		///////////////////BACK FROM A FUTURE EXAMPLES
		
		Integer myWrapper01 = 25;
		Integer myWrapper02 = 25;
		Integer myWrapper03 = new Integer(25);
		
		System.out.println("Comparison ONE 01:02   :"  + (myWrapper01==myWrapper02)); //true...wth?
				//the String Pool is NOT the only psuedo primitive pool out there.....
				//but this is food for thought, I'm not going to go through an example
		System.out.println("Comparison ONE 01:03   :"  + (myWrapper01==myWrapper03)); //false
		
	}
	
	
	

	public static void myMethod(int i) {
		//stuff
	}


}
