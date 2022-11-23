package day5.methods;

public class MethodExample {
	
	

	/*
	 * Method Signature:
	 * 
	 * 
	 * 	[modifier(s)]	[return type]	[method name]		(	[parameter list]	)	{
	 * 				//the method's logic
	 * 	}
	 * 
	 * 
	 * What is the return type / returning value?
	 * 		a returning value is a value that will replace the method's call/invocation for further
	 * 		calculation/functionality
	 * 		for example:  let's assume a method15() will return 5;
	 * 					int i = method15() + 10;
	 * 					then i will equal 15.
	 * 		The return type is the datatype that the return value is allowed to be
	 * 
	 * 
	 * What is a "void" return type?
	 * 		void simply means that there IS NO returning value; you're opting out of the return value.
	 * 
	 * 	What is a modifier(s)?
	 * 	a keyword used to modify the functionality of a method/variable/class/interface
	 * 		(not just access level modifier, like most initially think)
	 * 
	 * Types of modifiers?
	 * 	public, protected, private, final, default, abstract, static, synchronized, transient, etc
	 * 
	 * 
	 * 
	 * Question: what is the difference between a parameter and an argument?
	 * 		>a parameter is apart of the method's signature, it is declaring what type of variable will be accepted
	 * 		into the method call/invocation
	 * 		>an argument is the actual value placed into the method call/invocation
	 */
	
	public static int method1(int i, String s, char c) { // <-----THIS is a parameter
//		int i=5;
		System.out.println("begin cycle");
		i=i+5;
		i=i*3;
		System.out.println("i: "+i);
		System.out.println("end cycle");
		
		if(i>10) {
			return i;
		}else if(i<=10) {
			return -1;
		}else {
			return -100;
		}
	}
	
	public static void method2() {
		//you are able to have an empty parameter list
		
		//in a void method you CAN return.....you won't return a value...you'll just return
		return;
	}
	
	

	public static void main(String[] args) {
		
		method1(150, "hello", 'T');  //<----THIS is an argument
		
		for(int j=0; j<50; j++) {
			method1(j, "world", 'C'); //THIS is how you invoke a method
					//aka this is how you "call" a method
		}


		/*
		 * What is wrong with redundant code?
		 * 	>readability
		 * 	>maintainability
		 * 		>>the code has far more lines than necessary, the code is bloated
		 * 		>>and takes more time to update the code base
		 * 	>promotes update anomalies
		 * 		>>aka if you accidentally miss one (or more) of the updates
		 * 
		 * 
		 * 
		 * Modularization is how we defeat redundancy
		 * 
		 * What is modularization?
		 * 	>>the process of creating a module of reusable functionality.
		 * 	>>for example, creating a method out of functionality instead of copying and pasting
		 * 
		 * use the DRY principle (Don't Repeat Yourself)
		 * 
		 */
		
		//this is our logic
//		int i=5;
//		System.out.println("begin cycle");
//		i=i+5;
//		i=i*3;
//		System.out.println("i: "+i);
//		System.out.println("end cycle");
//		/////
//		i=5;
//		System.out.println("begin cycle");
//		i=i+5;
//		i=i*3;
//		System.out.println("i: "+i);
//		System.out.println("end cycle");
//		/////
//		i=5;
//		System.out.println("begin cycle");
//		i=i+5;
//		i=i*3;
//		System.out.println("i: "+i);
//		System.out.println("end cycle");
		/////
		//////continue this trend 47 more times

	}

}
