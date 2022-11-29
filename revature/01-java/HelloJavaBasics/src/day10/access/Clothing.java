package day10.access;

public class Clothing {
	
	public String type = "shirt";
	protected String material = "cotton";
			  String color = "blue";
	private int cost= 500;
	
	public void printer() {
		//THIS SPACE IS TO SIMULATE THE "SAME CLASS"
		System.out.println(type);
		System.out.println(material);
		System.out.println(color);
		System.out.println(cost);
		
		//you can STILL access private methods in the same class
		privateMethod();
	}
	
	private void privateMethod() {}


	/////////////INNER CLASSES
	public class InnerClassA{}
	private class InnerClassB{}
	

	////////////CONSTRUCTORS
	public Clothing() {
	}
	
	protected Clothing(int i) {
	}

	
	private Clothing(int i, char c) {
		/// you CAN have a private construtor
	}

	public static Clothing clothingGenerator() {
//		new Clothing();
		return new Clothing(5, 't');
	}
	
	///STATIC METHODS
	public static void myStaticMethod() {
		
	}

////////INITIALIZER BLOCKS
	//public{
	////no, you cannot have access mods on an initializer block	
	//}

}
