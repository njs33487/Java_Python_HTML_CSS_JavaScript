package example.model;

public class Account {

	private String username;
	private String password;
	private String accountType;
	
	/*
	 * no arg constructor
	 * all arg constructor
	 * getters & setters
	 * toString
	 */
	
	public Account() {
	}

	public Account(String username, String password, String accountType) {
		super();
		this.username = username;
		this.password = password;
		this.accountType = accountType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "\nAccount [username=" + username + ", password=" + password + ", accountType=" + accountType + "]";
	}
}
