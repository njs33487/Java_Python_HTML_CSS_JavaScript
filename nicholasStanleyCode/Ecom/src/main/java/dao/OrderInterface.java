package dao;

import java.util.List;

import models.Order;

/**
 *	Ecom.dao.OrderInterface 
 *  @author njs33487
 *
 */
public interface OrderInterface {
	
	//create
	public boolean insertOrder();
	//read
	public List<Order> selectAll();
	public Order selectById(int OrderId);
	public Order selectbyName(String username);
	//update
	public boolean updateProduct(int OrderId);
	//delete
	public boolean deleteProduct(int OrderId);

}
