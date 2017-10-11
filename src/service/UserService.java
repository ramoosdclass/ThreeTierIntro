package service;

import bussinessObjects.User;
import dao.MockUserDAO;
import utils.PasswordUtilities;

public class UserService {
	
	
	public String saveUser(User user) {
		
		//mock user dao is a class inside the package dao
		MockUserDAO userDao = new MockUserDAO();
		
//		if(userDao.retrieveUserByUsername(user.getUserName()) != null) {
//			return "you are already a member";
//		}
	
		
		//if the password matches the criteria
		//return string user has successfully registered
		boolean isPasswordValid = PasswordUtilities.verifyPassword(user.getPassword());
		if(isPasswordValid) {
			
			userDao.save(user);
			return "You have successfully registered";
		}
		else {
			return "Password entered is invalid";
		}
		
		//if password fails the criteria
		//return error
		
	}

}
