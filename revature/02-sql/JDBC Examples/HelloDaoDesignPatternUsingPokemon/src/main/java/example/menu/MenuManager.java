package example.menu;

import java.util.Scanner;

import example.MainDriver;
import example.model.Account;
import example.service.FakeAccountService;

public class MenuManager {

	public static void printMainMenu() {
		System.out.println("\n\n\n>>>>>>>>>>MAIN MENU OPTIONS<<<<<<<<<<");
		System.out.println(">>>>>You have the following commands you can type in<<<<<");
		System.out.println("1. login");
		System.out.println("2. print current user");
		System.out.println("0. exit");
		System.out.println();
	}
	
	public static void printLoggedInMenu() {

		System.out.println("\n\n\n>>>>>>>>>>LOGGED IN MENU OPTIONS<<<<<<<<<<");
		System.out.println(">>>>>You have the following commands you can type in<<<<<");
		System.out.println("1. select all pokemon");
		System.out.println("2. create pokemon");
		System.out.println("9. print current user");
		System.out.println("0. logout");
		System.out.println();
	}
	
	public static Integer separateMethodForScannerIntInput(Scanner myScan, String prompt) {
		System.out.println(prompt);
		
		try {
			String numberInput = myScan.nextLine();
			int numberConverted = Integer.parseInt(numberInput);
			return numberConverted;
		}catch(NumberFormatException e) {
			System.out.println("Sorry, you entered text that is not a number; taking you back to the main menu");
		}
		
		return null;
	}
	
	public static void loginPrompt(Scanner myScanner) {
		
		//ask the user for the username input
		System.out.println("What is your username?");
		String username = myScanner.nextLine();
		
		
		//ask the user for the password input
		System.out.println("What is your password?");
		String password = myScanner.nextLine();
		
		//get the REAL user object from the database
		FakeAccountService myAccountServ = new FakeAccountService();
		
		Account accountFromDatabase = myAccountServ.getUserDataFromDatabase();
		String realUsername = accountFromDatabase.getUsername();
		String realPassword = accountFromDatabase.getPassword();
		
		
		//check to see if the input username and password matches the REAL userrname and password
		if(username.equals(realUsername) && password.equals(realPassword)) {
			
			MainDriver.currentUser = accountFromDatabase;
			
		}else {
			System.out.println("Incorrect credentials. Try again.");
		}
	}
}
