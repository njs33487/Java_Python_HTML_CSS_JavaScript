package day12.abstraction;

public abstract class Fruit extends Food {


	/*
	 * ABSTRACT METHOD
	 * Note: the child class MUST override any abstract methods before
	 * the object can be concrete. So if your child class itself is an abstract class
	 * then your child DOESN'T need to override this method....instead your concrete GRANDCHILD
	 * must override the method.
	 * (while your abstract class isn't FORCED to override your abstract method, it CAN to save
	 * your grandchild the headache of overriding)
	 */
	@Override
	public void goBad() {
		//this is an EMPTY implementation of a method...but it IS an implementation none the less.
	}
}
