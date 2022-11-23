package models;

public class Color {
  // fields
  private int red;
  private int green;
  private int blue;
  
  // constructors
  public Color(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }
    
  // getters and setters
  public int getRed() {
    return red;
  }
  public void setRed(int red) {
    this.red = red;
  }
  public int getGreen() {
    return green;
  }
  public void setGreen(int green) {
    this.green = green;
  }
  public int getBlue() {
    return blue;
  }
  public void setBlue(int blue) {
    this.blue = blue;
  }
  
  // other methods
  public String toString() {
    return "RED: "+ this.red + ", GREEN: " + this.green + ", BLUE: " + this.blue; 
  }
}