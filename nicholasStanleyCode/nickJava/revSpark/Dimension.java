package models;

public class Dimension {
  // fields
  private double width;
  private double height;
  private double length;
  
  // constructors
  public Dimension(double width, double height, double length) {
    this.width = width;
    this.height = height;
    this.length = length;
  }
    
    // getters and setters
  public double getWidth() {
    return width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public double getLength() {
    return length;
  }
  public void setLength(double length) {
    this.length = length;
  }
  
  // other methods
  public String toString() {
    return "WIDTH: " + this.width + ", HEIGHT: " + this.height + ", LENGTH: " + this.length;
  }
}