package utils;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.Book;
import com.app.core.User;

import custom_exec.BookShopHandlingException;

public class BookShopValidationRules {

	public static Book isBookAvailable(String title, HashMap<String, Book> booklist) throws BookShopHandlingException {
		if (booklist.containsKey(title))
			return booklist.get(title);
		throw new BookShopHandlingException("Book is not available !!!!!!");
	}

	public static boolean validateRating(int rating) throws BookShopHandlingException {
		if (rating > 0 && rating < 6)
			return true;
		else
			throw new BookShopHandlingException("Invalid Rating !!!");
	}

	public static String validateEmail(String email) throws BookShopHandlingException {
		if (email.contains("@") && email.endsWith(".com"))
			return email;
		throw new BookShopHandlingException("Invalid Email !!!");
	}

	public static User isAlreadyRegistered(String email, ArrayList<User> userlist) throws BookShopHandlingException {
		int index = userlist.indexOf(new User(email));
		if (index == -1)
			throw new BookShopHandlingException("User not registered!!!!!");
		return userlist.get(index);

	}

	public static boolean validatePassword(User u1, String passwd)
			throws BookShopHandlingException {
		if (u1.getPassword().equals(passwd))
			return true;
		throw new BookShopHandlingException("Wrong Password !!!");
	}

	public static boolean validateAdmin(String email, String password) throws BookShopHandlingException {
		if (email.equals("admin") && password.equals("admin123"))
			return true;
		throw new BookShopHandlingException("Wrong Credentials !!!");
	}

}
