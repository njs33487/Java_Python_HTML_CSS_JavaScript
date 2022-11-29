package demo.dao;

import demo.model.SuperHuman;

public class SuperHumanDao {

	/*
	 * A DAO stands for Data Access Object. DAOs are objects that has one purpose...to allows you to interact
	 * with the data in your system. DAOs can have many methods in them. The methods will general be simple
	 * CRUD methods.
	 * 
	 * What is CRUD?
	 * 	-Create
	 *  -Read (essentially this is accessing)
	 *  -Update
	 *  -Delete
	 *  
	 *  Normally our DAOs will be connected to a database, however, we haven't learned databases yet.
	 *  SO, I will store all our data right here in the data. We need to choose a structure to house
	 *  MULTIPLE entities (in our case SuperHumans).
	 */
	
//	public static void main(String[] args) {
//		//THIS MAIN METHOD EXISTS JUST FOR TESTING PURPROSES
//		
//		
//		SuperHumanDao myDao = new SuperHumanDao();
//		
//		
//		///////TEST createHuman
//		System.out.println(myDao.createHuman( new SuperHuman(-1, "Aayush", 100_000) ));
//		System.out.println(myDao.createHuman( new SuperHuman(-1, "Anthony", 100_000) ));
//		System.out.println(myDao.createHuman( new SuperHuman(-1, "Elijah", 100_000) ));
//		System.out.println(myDao.createHuman( new SuperHuman(-1, "Robert", 100_000) ));
//		
//		//////TEST readById
////		System.out.println(myDao.readHumanById(423));
//		
//		//////TEST readAll
////		System.out.println(myDao.readAllHumans());
////		
//		for(SuperHuman temp: myDao.readAllHumans()) {
//			System.out.println(temp);
//		}
//	}
	

	/*
	 * For my allSuperHumans container I need to keep track of:
	 * -the ACTUAL MAX elements of the array (which I can do using allSuperHumans.length)
	 * -the CURRENTLY USED elements of the array (which I'll make a variable called numOfSuperHumans)
	 */
	private static int numOfSuperHumans = 0;
	
	private static SuperHuman[] allSuperHumans=null; //currently set to null
	
	static {
		//Im using this static block to give initial conditions to our static members
		
		allSuperHumans = new SuperHuman[3];
		numOfSuperHumans = 3;
		
		allSuperHumans[0] = new SuperHuman(0, "Danny Boy", 320_000);
		allSuperHumans[1] = new SuperHuman(1, "Abyss", 300_000);
		allSuperHumans[2] = new SuperHuman(2, "Mars", 520_000);
	}
	
	/**
	 * The purpose of this method is to allow a user to give us information and create a new
	 * superhuman in the system.
	 * 
	 * @param myHuman this is the superhuman they want to enter the system (it will not contain an id field)
	 * @return true if the creation was successful, false otherwise
	 */
	public boolean createHuman(SuperHuman myHuman) {
		/*
		 * Our strategy:
		 * 
		 * 1. gain access to all the superhumans in the system
		 * 2. since our superhumans are in the form of an array, I can just insert the new superhuman
		 * 			into the NEXT index of the array.
		 * 
		 * we've realized that we'll get an ArrayIndexOutOfBoundsException if we suddenly add a new
		 * element to our array. So we need to increase the size of our array WHEN the index is larger
		 * than the array an support.
		 * 
		 * after some debuggin we realize our original strategy didn't cover EVERY scenario
		 * 
		 * Our FULL strategy should have been something like:
		 * 
		 *  1. gain access to all the superhumans in the system
		 *  2. check the array to see if it's already full.
		 *  		a. if it is full then create a new array that is larger
		 *  			and copy over the contents of the original array
		 * 	3. since our superhumans are in the form of an array, I can just insert the new superhuman
		 * 			into the NEXT index valid of the array.
		 */
		

		
//		int lastKnownIndex = allSuperHumans.length - 1;
		int lastKnownIndex = numOfSuperHumans - 1; //2
		
		//if the lastKnownIndex is outside the bounds of the array then we should create a new
		//		larger array.
		if(( lastKnownIndex+1) == allSuperHumans.length  ) {
			
			//Make a new variable that holds our original array, we name it "oldArray" so it's clear to read
			SuperHuman[] oldArray = allSuperHumans; //size 3
			
			//Let's make our new array that is twice as large as our original array
			SuperHuman[] newArray = new SuperHuman[oldArray.length*2]; //size 6
			
			//Now, let's copy the contents of our original array into our new array
			for(int i = 0; i< oldArray.length; i++) {//3 times
				newArray[i] = oldArray[i];
			}
			
			//Fnally, we no longer need the old array, so we can replace the memory address with a new address
			allSuperHumans = newArray;
		}
		
		myHuman.setShumanId(lastKnownIndex+1);
		allSuperHumans[lastKnownIndex+1] = myHuman;
		
		numOfSuperHumans++;
		
		return true;
	}
	
	
	/**
	 * The purpose of this method is to allow a user to type in a specific humanId then this method
	 * will find the superhuman in the system with that id then return that superhuman.
	 * 
	 * @param humanId the id of the superhuman they'd like to retreive
	 * @return is the superhuman with the matching id OR it returns null if no match is found
	 */
	public SuperHuman readHumanById(int humanId) {
		/*
		 * Before I start coding, let's think about our strategy for solving this method's problem.
		 * 
		 * My strategy:
		 * 1. gain access to ALL superhumans in the system.
		 * 2. cycle through all the superhumans and see if any of those humans' "humanId" variable matches
		 * 		the variable that the user typed in.
		 * 3. once I find a match, return that specific superhuman
		 */
		
		//step 1, we already have access to the superhumans array called "allSuperHumans"
		
		//step 2, how do we cycle through all superhumans in the array?
		for(int i=0; i<allSuperHumans.length; i++) {
//			System.out.println(i);
			if( humanId == allSuperHumans[i].getShumanId() ) {
				return allSuperHumans[i];
			}
			
		}
		
		return null;
//		return new SuperHuman();
	}
	
	/**
	 * This method is suppose to return ALL superhumans in the system
	 * we'll use an array to contain all said superhumans, since we only get
	 * to return ONE thing, we need an entity to return that contains everything at
	 * once.
	 * 
	 * @return is a memory address to an array of SuperHuman objects
	 */
	public SuperHuman[] readAllHumans() {
		/*
		 * How do I return all the humans in the system?
		 * 
		 * 1. gain access to the superhumans in the system.
		 * 2. translate all superhumans into an array because this method returns the datatype SuperHuman[]
		 * 3. return the array of superhumans
		 */
		
		return allSuperHumans;
	}
	
	
}
