package day4.myenum;

public enum CarStates {
	OFF, IDLE, ACCEL, SLOWING;
	
	int canIHaveAVar= 0;
	
	private CarStates() {
		canIHaveAVar= 50;
	}
	
	public void myMethod() {
		System.out.println("prints the enum method? "+ canIHaveAVar);
	}
	
	public static void myStaticMethod() {
		System.out.println("prints static members?");
	}
}
