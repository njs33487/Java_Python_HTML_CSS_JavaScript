package day8.encapsulation;


public class EncapExample {

	public static void main(String[] args) {
		
		
		Food food = new Food();
		
//		food.name = "pancakes";
//		System.out.println(food.name);
//		System.out.println(food.recipe);
		
		food.setName("waffles");
		System.out.println(food.getName());
		System.out.println(food.getRecipe());

	}

}
