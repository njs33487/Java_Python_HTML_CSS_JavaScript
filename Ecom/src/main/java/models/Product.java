package models;
/**
 * Ecom.models.Product
 * @author njs33487
 *	2022-07-28
 *just a  dumb container
 */
public class Product {
private int productId;
private int price;
private String productName;
private String description;

/*
 * constructors
 * get and set
 * toString()
 */
//////////////////////////////////////////
public Product() {
	// TODO Auto-generated constructor stub
}

public Product(int productId, int price, String productName, String description) {
	super();
	this.productId = productId;
	this.price = price;
	this.productName = productName;
	this.description = description;
}
////////////////////////////////////////////////////////////////

public int getProductId() {
	return productId;
}

public void setProductId(int productId) {
	this.productId = productId;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}
////////////////////////////////////////////////////////////////
@Override
public String toString() {
	return "Product [productId=" + productId + ", price=" + price + ", productName=" + productName + ", description="
			+ description + "]";
}

}
