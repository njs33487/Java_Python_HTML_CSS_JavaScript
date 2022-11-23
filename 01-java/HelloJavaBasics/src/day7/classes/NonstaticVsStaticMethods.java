package day7.classes;

public class NonstaticVsStaticMethods {

	void nonStaticMethod() {
		System.out.println( "method triggered");
	}
	
	static void staticMethod() {
		System.out.println("static method triggered");
	}
	
	public static void main(String[] args) {
		
		NonstaticVsStaticMethods myExample = new NonstaticVsStaticMethods();
		myExample.nonStaticMethod();
		

		//for static methods you do NOT need an object
//		NonstaticVsStaticMethods.staticMethod();
		staticMethod();

	}

}
