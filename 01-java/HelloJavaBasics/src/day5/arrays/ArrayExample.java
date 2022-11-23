package day5.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * 		(  )  				<------parenthesis, parens
 * 		[  ]			<---------brackets, square brackets
 * 		{  }			<----------curly brackets, curly braces
 * 		<  >			<-------Chevrons, angle brackets, arrow brackets, diamond brackets
 * 						I've also heard: greater than and less than, inequalities, hard brackets
 * 							vector brackets, carrot brackets
 * 
 * 		.		<---what is this thing called at the end of a sentence in language? full stop, period
 * 
 * 		#		-hashtag, pound sign, 
 * 				What's the actual name? octothorpe
 */
public class ArrayExample {

	public static void main(String[] args) {
		/*
		 * What is an array?
		 * 		It's a series of data entries (of the same datatype). Sequential in memory. Also,
		 * 	you can't change the size of an array.
		 * 
		 * (you could also describe it as a "group" or "matrix")
		 * 
		 * Try not to use the words "List" or "Set" or "Collection" because those are actual
		 * data structures in Java.
		 *	Set s;
		 *	List l;
		 *
		 *
		 * Is an array actually a class?
		 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html#jls-10.8
		 * 
		 * Object obj = new int[] {4,5,6,7,8}; //totally valid
		 * 
		 * BUT....is it actually a class? Well...I need to read more documentation
		 *
		 */


		//try to ctrl + click set or list; you'll see they even extend the Collection Interface
//		Set s = new HashSet<>();
//		List l = new ArrayList<>();
//		List l2 = new LinkedList<>();
		
		

		//BACK TO ARRAYS

		//how do I create an array?
		int arry1[] = {2, 3, 4, 5, 8}; //how many elements are in this array? 5
		//indices	   0  1  2  3  4		//arrays start counting at 0 for the element position
		int arry2[] = new int[40]; //how many elements are in this array? 40
							//what are the indices (indexs) ? 0 through 39
		int[] arry33 = {2,3};
		//side note: this is how to create an array on the fly
			// new int[]{5,3,6}
		

		//how do I access the elements of an array?
		//			arrayName[index]

//		System.out.println(arry1[2]); //how do I print "4"
		arry1[2]= 500;
//		System.out.println(arry1[2]);  //NOW it prints "500"
		
//		System.out.println(arry1[11]); //what prints out here?
				//ArrayIndexOutOfboundsException <---let's read the "stack trace"
		

//		System.out.println(arry1.length);
			//".length" contains the size of an array; note that this isn't a method, it's an attribute
		


		/*
		 * What happens when I take a look at an uninitialized element?
		 * 
		 * default values:
		 * int is 0, double is 0.0D, float is 0.0F, short is 0, long is 0L, boolean is false,
		 * byte is 0, char is "empty character", Objects...of any type...default to "null"
		 */
		
		int[] unArryInt = new int[25]; //an uninitialized array of intergers with 25 elements, indices 0-24
		char[] unArryChar = new char[440]; //an uninitialized array of characters
		double[] unArryDouble = new double[77];
		boolean[] unArryBoolean = new boolean[18];
		String[] unArryString = new String[88];
		Thread[] unArryThread = new Thread[77];
		
//		System.out.println(unArryInt[20]); //prints "0" for index 20
//		System.out.println(unArryChar[135]); //prints nothing, null? for index 135
//		System.out.println(unArryDouble[7]); //0.0
//		System.out.println(unArryBoolean[3]); //false
//		System.out.println(unArryString[17]); //null
//		System.out.println(unArryThread[15]); //null?
		
		
		///////////////////////////////////////////////
		
		int[] arry5 = {5, 10, 15, 20};

//		System.out.println(arry5); //it actually prints the "memory address"
		//spoiler alert: it's not ACTUALLY the memory address,
		//		instead its the hash code. We'll talk more about this later.
		
//		System.out.println(arry5[0]); //prints 5

		int[] arry6 = {0, 12, 36};
		int[] arry7 = {0, 12, 36};

//		System.out.println(arry6);
//		System.out.println(arry7);
		
		/*
		 * turns out the == checks the VALUES of two variables. But remember....the array variable's value is
		 * the MEMORY ADDRESS itself, not the values the array holds.
		 * 
		 * If you want to check to see if arrays are actual equal you can use a forloop and go through all the values
		 * to see if they are equal. OR you can use the Array class' utility.
		 * 
		 * 
		 * Arrays.    <---use the intellisense to check the array utilityclass' functionality
		 * 
		 */
		if(arry6 == arry7) {
//			System.out.println("these arrays are equal");
		}else {
//			System.out.println("these arrays are NOT equal");
		}
		
		//how you COULD check the actual equality of an array
		boolean isArrayEqual = true;
		
		for(int i = 0; i<arry6.length; i++) {
			if((i < arry6.length) && (i<arry7.length) && arry6[i]!=arry7[i]) {
				isArrayEqual = false;
			}
		}
		
//		System.out.println(isArrayEqual);
		
		
		

		//same with objects, btw
		Object obj1 = new Object();
		Object obj2 = new Object();
//		System.out.println(obj1);
		
		if(obj1 == obj2) { //turns out the == is actually checking the MEMORY ADDRESS of arrays & objects not the contents
//			System.out.println("these objs are equal");
		}else {
//			System.out.println("these objs are NOT equal");
		}
		
		
		////
		int[] arry8 = {5, 10, 15, 20};
//		System.out.println(arry8);
//		System.out.println(arry8[2]);
		//HERE is where Java says "oh, you don't want just the memory address, you actually want the values"
		//SO Java will go to the heap and find your actual data you requested
		//there are a few operators that will cause java to go to the heap.
		//		the "." when referencing state or behavior of an object AND the [ ]  when access an array
		
		
		
//		myMethod(); //this will cause a StackOverflowError
		

		//also, what happens if you try to access the members of a null object/array
		Object obj = null;
//		obj.equals(obj); //NullPointerException
		
		
		
		
		///////////////////////////////////////////////////
		
		//can we have an array of ANY datatype?
		// if so can we have an array of arrays?
		
		/////////////////////////MULTIDIMENSIONAL ARRAYS
		int[] tempArray = {1,2,3,4,5};
		String[] tempTwo = {"hello"};
		int[][] multiOne = {{0,9}, {88,7}, {108, -8}};
		int[][] multiTwo = new int[5][2];
					//multiTwo is an array that has 5 elements, each element contains an array of size 2

		//let's prove that a two dimensional array is just an array of arrays
//		System.out.println(multiOne[2][0]); //how do I print 108?
//		System.out.println(multiOne); //prints memory address
//		System.out.println(multiOne.length); //prints 3
//		System.out.println(multiOne[0]); //prints memory address
//		System.out.println(multiOne[0].length); //prints 2
		
		//can we have an array matrix with mismatch sizes? (notes multione has inner arrays of size 2, and temparray is size 5)
		multiOne[1]= tempArray; //now multione is size 2, size 5, size 2
		System.out.println(multiOne[1][2]);
		System.out.println(multiOne[2][0]); //other elements are unchanged
		

		/*
		 * What index is the row and which is the column?
		 * What is			height				width?
		 * What is			x						y?
		 * What is			x						z?
		 * What is			height				depth?
		 * 
		 * 
		 * 			row	column
		 * multiOne[8][12] = "Hello World";
		 * sysout(multiOne[8][12]);
		 * 			column row
		 * multiOne[12][8] = "Hello World";
		 * sysout(multiOne[12][8]);
		 * 
		 * the only thing that matters is consistency
		 */
		int [][] multiPosition = new int[10][9];
		
		
		


		//can we have more than two dimensions?
		int[][][] multiThree = new int[10][10][10]; //<---how many elements?
		int[][][][][][][][][][][][][] multiFour = new int[3][1][1][2][2][2][1][3][1][2][2][2][1];

		int[][][] multiFive = new int[3][][]; //sets all entries equal to null to start
		int[][] multiSix = {new int[5], new int[3], new int[1]}; //initializing each individual array
		
		
	}
	
	//quick detour
	public static void myMethod() {
		myMethod();
	}
	

}
