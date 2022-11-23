package day4.flowcontrol;

public class BreakContinueExample {

	public static void main(String[] args) {
		int i=0;
		
		while(i<5) {
			//from INSIDE of this loop's code block, I'd like to stop print at i=3
			i++;
			
			if(i==3) {
				continue; //continue will IMMEDIATELY go to the next iteration of the loop
//				break; //break will IMMEDIATELY exit the loop entirely
			}
			
//			System.out.println("i: "+i);
		}
		
//		System.out.println("end of program");

		
		
		
		
		
		///////////////////////////////////////////////////LABELS
		//a label is essentially a way to give a "name" to a loop
		
		elelventhan:
		for(int j=0; j<3; j++) {//the outer loop
			
			thebird:
			for(int k=0; k<3; k++) { //the inner loop
				//FROM INSIDE OF THIS LOOP
				//I don't want j to print out the value of 1, AND I don't want "end of the outer loop" to appear
				//   for that iteration, without changing the value of j
				
				if(j==1) {
//					break; // this is the same thing as "break thebird"
//					break thebird;
//					break idontknow;
					continue elelventhan;
				}
				
				System.out.println("j: "+ j + " k: "+ k);

			}
			
			System.out.println("end of the outer loop");
		}
		
		
		
		
		
		

		//you CAN use labels with an if statement
		apple:
		if(i<9) {
			break apple; //you CAN use a break statement in an if statement IF you have a label
		}
		
		
		
		
		System.out.println("end");
	}

}
