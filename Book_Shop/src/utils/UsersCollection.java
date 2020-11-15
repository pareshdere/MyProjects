package utils;

import java.util.ArrayList;

import com.app.core.User;

import custom_exec.BookShopHandlingException;

public class UsersCollection {
	public static ArrayList<User> populateUserList() throws BookShopHandlingException {
		ArrayList<User> users = new ArrayList<>();

		// user1
		User u1 = new User("Paresh", "paresh@gmail.com", "1425");
		users.add(u1);
		// user2
		User u2 = new User("Ganesh", "ganesh@gmail.com", "6425");
		users.add(u2);
		// user3
		User u3 = new User("Prashant", "prashant@gmail.com", "5425");
		users.add(u3);
		// user4
		User u4 = new User("krishna", "krishna@gmail.com", "2425");
		users.add(u4);
		// user5
		User u5 = new User("Vivek", "vivek@gmail.com", "7425");
		users.add(u5);
		
		return users;
	}
}
