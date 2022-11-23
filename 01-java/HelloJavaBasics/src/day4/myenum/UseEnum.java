package day4.myenum;

public class UseEnum {

	public static void main(String[] args) {
		CarStates myState = CarStates.ACCEL;
//		myState = 2; //not in Java
		CarStates.myStaticMethod();
		myState.myMethod();
		
		if(myState == CarStates.OFF) {
			
		}else if(myState == CarStates.IDLE) {
			
		} else if(myState == CarStates.ACCEL) {
			System.out.println("state 3");
		} else if(myState == CarStates.SLOWING) {
			
		}
		
		//WITHOUT enums
		int myIntState = 40;
		if(myIntState == 0) {
			
		}else if(myIntState == 1) {
			
		} else if(myIntState == 2) {
			
		} else if(myIntState == 3) {
			
		}
	}

}
