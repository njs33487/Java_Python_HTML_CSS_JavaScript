package codingtips;

public class CodingTips {

	/*
	 * Talk about:
	 * 
	 * -Divide up your problem into smaller bite sized chunks (divide and conquer)
	 * -Outline your logic in english sentences before you start coding
	 *		-you can even outline your logic using comments first
	 *-After you've written a few lines of code, write a test scenario in the main method to see if the code works
	 *		-do NOT write 1,000 lines of code and assume your logic is flawless
	 *		-you need frequent feedback to make sure you're going in the right direction
	 * -Rubber duck programming
	 * -Paired Programming
	 */
	public static void main(String[] args) {

		//Step 1: do x
		
		//Step 2: do y
		
		//Step 3: do z
		
		//and so on.....
		
		/*
		 * Demo of a main method Test Driven Development approach
		 */
		
		int myVar= 0;
		
		for(int i=0; i<120; i++) {
			System.out.println("stuff is happening");
			myVar++;
		}
		System.out.println("test 1: "+myVar); //test 1
		
		myVar /= 60;
		myVar += 45;
		
		System.out.println("test 2: "+myVar); //test 2
		
	}

}
