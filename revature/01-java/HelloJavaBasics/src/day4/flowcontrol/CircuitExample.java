package day4.flowcontrol;

public class CircuitExample {

	public static void main(String[] args) {
		
		
		int i= 40;
		
		if(i==41 & method1()) {
			System.out.println("In our if-block");
		}else {
			System.out.println("In our else-block");
		}
		
		/*
		 * Shortcircuiting (if the outcome has already been determined, shortcircuit operators
		 * 								will cease calculation)
		 * 
		 * Shortcircuiting operators:
		 * 		&& , ||
		 * 
		 * Bitwise operators (always run all elements))
		 * 		& , |
		 * 
		 * 
		 * 
		 * logical AND:  &  and &&
		 * logical OR:   |   and ||
		 */

	}
	
	
	
	public static boolean method1() {
		
		/*
		 * 
		 * What if this method did the following:
		 * 
		 * executed 7000 lines of code that takes 5 minutes to complete
		 * 
		 * OR
		 * 
		 * what happens if there is some logic here that we should ALWAYS perform
		 * (for example, calling your database to update some statistics)
		 */
		System.out.println("In our method!!!");
		return true;
	}

}
