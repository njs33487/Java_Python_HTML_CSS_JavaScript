package day4.flowcontrol;

public class BranchingExample {

	public static void main(String[] args) {


		/*		FORMAT OF THE IF-STATEMENT
		 * 		(note: conditions simplify to a true or false value)
		 * 		(note2: a "condition" is simply a "boolean expression")
		 * 		(valid formations: if by itself, if and else, if else-if * n and else)
		 * 
		 * 		if(  [condition1]   ) {
		 * 			//logic to execute assuming condition1 is true
		 * 
		 * 			//BUT if condition1 is false, this logic will NOT execute
		 * 		} else if(  [condition2]   ){
		 * 			//logic to execute assuming condition2 is true
		 *			//  AND condition1 didn't trigger
		 *			//you don't HAVE to have an else if block
		 * 
		 * 			//BUT if condition2 is false, this logic will NOT execute
		 * 		} else if(  [condition3]   ){
		 * 			//logic to execute assuming condition3 is true
		 *			//  AND condition1 and 2 didn't trigger
		 * 
		 * 			//BUT if condition3 is false, this logic will NOT execute
		 * 		} else {
		 * 			//logic to executed assuming no conditions above are true.
		 * 			//you don't HAVE to have an else block
		 * 
		 * 			//BUT if ANY of the conditions above are true, then this logic WILL NOT RUN
		 * 		}
		 * 
		 * 		conditional operators:		&&, ||, !, >, <, >=, <=, != , ==, ^
		 * 	//you can make the condition statements as complicated as you desire
		 * 
		 * 				== means "are these two equivalent"
		 * 				&&  means "and"
		 * 				|| means "or"
		 * 				! means "takes the opposite"		
		 * 					(so !true will be false, and !false will be true)
		 * 				!= means "not equal to"
		 * 				> means greater than...and the others are straightforward from there
		 * 
		 * 	
		 */
		

		boolean bool1 =true; 
		boolean bool2 = true;
		boolean bool3 = false;
		
		if( bool1 && bool2 && bool3 ) {
//			System.out.println("it's true");
//			System.out.println("true again");
		}else {
//			System.out.println("it's false");
//			System.out.println("false again");
		}
		
		

		
		int i =150;//<------this one

		//let's try with else if
		if(i==5) {
//			System.out.println("first");
		}else if(i==10) {
//			System.out.println("second");
		}else if(i==15) {
//			System.out.println("third");
		}else {
//			System.out.println("fourth");
		}
		
		boolean bool4= false;
		
		
		//you do not NEED to have an if statement followed by an "else if" or "else"
		if(bool4) {
//			System.out.println("lonesome if statement");
		}
		
		

		//////let's try if statements with the concept of nesting
		boolean myBool3 = true;
		
		if(myBool3) {
			//outer logic
			if(!(i==15)&&myBool3) {
				//inner logic
			}else {
				//inner logic
			}
		}else {
			//outer logic
		}
		
		
		
		/////////////////
		boolean bool5= false;
		
//		if(bool5)
//			System.out.println("first"); //this line IS associated with the if statement
//			System.out.println("second"); //this line is NOT associated with the if statement

		
//		System.out.println("example done");
		
		
		
		
		/*
		 * 			TERNARY
		 * 
		 * 		[condition]		?		[true value] : [false value]
		 * 
		 * ternary statements are essentially one line if statements
		 */

		int x = 5000;
		int y = (x>30) ? 50 : 100;
		
//		System.out.println(y);
		
		
		/*
		 * let's try to write another ternary statement
		 * don't ALWAYS try to use ternary statements ....they can get messy
		 */
		y= (x>300) ? ((600==x) ? 8:9) : (methodZero() * 10) * ((100>x) ? methodZero() * 2:5);
		
//		System.out.println(y);
		
		
		
		
		///////////////////////////////////////////////SWITCH CASE STATEMENTS
		

//		int num = 1;
//		
//		if(num==1)
//			System.out.println("first");
//		else if(num==2)
//			System.out.println("second");
//		else if(num==400)
//			System.out.println("third");
//		else
//			System.out.println("fourth");
		
		
		
		int num = 2022;
		
		switch(num) {
			default:
				System.out.println("our last resort");
				break;
				/*
				 * note that even though default is first, it still won't trigger unless the condition is met
				 * HOWEVER, if the condition is met and there is no break in the default case, then it will cascade
				 * from where it is
				 */
			case 1:
				System.out.println("first");
				break;
			case 2022:
				//empty
			case 2:
				System.out.println("second");
				break;
			case 400:
				System.out.println("third");
				break;
			case 553:
				System.out.println("fourth");
				break;
		}
		
		

		
		////////////
		/*
		 * There are RULES for what datatypes can be used with switch cases in Java
		 * 
		 * acceptable datatypes:
		 * 	int, short, byte, char, (all of their respective wrapper classes), enum, String
		 * 
		 * these are ALL the wrapper classes:
		 *  Integer, Character, Short, Byte, Double, Long, Boolean, Float
		 *  
		 *  The switch case can only use the following wrapper classes:
		 *   Integer, Character, Short, Byte
		 */
		char myVar = 'x';
		
		switch(myVar) {
		case 't':
			System.out.println("stuff");
		default:
			System.out.println("default");
		}
		
		double myVar2 = 8.2;
		
		switch((int)myVar2) { //apparently you CAN cast it in the switch case "condition" - Gibbons 2022
		case 8: //the .2 is truncated
			System.out.println("stuff");
		default:
			System.out.println("default");
		}
		
	}
	
	
	
	static int methodZero() {
		return 0;
	}
	
	
	

	
	/*
	 * int myState = 33; <---the end user will type in this value in your website
	 * 
	 * if(myState == 0){
	 * 		//off logic
	 * 		//50 lines of code
	 * }else if (myState == 1){
	 * 		//idle logic
	 * 		//50 lines of code
	 * } else if (myState  ==2){
	 * 		//accelerating logic
	 * 		//50 lines of code
	 * }else if(myState == 3){
	 * 		//slowing logic
	 * 		//50 lines of code
	 * }
	 * 
	 * 
	 * 
	 * What if we used an enum (enumeration)?
	 * 
	 * public enum CarStates {
	 * 		OFF, IDLE, ACCEL, SLOWING;
	 * }
	 * 
	 * 
	 * CarStates myState = CarStates.ACCEL;
	 * 
	 * if(myState == CarStates.OFF){
	 * 		//off logic
	 * 		//50 lines of code
	 * }else if (myState == CarStates.IDLE){
	 * 		//idle logic
	 * 		//50 lines of code
	 * } else if (myState  ==CarStates.ACCEL){
	 * 		//accelerating logic
	 * 		//50 lines of code
	 * }else if(myState == CarStates.SLOWING){
	 * 		//slowing logic
	 * 		//50 lines of code
	 * }
	 */
}
