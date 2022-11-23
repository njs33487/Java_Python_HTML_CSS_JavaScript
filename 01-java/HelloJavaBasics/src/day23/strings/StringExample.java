package day23.strings;

/*
 * What is a String?
 * -An object that contains an array of characters
 * -A String is immutable
 * 
 * What does "immutable" mean?
 * -can't be changed
 * 
 * A String is sometimes called a "psuedo primitive"
 */
public class StringExample {

	public static void main(String[] args) {
//		System.out.println(new Object() + new Object());

//		System.out.println("Hello "+ "World"); //THIS  is why we sometimes call the String class
		//a "psuedo primitive"; it has special functionalities because it is
		// used SO often. This line of code will lead to string concatenation
		
		
		
		
		/////////////ON TO THE MAIN EVENT
		String s1 = "Hello World";
		String s2 = new String("Sup World");
		
		/////you CAN actually use a constructor that takes in a char[];
		char[] s3 = {'t', 'c'};
		new String(s3);
		
//		System.out.println(s1);
//		System.out.println(s1.length());
//		System.out.println(s1.toString());
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		
		/////FIRST STRATEGY with two different variables
		String myString = "Donuts";
		String myString2 = myString.concat(" from Krispy Kreme");
//		System.out.println(myString); //"Donuts"
//		System.out.println(myString2); //"Donuts from Krispy Kreme"
		
		//SIMILAR STRATEGY with a single variable
		String myString3 = "Donuts";
		myString3 = myString.concat(" from Krispy Kreme");
//		System.out.println(myString3);
		
		
		/*
		 * as it turns out....the concat method doesn't CHANGE the string...instead
		 * it produces a NEW String with the desired values
		 * 
		 * Let's check other string methods as well
		 */
//		s1.substring(0); //check the intellisense
		
		//////////////VARIOUS STRING METHODS

//		System.out.println(myString2); // print "Donuts from Krispy Kreme"
//		System.out.println(myString2.length());//prints 24
//		System.out.println(myString2.charAt(4)); //prints 't' at index 4
//		System.out.println(myString2.substring(8));//prints "rom Krispy Kreme"
//		System.out.println(myString2.substring(8, 10));//prints "ro"   [inclusive, exclusive)
//		System.out.println(myString2.indexOf("ris")); //prints 13
//		System.out.println(myString2.toUpperCase());
//		System.out.println(myString2.toLowerCase());
//		System.out.println(myString2.isEmpty());
		
		
		//////////SPLIT METHOD
//		System.out.println(myString2.split(" "));
		
		for(String temp: myString2.split(" ")) {
//			System.out.println(temp);
		}
		

		for(String temp: myString2.split("K")) {
//			System.out.println(temp);
		}

		for(String temp: myString2.split("")) {
//			System.out.println(temp);
		}
		
		
		////////
//		System.out.println(myString2); //"Donuts from Krispy Kreme"
//		System.out.println("Comparison ONE: "+ (myString2 == "Donuts from Krispy Kreme")); //false, checking the mem address
//		System.out.println("Comparison TWO: "+ (myString2.equals("Donuts from Krispy Kreme"))); //true, checking the contents
		
//		System.out.println(myString2.compareToIgnoreCase(myString3));
		
		
		
		///////////////////////STRING BUILDER
		//StringBuilder is a mutable counterpart to the String class
		StringBuilder sbuild = new StringBuilder("Carry on");
		sbuild.append(" my wayward son~~~!!!");
//		System.out.println(sbuild);
//		sbuild.
		
		//////////////////////STRING BUFFER
		//StringBuffer is a mutable counterpart to the String class
		//AND it's threadsafe
		StringBuffer sbuff = new StringBuffer("In the end");
		sbuff.append(" it doesn't even matter~~~!");
//		System.out.println(sbuff);
		
		

		/*
		 * NOW....that we understand Strings a bit....I have a question.....
		 * HOW.....is it possible for a String to be immutable?
		 * 
		 * A string is immutable because of the combination of THREE facts:
		 * 
		 * -All String modifying methods INTENTIONALLY AVOID altering the existing String, they instead
		 * 		create a new STring and return a reference to that new STring...leaving the original STring
		 * 		unmodified
		 * -The class is final, so that NO ONE can EVER...create a child class and override the String's intended functionality
		 * -The char[]/byte[] inside String is final so you can NEVER point to a different array, to get around
		 * 		the immutability
		 * 
		 * Note: note that in Java 8 and below the STring was stored in a char[], but in later version
		 * 		it is stored as a byte[]
		 * 
		 * Note 2: a final object means that the MEMORY ADDRESS's value is immutable, but that doesn't stop
		 * 		you from going to said memory and altering the object's contents.
		 * 
		 * 
		 * 
		 * WHY.....is a String immutable?
		 * 		Why put in this much effort?
		 * 		What's the payoff?
		 * 
		 * 
		 * -The answer is efficiency
		 * 
		 * 
		 * 
		 * imagine a banking application...and how often the following STrings would be used:
		 * 		"approved"		"denied"			"pending"			"transfer"
		 * 
		 * 
		 * s1="approved"
		 * s2="approved"
		 * s3="approved"
		 * s1.change("maybe not so approved, or something")
		 * 
		 */


		//////////////
		String str1 = "Island";
		String str2 = "Island";
		String str3 = "Forest";
		String str4 = new String("Island");
		String str5=  new String("Island");

		// remember, == check MEMORY ADDRESS....not the contents
//		System.out.println("Comparison STR 1:2 "+ (str1==str2)); //true
//		System.out.println("Comparison STR 1:3 "+ (str1==str3)); //false
//		System.out.println("Comparison STR 1:4 "+ (str1==str4)); //false
//		System.out.println("Comparison STR 4:5 "+ (str4==str5)); //false
		
		
		

		String str6 = "Is"+"land";
		String str7 = "Is".concat("land");

		System.out.println("Comparison STR 1:6\t" + (str1==str6)); //true
		System.out.println("Comparison STR 1:7\t" + (str1==str7)); //false
		
		String str8 = str1.substring(2);
		System.out.println(str8);
		System.out.println("Comparison STR 7:'land'\t" + (str8=="land")); //false
		
		
		
		
		
		//let's get away from strings for a moment to go over some basics
		Object obj1 = new Object();
		Object obj2  = new Object();

		//here, the "==" comparison operator compares the memory addresses of the two objects
//		System.out.println("comparison OBJ: "+ (obj1==obj2));
		
	}

}
