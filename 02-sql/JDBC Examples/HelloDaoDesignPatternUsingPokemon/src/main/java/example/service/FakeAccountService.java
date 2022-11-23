package example.service;

import example.model.Account;

public class FakeAccountService {
	
	private static Account mockDataBaseReturn = new Account("tchester", "password", "admin");

	
	public Account getUserDataFromDatabase() {
		return mockDataBaseReturn;
	}
}
