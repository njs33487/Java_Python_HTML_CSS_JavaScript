package demo;

import java.util.Scanner;

import demo.dao.SuperHumanDao;
import demo.model.SuperHuman;

/*
 * We are about to build an application together.
 * 
 * The application will print a menu to the user. The user then selects an functionality from the menu
 * by typing in data. Once our program gets data from the input from the user it will perform that functionality
 * THEN it will respond to the user to let the user know the functionality has been completed.
 * 
 * I'll be making a menu that supports "SuperHuman" objects. The menu will do things like show the user
 * ALL superhumans in the system, allow the user to create new superhumans and insert them into the sytem,
 * update a existing superhumans, etc.
 * 
 * This is MY preference for how to start coding:
 * 
 * 1. I need to create my model(s) because I have a hard time creating code for a model I don't even know.
 * 		For example, how can I write code to get a variable when I dont' know its name yet
 * 2. After I know what structure each individual data entry uses, I need to create a structure
 * 		that holds ALL my data entries in the system. I need to know how to access/mutator the all
 * 		data in the system.
 * 3. I need to figure out how to take in input from the user (later we'll use that input to do stuff)
 * 4. Let's see if we can create an "event loop" for our program to continously take in input
 * 		instead of taking in input and then stopping
 * 5. let's create an exit condition for our event loop
 */
public class MainDriver {


	public static void main(String[] args) {
		System.out.println("WELCOME TO OUR PROGRAM!!!!");

		//we need to take in input from our user, so we need a scanner class
		Scanner myScanner  = new Scanner(System.in);
		
		
		
		///let's make an EVENT LOOP for our application
		boolean loopActive = true;
		SuperHumanDao myDao = new SuperHumanDao();
		
		while(loopActive) {
			printMenu();
			
			String userInput = myScanner.nextLine();
			System.out.println("\n\n\n");
			
			
			
			switch(userInput) {
				case "0":
				case "select all superhumans":
				case "all":
					SuperHuman[] allHumans = myDao.readAllHumans();
					
					for(SuperHuman temp: allHumans) {
						System.out.println(temp);
					}
					break;
				case "1":
				case "select superhuman by id":
				case "id":
					System.out.println("-------------------------");
					System.out.println("What id would you like to select?");
					int userInputId = Integer.parseInt(myScanner.nextLine());
					
					SuperHuman targetHuman = myDao.readHumanById(userInputId);
					
					System.out.println(targetHuman);
					System.out.println("-------------------------");
					break;
					//System.out.println("2. create new superhuman");
					
				case "2":
				case "create":
				case "create new superhuman":
						System.out.println("-------------------------");
						System.out.println("What is the name of the superhuman you'd like to insert?");
						String userInputName = myScanner.nextLine();
						System.out.println("What is the bounty of the superhuman you'd like to insert?");
						int userInputBounty = Integer.parseInt(myScanner.nextLine());
					
						myDao.createHuman(new SuperHuman(-1, userInputName, userInputBounty));
						

						System.out.println("-------------------------");
						break;
				case "9":
				case "exit":
					loopActive = false;
					break;
				default:
					
					System.out.println("The option you've entered is invalid. Please try again.");
					break;
					
			}
			//end of the switch case
			
		}
		
		System.out.println("good bye!!!!");
		
	}

	
	
	public static void printMenu() {
		System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>MENU OPTIONS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(">>>>>you have the following commands you can type in<<<<<");
		System.out.println("0. select all superhumans");
		System.out.println("1. select superhuman by id");
		System.out.println("2. create new superhuman");
		System.out.println("9. exit");
	}
}
