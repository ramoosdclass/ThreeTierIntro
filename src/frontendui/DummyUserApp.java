package frontendui;

import java.util.Scanner;

import bussinessObjects.User;
import service.UserService;



public class DummyUserApp {
	
	public static void main(String[] args) {
		
		System.out.println("Please Enter Username:");
		String userName = new Scanner(System.in).nextLine();
		
		System.out.println("Please Enter Password:");
		String password = new Scanner(System.in).nextLine();
		
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		
		UserService userService = new UserService();
		
		System.out.println(userService.saveUser(user));
		
		
		
		
		
	}

}
