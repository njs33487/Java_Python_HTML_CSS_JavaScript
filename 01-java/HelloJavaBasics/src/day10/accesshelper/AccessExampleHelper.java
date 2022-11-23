package day10.accesshelper;

import day10.access.Clothing;

public class AccessExampleHelper extends Clothing {
	
	void myChildMethod() {
		//THIS SPACE IS TO SIMULATE THE "DIFFERENT PACKAGE, CHILD CLASS"

		System.out.println(super.type);
		System.out.println(super.material);
//		System.out.println(super.color); //cannot see a default member from a child class
//		System.out.println(super.cost); //cannot see a private member from a child class
	}
	

	public static void main(String[] args) {
		//THIS SPACE IS TO SIMULATE THE "DIFFERENT PACKAGE, NOT CHILD CLASS"

		Clothing clothing = new Clothing();
		
		System.out.println(clothing.type);
//		System.out.println(clothing.material); //cannot see a protected member from a different package class
//		System.out.println(clothing.color); //cannot see a default member from a different package class
//		System.out.println(clothing.cost); //cannot see a private member from a different package class

	}

}
