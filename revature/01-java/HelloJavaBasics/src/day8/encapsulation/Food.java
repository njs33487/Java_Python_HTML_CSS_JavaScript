package day8.encapsulation;




/*
 * What is wrong with my class?
 * -It isn't properly encapsulated
 * 
 * HOW do I properly encapsulate?
 * -Make my fields private
 * -And make getters & setters that have greater visibility than private
 * 
 * WHY do I bother to encapsulate my fields?
 * -so you can modify the algorithms without breaking other code (backwards compatability)
 * -we can insert secondary logic/code (for example, you may update a database in your getter)
 * -data validation (for example, making sure your food calories value never go negative)
 * -protect sensitive information
 */
public class Food {


	/*HYPOTHETICALLY
	 * PRETEND...that I found a way to make my class 20 times more efficient....
	 * ...BUT....the first step I need to take is to store my variables in an
	 * array instead of as separate variables....
	 */
	
	/*
	 * Index 0 is now the "name" variable, index 1 is now the "recipe" variable
	 */
//	public String[] myVars = {"foodName", "foodRecipe"};
	private String[] myVars = {"foodName", "foodRecipe"};
	
//	public String name = "foodName";
//	public String recipe = "foodRecipe";
	
	
//	private String name = "foodName";
//	private String recipe = "foodRecipe";
	
	
	////////////////////////GETTERS & SETTERS
	//					AKA "accessor" and "mutators"
	public String getName() { //THIS is the CONVENTION for a getter method signature, don't deviate
//		return name;
		return myVars[0];
	}
	
	public void setName(String name) { //THIS is the CONVENTION for a setter method signature, don't deviate
//		this.name= name;
		myVars[0] = name;
	}
	
	public String getRecipe() {
		/*
		 * we can ALSO insert other logic into getters and setters
		 * but we CAN'T insert other logic into direct variable interactions
		 * 
		 * Examples:
		 * -what if we wanted to update a database of information every time someone accessed
		 * this variable? I can do that when the variable is encapsulated
		 * -what if I wanted to save data to a file?
		 * -what if I wanted to trigger an animation whenever they access this variable?
		 */
		System.out.println("Hello Getter!!!");
		
//		return recipe;
		return myVars[1];
	}
	
	public void setRecipe(String newRecipe) {
		/*
		 * ALSO, we can validate input from getters and setters as well
		 * but we CAN'T validate input from direct variable interactions
		 */
		
		if(myVars[1].equals(""))
			myVars[1] = "hello World";
		
//		recipe=newRecipe;
		myVars[1] = newRecipe;
		
	}
}
