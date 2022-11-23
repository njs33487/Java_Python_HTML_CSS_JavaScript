package models;

public class Content {
  // fields
  private int amount;
  private String description;
  
  // constructors
  public Content(int amount, String description) {
    this.amount = amount;
    this.description = description;
  }
  
  // getters and setters
  public int getAmount() {
    return amount;
  }
  public void setAmount(int amount) {
    this.amount = amount;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  // other methods
  public String toString() {
    return "AMOUNT: " + this.amount + ", DESCRIPTION: " + this.description;
  }
}