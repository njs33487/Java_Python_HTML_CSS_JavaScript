package day10.access.subpackages;

import day10.access.Clothing;

public class AccessExampleSubpackage {
	

	public static void main(String[] args) {
		//THIS SPACE IS TO SIMULATE THE "SUBPACKAGE"
		
		Clothing clothing = new Clothing();
		
		System.out.println(clothing.type);
//		System.out.println(clothing.material); //cannot see a protected member from a subpackage
//		System.out.println(clothing.color); //cannot see a default member from a subpackage
//		System.out.println(clothing.cost); //cannot see a private member from a subpackage

		//SUMMARY, the "subpackage" does not count as the "same package"

	}
}
