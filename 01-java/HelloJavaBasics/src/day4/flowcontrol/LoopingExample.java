package day4.flowcontrol;

public class LoopingExample {

	public static void main(String[] args) {
		/*
		 * 	FORMAT FOR A WHILE LOOP
		 * 
		 * while ( [condition]  ) {
		 * 		//repeat said logic while the condition is true
		 * }
		 * 
		 *		*continues logic down here WHEN THE CONDITION BECOMES FALSE*
		 */
		
		int myCounter = 5;
		
		while(myCounter>0) {
//			System.out.println("In my while loop: " + (--myCounter));
			--myCounter;
		}
		
		boolean myBool = false;
		
		//80000 lines of code between this loop and the variable
		
//		while(myBool) {
//			System.out.println("in the loop");
//		}
		
//		System.out.println("end");
		
		

		/*
		 * do while
		 * 
		 * A "do while" loop ALWAYS runs at least once. Other than that, it's identical to a while loop.
		 */
		
		boolean bool2 = false;
		
		while(bool2) {
			System.out.println("in regular while loop");
		}
		
		do {
//			System.out.println("in do while loop");
		}while(bool2);

		
		
		
		

		
		////////////FOR LOOP
		/*
		 * 		for(  [assignment or declaration]  ;  [condition] ; [assignment]  ){
		 * 			//condition true logic
		 * 		}
		 */
		
		/*
		 * 		while vs for
		 * 
		 * 	while(  [while the user is still logged in] ){
		 * 		//logic
		 * 	}
		 * 
		 * 	for(int i=0; i<array.length; i++) {
		 * 		//generally used for some countable number of events
		 * 	}
		 */
		
		
		for(int j=0; j<3; j++) {
//			System.out.println("J: "+j);
		}
		
		
		//let's see the extend of for loops
		String doesntRelate;
		int k=0;
		for(doesntRelate="hello"; bool2; doesntRelate="world") {
			System.out.println("K: "+ k);
		}
		
//		boolean myBool3 = true;
//		for( ; myBool3 ; ) {
//			System.out.println("hello");
//		}
		
		//as it turns out...this is an infinite loop
//		for(;;) {
//			
//		}
		
//		System.out.println("end");
		
		
		
		
		
		


		///////enhanced for loop (aka for each loop)
		/*
		* 		for(  [temporary holder variable] : [array reference] ) {
		* 			//logic to perform on EACH element of the array
		* 			//enhanced forloops will AUTOMATICALLY increment...one time for each element
		* 		}
		*/
		int arry[] = {7, 89, 90, 65};
		String myStringArr[] = {"hello", "hola", "ohayou"};
//		System.out.println(myStringArr.length);
			
		for(int myTempVari: arry) {
			System.out.println("in our enhanced for loop: "+myTempVari);
		}
		
		//how do we iterate through an array with a NORMAL for loop
		for(int y=0; y<myStringArr.length; y++) {
			System.out.println("other: "+ myStringArr[y]);
		}
		
		
		
		
	}

}
