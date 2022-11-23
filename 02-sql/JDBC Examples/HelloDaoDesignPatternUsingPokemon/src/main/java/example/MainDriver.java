package example;

import java.util.Scanner;

import example.menu.MenuManager;
import example.model.Account;
import example.model.Pokemon;
import example.service.PokemonService;
import example.service.PokemonServiceImpl;

public class MainDriver {
	
	
	
	
	//I need a reference to the service layer objects
	public static PokemonService pokeServ = new PokemonServiceImpl();

	//user that is currently logged in
	public static Account currentUser = null;
	
	
	
	
	public static void main(String[] args) {
		
		//we need to take in input from our user, so we need a scanner class
		Scanner myScanner = new Scanner(System.in);

		
		//let's make an event loop for our application
		boolean loopActive = true;
		
		while(loopActive) {
			
			MenuManager.printMainMenu();
			
			String stringInput = myScanner.nextLine();
//			System.out.println(stringInput);
			
			switch(stringInput) {
				case "0":
				case "exit":
					loopActive = false;
					break;
				
				case "1":
				case "login":
					MenuManager.loginPrompt(myScanner);
					
					if(currentUser != null) {
						loggedInEventLoop(myScanner);
					}
					
					break;
				case "2":
				case "print current":
					System.out.println("Current user: "+ MainDriver.currentUser);
					break;
			}
		}
	}
	
	
	public static void loggedInEventLoop(Scanner myScanner) {
	
		/*
		 * this is going to be a separate event loop JUST for users that are logged in
		 */
		
		
		//IF THEY DO LOG IN
		while(currentUser  != null) {
			

			MenuManager.printLoggedInMenu();
			
			String stringInput = myScanner.nextLine();
			
			switch(stringInput) {
				case "1":
				case "all pokemon":
					System.out.println(pokeServ.getAllPokemon());
					break;
				case "2":
				case "insert pokemon":
					Integer pokeId = MenuManager.separateMethodForScannerIntInput(
							myScanner, "What is the poke's id number?" );
					
					if(pokeId != null) {
						
						System.out.println("What is the poke's name?");
						String pokeName = myScanner.nextLine();
						
						System.out.println("What is the first type?");
						String pokeType = myScanner.nextLine();
						
						System.out.println("What is the second type?");
						String pokeTypeTwo = myScanner.nextLine();
						
						pokeServ.addPokemon(new Pokemon(pokeId, pokeName, pokeType, pokeTypeTwo));
					}
					
					break;
				case "9":
				case "print current":
					System.out.println("Current user: "+ MainDriver.currentUser);
					break;
				case "0":
				case "logout":
					MainDriver.currentUser = null;
					break;
			}
		}
	}

}
