package example.passby;

public class PassByDemo {

	public static void main(String[] args) {
		
		//https://blog.penjee.com/wp-content/uploads/2015/02/pass-by-reference-vs-pass-by-value-animation.gif
	
		int originalInt = 88;
		System.out.println(originalInt);//88
		alterInt(originalInt);
		System.out.println(originalInt);//88
		
		
		
		Animal originalAnimal = new Animal();
		System.out.println(originalAnimal.numOfAnimals); //10
		
//		alterAnimal(originalAnimal);
		alterAnimalTwo(originalAnimal);
		System.out.println(originalAnimal.numOfAnimals); //10

		
	}
	
	public static void alterInt(int copyOfInt) {
		copyOfInt +=12;
	}
	
	public static void alterAnimal(Animal copyOfAnimal) {
		copyOfAnimal.numOfAnimals+=25; //we are altering the COPY
	}
	

	public static void alterAnimalTwo(Animal copyOfAnimal) {
		copyOfAnimal = new Animal(); //here, we'll point it to a different memory address
		copyOfAnimal.numOfAnimals+=25; //we are altering the NEW object
	}

}
