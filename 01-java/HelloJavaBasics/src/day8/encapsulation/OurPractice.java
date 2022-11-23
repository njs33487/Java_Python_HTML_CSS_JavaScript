package day8.encapsulation;

public class OurPractice {

	//Let's pretend this is a clothing class
	
	private String type;
	private String size;
	private double cost;
	private String color;
	private String style;
	private int measurement;

	/*
	 * You can generate getters and setters (among other things) using the IDE.
	 * 
	 * 1. Right click inside your class, but outside any method.
	 * 
	 * 2. Then go to source -> "generate getters and setters"
	 */
	
	
	public OurPractice() {
		// TODO Auto-generated constructor stub
	}

	public OurPractice(String type, String size, double cost, String color, String style, int measurement) {
		super();
		this.type = type;
		this.size = size;
		this.cost = cost;
		this.color = color;
		this.style = style;
		this.measurement = measurement;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getMeasurement() {
		return measurement;
	}
	public void setMeasurement(int measurement) {
		this.measurement = measurement;
	}
	
	
	
	
	
	
}
