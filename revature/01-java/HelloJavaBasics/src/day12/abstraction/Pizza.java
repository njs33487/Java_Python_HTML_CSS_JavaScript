package day12.abstraction;


/*
 * you CAN implement multiple interfaces, HOWEVER, this is NOT multiple inheritance
 */
public class Pizza extends Food implements Edible, Freezable {

	@Override
	public void goBad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breakDownIntoNutrients() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myDefaultMethod() {
		/*
		 * turns out....you CAN use super to get to interfaces you've implemented
		 */
		Edible.super.myDefaultMethod();
		Freezable.super.myDefaultMethod();
		
		System.out.println("in OVERRIDDEN default method");
	}

}
