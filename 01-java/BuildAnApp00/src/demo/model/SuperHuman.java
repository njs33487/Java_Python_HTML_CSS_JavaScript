package demo.model;

public class SuperHuman {
	/*
	 * The model package holds all of our "models"/"containers". Remember, an object simply models
	 * real world objects...so we make a package called "model".
	 * 
	 * Models in programming are DUMB containers....they don't have any complex logic...they are
	 * LITERALLY just containers. So if you find yourself putting complex algorithms in a model
	 * you're doing it wrong.
	 * 
	 */
	
	private int shumanId; //unique identifier for THIS specific superhuman, like a social security number
	private String shumanName;
	private int bounty;
	


	/*
	 * I need simple functionality to access and modify the fields in my model/container class
	 * I generally make a:
	 * -no arg constructor
	 * -all arg constructor
	 * -getters and setters
	 * -toString
	 */
	
	
	///////////////////CONSTRUCTORS
	public SuperHuman() {
	}

	public SuperHuman(int shumanId, String shumanName, int bounty) {
		super();
		this.shumanId = shumanId;
		this.shumanName = shumanName;
		this.bounty = bounty;
	}

	
	///////////////////////GETTERS AND SETTERS
	public int getShumanId() {
		return shumanId;
	}

	public void setShumanId(int shumanId) {
		this.shumanId = shumanId;
	}

	public String getShumanName() {
		return shumanName;
	}

	public void setShumanName(String shumanName) {
		this.shumanName = shumanName;
	}

	public int getBounty() {
		return bounty;
	}

	public void setBounty(int bounty) {
		this.bounty = bounty;
	}

	
	//////////////////////////////TOSTRING
	@Override
	public String toString() {
//		return "barnacles!!!";
		return "SuperHuman [shumanId=" + shumanId + ", shumanName=" + shumanName + ", bounty=" + bounty + "]";
	}

}
