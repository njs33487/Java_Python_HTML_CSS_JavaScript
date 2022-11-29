package day15.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class ExceptionExample {

	public static void main(String[] args) /* throws IOException */{
		
		Object obj = new Object();
//		throw obj; //you can only throw a throwable object
		
		//////////////////CHECKED EXCEPTION
		
		Exception myEx = new Exception();
//		throw myEx; //you MUST "handle" a checked exception
		
		try {
			/*
			 * the try-catch block is how you "handle" an exception; well, it's ONE of the ways
			 * 
			 * The purpose of a try block is to attempt volatile code. You "try" the volatile code
			 * and if the volatile code behaves poorly then you have a "catch" block with some
			 * fallback, less volatile, code.
			 */
//			System.out.println("In the try block");
			boolean myBool = true;
			
			if(myBool) {
				throw myEx;
			}else {
				throw new IOException();
			}
			
		}catch(IOException otherException) {

			/*
			 * We CAN have multiple catch blocks....but the order of the catch blocks matters.
			 * 
			 * Because IOException is a type of Exception....having the Exception catch block
			 * higher than the RuntimeException catch block means that the RuntimeException
			 * will NEVER actually be called....because the Exception catch block will catch
			 * all RuntimeExceptions before that catch even has a chance. In short, the RuntimeException
			 * catch block is UNREACHABLE CODE
			 * 
			 * (in other words, broader catch blocks go lower than more specific catch blocks)
			 */
//			System.out.println("In my second catch block, here I deal with SPECIFICALLY IOExceptions");
			
		}catch(Exception targetException) {

			/*
			 * The catch block is a type of flow control, it's branching logic.
			 * 
			 * note: parentheses behind the catch operates as a condition AND a parameter list.
			 * The catch block ONLY triggers when that type of exception is thrown....make it operate
			 * similar to a condition like in an "if-block". After the catch block triggers you're then
			 * handed a reference variable of that exception much like an argument in a method.
			 * 
			 * HERE I can enter fallback logic in case I get an exception
			 * 
			 * 
			 * 
			 * you can try to resolve exceptions in a catch block; although how you "resolve"
			 * your issue will depend on what the issue actually is. For example, if the exception
			 * arises because the user has forgotten to enter in a variable value then you could possible
			 * have the catch block provide a DEFAULT value.
			 * 
			 * So:
			 *    userVariable = 0; //and this could be a simple default value that triggers
			 */
//			System.out.println("In the catch block 1");
//			targetException.printStackTrace();
//			System.out.println("In the catch block 2");
//			targetException.
			

		}
		
//		System.out.println("end of program");
		
		
		
		
		
		//////////////UNCHECKED EXCEPTION
		RuntimeException myRunEx = new RuntimeException();
//		throw myRunEx;
//		System.out.println("stuff"); //look at what happens when you have a line of code AFTER the
				//unchecked exception is thrown. You get an "unreachable code" error
		
		//Can I catch a Runtime Exception?
		try {
			throw myRunEx;
		}catch(RuntimeException e) {
//			System.out.println("Can I actually catch a runtime exception?");
		}
		
		

		/////////QUICK QUESTION...WHY is there a distinction between checked and unchecked exceptions?
		/////LET'S DEMO SOME UNCHECKED EXCEPTIONS
		int x = 5;
		int y = 0;
		
//		System.out.println(x/y); //THIS will produce an ArithmeticException
		//what if EVERY division has to be in a try-catch block? Would that be manageable?
		
		Object obj2 = null;
//		obj2.toString(); //THIS will produce a NullPointerException
		//what if EVERY method call has to be in a try-catch block? Would that be manageable?
		

		int[] myArray = {0,20,40};
//		System.out.println(myArray[5]);//THIS will produce a ArrayIndexOutOfBoundsException
		//what if EVERY array has to be in a try-catch block? Would that be manageable?
		

		/*
		 * SO my point is...that runtime exceptions exist for TWO reasons:
		 * 
		 * First, some operations are FAR too common to surround in try catch blocks; it'll bloat your code
		 * and make it more unreadable
		 * 
		 * Second, runtime exceptions are EASILY avoidable with very simple conditions (if statements, for loops, etc);
		 * 		while regular exceptions are a little more unavoidable
		 */
		
		

		///////////////LET'S TAKE A LOOK AT THE USECASE FOR A RUNTIME EXCEPTION
//		methodMyCoworkerWillUse(50);
//		methodMyCoworkerWillUse(-5);
		
		

		////////////////////LET'S TAKE A LOOK AT THE STACK TRACE IN MORE DETAIL
		/*
		 * Format of the stack trace:
		 * 
		 * Exception in [thread] [package].[class] : [additional message]
		 * 		at [package1].[method1] ([file-name1] : [line number] )  <---most recent method
		 * 		at [package2].[method2] ([file-name2] : [line number] )  <---NEXT most recent
		 * 		at [package3].[method3] ([file-name3] : [line number] )  <---and so on....
		 */
//		stackTraceMethod1();
		
//		Thread.dumpStack(); //you can ALSO randomly print the stack trace should you desire...I guess?
		

		
		
		/////////////CAN I THROW AN ERROR? AND CAN I CATCH AN ERROR?
		Error myError = new Error();
//		throw myError; //yes, we can
		
		try {
			throw myError;
		}catch(Error e) {
			/*
			 * But WHY would we ever catch an error?
			 * 
			 * Can we download more RAM? Well, no......you may catch an error to log the error to a log file
			 * so that your team will know WHAT ISSUE keeps killing your program and keeping your tens of millions
			 * of customers from buying.
			 * 
			 * So you'll basically log "THIS IS WHAT KILLED MEEEEEE~!!!!"
			 */
//			System.out.println("Wait...can I seriously catch an error?");
		}
			
			
			

		///////////////////CAN I THROW A THROWABLE? AND CAN I CATCH A THROWABLE?
		Throwable throwable = new Throwable();
//			throw throwable; //yes, we can
			
		try {
			throw throwable;
		}catch(Throwable t) {
//				System.out.println("WAIT....can I really catch a throwable?");
		}
			
			

			

		//////////////////////IS THERE ANOTHER WAY WE CAN "HANDLE" A CHECKED EXCEPTION?
		/*
		 *We can use the "throws" keyword...aka a concept called "ducking"
		 * It's called "ducking" because we're ducking responsibility
		 *	
		 * When we use the "throws" keyword, the invoking method now has to "handle" the exception,
		 * we no longer need to.
		 * 
		 * When deciding whether to use try-catch or to use ducking try to ask yourself this question:
		 * "Do I know how to solve the issue? Or is the invoking method the only entity that knows how to solve
		 * 		the problem?"
		 * 
		 * Just imagine a car diagnostic business telling you that you need your oil changed versus telling you that
		 * you need to raise a few thousand dollars because you need a new engine.
		 */
		try {
			checkedMethod1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
	}
	
	
	

	/////////////////DEMO OF A USECASE FOR THROWS KEYWORD

	/**
	 * Send this method a filepath in the form of a string, like:
	 * "./folder1/folder2/file"
	 * 
	 * @param s a file path
	 * @exception FileNotFoundException for any jerks
	 */
	public static void methodMyCoworkerWillUseTWO(String s) throws FileNotFoundException {
			throw new FileNotFoundException(); //this is a Exception (checked)
		
	}
	
	
	
	

	//////////////DEMO OF THROWS KEYWORD
	public static void checkedMethod1() throws IOException {
		checkedMethod2();
	}
	
	public static void checkedMethod2() throws IOException {
		
		throw new IOException();
		
//		try {
//			throw new IOException();
//		}catch(IOException e) {
//			System.out.println("this is how we NORMALLY handle an exception");
//		}
	}
	
	

	
	
	
	
	
	
	///////////////////DEMO OF THE STACK TRACE
	public static void stackTraceMethod1() {
		stackTraceMethod2();
	}
	
	public static void stackTraceMethod2() {
		stackTraceMethod3();
	}

	public static void stackTraceMethod3() {
//		throw new NullPointerException();
		throw new NullPointerException("This is an additional message. BARNACLES!!!");
	}
	
	
	
	
	
	
	
	

	
	/////////////////DEMO OF A USECASE FOR RUNTIMEEXCEPTIONS
	
	/**
	 * In your documentation you say that this method should ONLY take in
	 * zero or positive numbers...if you EVER give me a negative number i'll
	 * give you an exception, jerk
	 * 
	 * @param i a non-negative number
	 * @exception InputMismatchException for any jerks
	 */
	public static void methodMyCoworkerWillUse(int i) {
		if(i<0)
			throw new InputMismatchException(); //this is a RuntimeException (unchecked)
		
		System.out.println("This is the number they game me: "+ i);
	}

}







