package day15.exceptions;

public class CustomExceptionDriver {

	public static void main(String[] args) {
		RubberDuckException myDuck = new RubberDuckException();
//		throw myDuck; //we have DEFINITELY created a checked exception
		

		RubberDuckRuntimeException myRunDuck = new RubberDuckRuntimeException();
//		throw myRunDuck; //we have DEFINITELY created an unchecked exception

		
		
		
		///////////////////////////DEMO OF THE OTHER CONSTRUCTORS
		RubberDuckException myDuck2 = new RubberDuckException("Wait...what?");
		RubberDuckException myDuck3 = new RubberDuckException("Muffin Button", myDuck2);
		
		RubberDuckRuntimeException myRunDuck2 = new RubberDuckRuntimeException("Where'd you get that muffin?", myDuck3);
		
		throw myRunDuck2;
	}

}
