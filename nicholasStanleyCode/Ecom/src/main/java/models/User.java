package models;

import java.util.Objects;

/**
 * Ecom.models.User
 * @author njs33487
 *	2022-07-28
 *just a  dumb container
 */
public class User {

	// FIELDS
	private int userId;
	private String username;
	private String password;
	
/*
 * Constructors
 * getters and setters
 * toString()
 */
////////////////////////////////////////////////////////////
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public User(int userId, String username, String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

/////////////////////////////////////////////////////////////

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
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

///////////////////////////////////////////////////////////
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(password, userId, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && userId == other.userId
				&& Objects.equals(username, other.username);
	}
	
	
	
	
}
