package org.tarena.service;

import org.tarena.dao.UserDAO;
import org.tarena.entity.User;

public class UserService {
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO){
		this.userDAO=userDAO;
	}
	public UserDAO getUserDAO(){
		return userDAO;
	}
	
	public  User login(String name,String pwd){
		try{
			User user=userDAO.findByName(name);
			
			if(user.getPwd().equals(pwd)){
				return user;
			}
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
}
