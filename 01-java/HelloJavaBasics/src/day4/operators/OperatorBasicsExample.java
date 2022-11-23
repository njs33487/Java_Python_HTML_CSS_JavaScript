package day4.operators;

public class OperatorBasicsExample {

	public static void main(String[] args) {
		/*
		 * What are operators in Java?
		 * 
		 * They are characters that perform an operation.
		 * Examples:
		 * 		+, -, *, /, %, ==, !=, ++, --, etc...there are a ton
		 */
		
		//
//		System.out.println(7+10);
//		System.out.println(6/2);
		
		//this is the "modulus" operator...it does division then produces the remainder
//		System.out.println(10%3); //1 is the remainder of 10 / 3
//		System.out.println(10%2); // 0 is the remainder
//		System.out.println(10%4); //2 is the remainder
		
		//integer math produces another integer...so decimals won't be produced
//		System.out.println(10/3); //produces 3...not 3.3333333333
//		System.out.println(10/2); // produces 5
//		System.out.println(10/4); //produces 2....not 2.5
		
		
		/*
		 * there are more operators, but I want to talk about conditional operators for a moment
		 * conditional operators produce a true or false value after asking a question
		 */
		
		//the "==" operator asks "is the first value equal to the second value?"
//		System.out.println(9==9); ///true
//		System.out.println(10==8); //false
		
		// the "!=" operator asks "the first value is NOT equal to the second value, correct?"
//		System.out.println(9!=9); //false
//		System.out.println(10!=8); //true
		
		//there are many more conditional operators like &&, &, ||, |, >, <, >=, <=, !, etc
		
		
		
		///////////////
		int i6 = 7 * 6;
		
//		System.out.println(i6); //42
//		System.out.println((i6=10)*8); //(8*10)+2/2 = ?
		
		//OPERATORS IN JAVA HAVE A PRECEDENCE ORDER TO THEM
		//and you should have a few of them memorized
		// https://introcs.cs.princeton.edu/java/11precedence/
		
		
		////////let's look at different types of assignments
		int myInt = 5;
		
		myInt = myInt + 7; //currently 12 (we are incrementing/adding by 7)
		myInt = myInt + 1;//currently 13 (increment/add by 1)
//		System.out.println(myInt);
		
		//
		int whatIfMyVariableNameIsExcessivelyLengthyQuestionMark =8;
		
		whatIfMyVariableNameIsExcessivelyLengthyQuestionMark =
				whatIfMyVariableNameIsExcessivelyLengthyQuestionMark +1 ;
		
		//is there a cleaner way to add to a lengthy variable name?
		myInt += 7; //currently 20; we call this a "sugar syntax", it's just a shorthand notation
		/*
		 * there are more sugar syntaxs like the +=
		 * 
		 * there is:  -=     /=     *=     %=     etc
		 */
		myInt /=4; //currently 5
		
		
		//incrementing by SPECIFICALLY 1 is VERY common in programming, there is ANOTHER
		//   sugar syntax we can use for this specific case
		myInt++; //currently 6, myInt++ is the same thing as myInt = myInt + 1;
		++myInt; //currently 7
//		System.out.println(myInt);
		
		//what's the difference between myInt++ and ++myInt?
		System.out.println(myInt++); //it's still 7 here?
		System.out.println(myInt); //but wait...the value DID change to 8? but when?
		
		System.out.println(++myInt);//it's 9 here....hmmm.....
		
		//the different is that ++myInt is the PREincrementor and myInt++  is the POSTincrementor

		//last note...there is "++" but there is also "--" post and pre decrementors. Try it yourself
	}
}
