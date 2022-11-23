package day4.prim;

public class PrimExample {

	public static void main(String[] args) {
		/*
		 * What is........a bit?
		 * It's data. It's either a "0" or "1" value. (aka an "on" or "off" value).
		 * 
		 * What is........a nibble?
		 * A nibble is 4 bits.
		 * 
		 * What is..........a byte?
		 * A byte is 8 bits.
		 * 
		 * 
		 * What is giga? kilo? tera?
		 * https://www.nist.gov/pml/weights-and-measures/metric-si-prefixes
		 * 
		 * 
		 * ON TO THE MAIN TOPIC
		 * 
		 * 
		 * What is a "primitive datatype"?
		 * 	It's a basic value, used as a building block for more complex values like referenced
		 * 	types. Primitive types are stored on the stack.
		 * 
		 * 
		 * What are the primitive datatypes in Java?
		 * 	boolean, char, int, double, float, byte, long, short
		 * 
		 * boolean (1 bit), int (4 bytes), char (2 bytes), float (4 bytes),
		 * double (8 bytes), short (2 bytes), long (8 bytes), byte (8 bits)
		 * 
		 * 
		 * 100   10      1
		 * ---------------
		 *  2    7       3
		 *  
		 *  
		 *  16	8	4     2      1
		 *  -------------------------
		 *  0   0   0     1      1
		 * 
		 * What is the largest int you can have?
		 * 2^31-1    (2,147,483,647)
		 * 
		 * 			8 bits * 4 = 32 bits
		 * 			the first bit represents positive or negative
		 * 
		 * (there also exists something called BigInt and BigDouble if you ever need more data)
		 */
		

		//how do we declare a variable in java?
		//like this --->>			[datatype]   [variable-name]
		int daName;
		

		//how do we give a variable a value in Java? (using the assignment operator, =)
		//like this--->>     [variable-name] = value;
		daName = 5;
		daName = 10;
		
		//HERE we are declaring AND initializing the variable
		int x = 16;
		x=800000;
//		System.out.println(x);
		
		//CAN we declare two variables with the same name?
		int myVar= 15;
//		int myVar= 20; //no, declaring two variables with the same name doesn't work, syntax error
					//	(there is an asterisk here....you can't create two variables with the same name INSIDE THE SAME SCOPE)
					//  (but we havent' learned about scope yet, so we'll leave that alone)
		
		
		
		
							
		//back to primitive datatypes
		boolean bool = true;		//a true or false value
		boolean bool2 = false;
		boolean bool3 = (5==6); //conditional operators can produce true/fasle values. In this case
					/// bool3 is actually equal to  false because the "==" operator is asking the question
					//  "Is 5 equal to 6?" and clearly the answer is no
		
//		System.out.println(bool3);

		
		/*
		 * There are NO truthy or falsey values beyond these two in Java
		 * In language like JavaScript you can substitute a true for the number 1
		 * 		or the string "hello"
		 * In Java you CAN NOT DO THIS.
		 */
		
		
		char c = 'T'; //a single character value. Note: we use single quotes around the char value.
//		char c21 = 'Trevin'; //a single character, NOT a string of characters
		
		/*
		 * Let's take a look at the ASCII table
		 * http://www.asciitable.com/
		 * 
		 * let me prove it to you:
		 * 		System.out.println("here is 'a': "+ (char)97);
		 * 		System.out.println("here is 'a': "+ (char)98);
		 */
		
		int i = 2334252; //an integer numeric value (4 bytes)
//		int i2= 23472842377424871278278723438; //you can't have numbers larger than 2^31-1
		
		byte by =7; //a smaller more space efficient integer value (1 byte)
		short s = 15; //2 bytes, space efficient integer value (2 bytes)
		long l = 77L; //8 bytes, larger integer value (8 bytes)
		
		float f = 2342.2342342F; //a decimal value of 4 bytes (less accurate than a double)
		
		double d = 232.23422D; //a decimal value of 8 bytes
		double dAgain = 1213117183423422321327183172141.124121341234134123421D;
		
//		System.out.println(dAgain); //if you try larger numbers, you'll lose accurary
		
		
		///////////OTHER PRIMITIVE INFO
		
		/*
		 * LITERAL VALUES
		 * 
		 * What is a "literal value" in programming?
		 * 			it's a "hardcoded" value. Literally written into the source code.
		 * 
		 * FOR EXAMPLE
		 * int i2 = 15;			//this is a literal value
		 * 
		 * This is NOT a literal value:
		 * int i3 = [right here I ask the user for some keyboard input];
		 */
		
//		5; //no, you cannot just scream "5!" at the JVM and expect it to know what you're talking about
			//you'll end up with a syntax error
//		"hello";
//		't';
//		System.out.println(5); //but THIS is okay
		

		//literal values have default datatypes
//		System.out.println(1234); //what datatype is this literal value? int
//		System.out.println(1234.1234); //what datatype is this literal value? double
//		System.out.println('T'); //what datatype is this literal value? char
//		System.out.println("Hello"); //what datatype is this literal value? String

		
		//further proof
//		System.out.println(124141641712631237161236);//syntax error because the INT value is too large
		
		
		//So...is it possible to have a literal float value?
		float f2 = 123.3123F; //THIS is a literal float
		//continuing.....
		double d2 = 1231.12312D; //THIS is a literal double, but more explicit
		long l2 = 234242L; //THIS is a literal long
		
		
		//.....moving on.....
		
		/////////////is there a problem when I uncomment the following code?
		double d3 = 1231.124; //no problem
//		float f3 = 2342.234; //yes, there is a problem, BECAUSE we are trying to put 8bytes into
		//a 4-byte container.
		
			//how do we solve it?
//			float f3 = 2342.234F;
			
			//we could ALSO, solve the problem by EXPLICITLY casting the double to a float
//			float f3 = (float)2342.234;

			/*
			 * WHAT IS CASTING?
			 * 
			 * the (float) is the Java syntax for casting one datatype into another datatype
			 * in this case, we are casting whatever value is to the RIGHT of the (float)
			 * into a float datatypes
			 * 
			 * examples of casting:
			 * 
			 * 		(float)2342.2342;
			 * 		OR
			 * 		int myInt = 123342;
			 * 		(long)myInt;
			 * 		OR
			 * 		String myString = "hello world";
			 * 		(Object)myString;
			 * 
			 */
			
		double d4 = 34234.232F; //no problem
			//because we are trying to put 4 bytes into an 8 byte container
			//Java is actually IMPLICITLY casting the float to a double.
		
		double d5 = 54; //no problem, as a double the value will now be 54.0
			//Java is IMPLICITLY casting the integer into a double datatype
		
//		int i3 = 232.23423; //yes, there is a problem
		
		int i3 = (int)232.23423;
//		System.out.println(i3);//prints "232"
		
		
		int i4 = 'T';//no, there isn't a problem. Java is implicitly casting the character to its ascii value
//		System.out.println(i4);
		
		
		//MORE WITH NUMBERS
//		int i5 = 2146823782;
		int i5 = 2_146_823_782;
//		int i5 = 2_1_4_6_8_2_3_7_8_2;
		
//		System.out.println(i5);
		
		
		
	}
}
