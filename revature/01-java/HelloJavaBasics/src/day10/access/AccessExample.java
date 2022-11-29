package day10.access;

/*
 * What is an access level?
 * -levels of control that determine who/what has access to a specific object/class/method/variable
 * 
 * Access Levels and Scopes are NOT the same things.
 * -Scopes define where a member exists (Lifespan)
 * -Access Levels define who has access to a member when it already happens to exist (permission)
 * 
 * Access Levels in Java?????
 * >public					In the class, package, children classes, and anywhere else
 * >protected				In the class, package, children classes
 * >(default)				In the class, package
 * 	(aka package private)
 * >private					In the class
 * 
 * The access modifiers are "public", "protected", and "private". Default is actually NOT
 * an access modifier...if you DON'T give the entity an access modifier then it will default
 * to the "default" access level.
 */
public class AccessExample {

	public static void main(String[] args) {
		//THIS SPACE IS TO SIMULATE THE "SAME PACKAGE, BUT DIFFERENT CLASS"

		Clothing clothing = new Clothing();
		
		System.out.println(clothing.type);
		System.out.println(clothing.material);
		System.out.println(clothing.color);
//		System.out.println(clothing.cost);  //cannot see a private member from the same package but different class

	}

}
