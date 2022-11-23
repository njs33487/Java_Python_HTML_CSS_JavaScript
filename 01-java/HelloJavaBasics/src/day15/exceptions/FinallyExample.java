package day15.exceptions;

public class FinallyExample {

	public static void main(String[] args) {
		
		
		boolean myBool = false;
		
		try {
			System.out.println("In the try block");
			
			if(myBool) {
				throw new IndexOutOfBoundsException();
			}else {
//				System.exit(0);
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("In the catch block");
//			e.printStackTrace();
		}finally {
			/*
			 * The objective of the finally block is to run its logic regardless of whether or not
			 * there is an exception thrown. The finally is often used as a place to put cleanup
			 * logic, like cleaning up memory, closing streams, etc.
			 * 
			 * We USED to use the finalize() method, which is called while the garbage collector
			 * is disposing of your objects. But now, we just use the finally block.
			 * 
			 * Will the finally block ALWAYS run?
			 * 
			 * TECHNICALLY there are cases where the finally block won't run:
			 * 1.System.exit()
			 * 2.System Failure/fatal error
			 */
			System.out.println("In the finally block");
		}
		
		System.out.println("other logic");
		
		

		/*
		 * We MAY have:
		 * -a try-catch block
		 * -a try-finally block (as long as the try doesn't contain a checked Exception)
		 * -a try-catch-finally
		 *
		 * We may NOT have:
		 * -a try block by itself
		 * -a catch block by itself
		 * -a finally block by itself
		 * -a catch-finally block
		 */
		try {
//			throw new Exception();
		}finally {
			
		}
		
		
		
		
		
		

		///////////RANDOM FUN WITH EXCEPTIONS AND RETURNS
		System.out.println(method1());
		System.out.println(method2().myVar);
	}

	
	

	
	/*
	 * Let's see some strangeness in Java.......don't do this at home, kids.
	 */
	public static int method1() {
		
		try {
//			throw new Exception();
		}catch(Exception e) {
			return 15;
		}finally {
			return 30;
		}
		
//		return 0;
	}
	
	public int myVar = 0;
	
	public static FinallyExample method2() {
		
		FinallyExample myObj = new FinallyExample();
		
		try {
//			throw new Exception();
		}catch(Exception e) {
			myObj.myVar=40;
			return myObj;
		}finally {
			FinallyExample myObj2 = new FinallyExample();
			myObj2.myVar=60;
			return myObj2;
		}
		
//		return 0;
	}
}
