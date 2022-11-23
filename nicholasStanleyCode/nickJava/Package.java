package models;

public class Package {
  // fields
  private Content content;
  private Color color;
  private Dimension dimension;
  
  // constructors
  public Package(Content content, Color color, Dimension dimension) {
    this.content = content;
    this.color = color;
    this.dimension = dimension;
  }
  
  // getters and setters
  public Content getContent() {
    return content;
  }
  public void setContent(Content content) {
    this.content = content;
  }
  public Color getColor() {
    return color;
  }
  public void setColor(Color color) {
    this.color = color;
  }
  public Dimension getDimension() {
    return dimension;
  }
  public void setDimension(Dimension dimension) {
    this.dimension = dimension;
  }
  
  public String toString() {
    return this.content + "\n" + this.color + "\n" + this.dimension;
  }
}