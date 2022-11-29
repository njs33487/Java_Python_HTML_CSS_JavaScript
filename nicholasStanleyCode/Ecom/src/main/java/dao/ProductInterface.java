package dao;

import java.util.List;

import models.Product;

/**
 *	Ecom.dao.ProductInterface 
 *  @author njs33487
 *
 */
public interface ProductInterface {
		
	//create
	public boolean insertProduct();
	//read
	public List<Product> selectAll();
	public Product selectById(int ProductId);
	public Product selectbyName(String username);
	//update
	public boolean updateProduct(int ProductId);
	//delete
	public boolean deleteProduct(int ProductId);
}
