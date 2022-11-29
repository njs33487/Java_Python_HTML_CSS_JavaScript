package dao;

import java.util.List;

import models.User;

/**
 *	Ecom.dao.UserInterface 
 *  @author njs33487
 *
 */
public interface UserInterface {
	//create
	public boolean insertUser();
	//read
	public List<User> selectAll();
	public User selectById(int userId);
	public User selectbyName(String username);
	//update
	public boolean updateUser(int userId);
	//delete
	public boolean deleteUser(int userId);
}
