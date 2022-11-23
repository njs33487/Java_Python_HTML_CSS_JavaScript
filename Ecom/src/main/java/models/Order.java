package models;

/**
 * Ecom.models.Order
 * @author njs33487
 *	2022-07-28
 * just a  dumb container
 */
public class Order {
	///FIELDS
	private int orderId;
	private int productId;
	private String productName;
	private int totalOrder;
	
/*
 *constructors
 *get and set
 *toString() 
 */
	
////////////////////////////////////////////////////////////////
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, int productId, String productName, int totalOrder) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.productName = productName;
		this.totalOrder = totalOrder;
	}
//////////////////////////////////////////////////////////////////	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
////////////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productId=" + productId + ", productName=" + productName
				+ ", totalOrder=" + totalOrder + "]";
	}
	
	
}
