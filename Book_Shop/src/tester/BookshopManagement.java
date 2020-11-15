package tester;

import static utils.BookShopCollection.populateSampleData;
import static utils.UsersCollection.populateUserList;
import static utils.BookShopValidationRules.isAlreadyRegistered;
import static utils.BookShopValidationRules.validateEmail;
import static utils.BookShopValidationRules.validatePassword;
import static utils.BookShopValidationRules.isBookAvailable;
import static utils.BookShopValidationRules.validateAdmin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import com.app.core.Book;
import com.app.core.User;

public class BookshopManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Book> booklist = new HashMap<String, Book>(populateSampleData());
			ArrayList<Book> bookCart = new ArrayList<Book>();
			ArrayList<User> userslist = new ArrayList<>(populateUserList());
			while (true) {
				try {
					System.out.println("\n****************** Choose Option ********************");

					System.out.println("1. Display Books in the Shop");
					System.out.println("2. Add Book to the Cart");
					System.out.println("3. Show Cart Contents");
					System.out.println("4. Remove Book from the Cart");
					System.out.println("5. Log out");
					System.out.print("Choice : ");
					switch (sc.nextInt()) {
					case 1:
						int i = 0;
						System.out.println("*********** Books present in the Book Shop ************");
						for (Entry<String, Book> e : booklist.entrySet()) {
							System.out.println("--------------------------------------------");
							i++;
							System.out.println(i + "." + e.getKey() + " :    " + e.getValue());
						}
						break;
					case 2:
						boolean a = true;
						System.out.println("Choose    1.Customer Login    2.Admin Login");
						System.out.print("Choice : ");
						switch(sc.nextInt()) {
						case 1:
							System.out.println("****Customer Login*****");
							System.out.println("Enter your details : ");
							System.out.print("Email : ");
							String email = validateEmail(sc.next());
							User u = isAlreadyRegistered(email, userslist);
							System.out.print("Password : ");
							if (validatePassword(u, sc.next()))
								System.out.println("Successfully Login....");
							break;
						case 2:
							System.out.println("****Admin Login*****");
							System.out.println("Enter your details : ");
							System.out.print("Email : ");
							String adminEmail = sc.next();
							System.out.print("Password : ");
							String adminPassword = sc.next();
							if(validateAdmin(adminEmail,adminPassword))
								System.out.println("Successfully Login....");
							break;
						default:
							System.out.println("Wrong Choice please retry....");
							break;
						}
						
						while (a) {
							System.out.println("--------------------------------------------");
							System.out.println("Add Books in your Cart : ");
							System.out.print("Enter Book Title : ");
							String title = sc.next();
							Book b1 = isBookAvailable(title, booklist);
							System.out.print("Enter Quantity :");
							int q = sc.nextInt();
							bookCart = b1.addToCart(q, b1, bookCart);
							System.out.println("Enter:  1. Continue..    2. Exit from Cart");
							System.out.print("Choice : ");
							if (sc.nextInt() == 1)
								a = true;
							else
								a = false;
						}
						System.out.println("Books are added successfully...");
						break;
					case 3:
						int amount = 0;
						System.out.println("---------------------------");
						System.out.println("Your Cart Contains : ");
						System.out.println("---------------------------");
						if (bookCart.isEmpty())
							System.out.println("Cart is Empty!!!");
						for (Book b : bookCart) {
							System.out.println(b.getTitle() + "  Rs." + b.getPrice());
							amount += b.getPrice();
						}
						System.out.println("---------------------------");
						System.out.println("Total Amount :  Rs." + amount);
						System.out.println("---------------------------");
						System.out.println("Enter   1. Buy & Exit    2. Save & Continue");
						System.out.print("Choice : ");
						int choice = sc.nextInt();
						if (choice == 1) {
							System.out.println("Order Placed...");
							System.out.println("------------------------------------");
							System.out.println("Thank you for visiting our shop :)");
							System.out.println("------------------------------------");
							System.exit(0);
						}
						break;
					case 4:
						System.out.println("Enter Details");
						System.out.print("Title of Book : ");
						String title = sc.next();
						Book b1 = isBookAvailable(title, booklist);
						System.out.print("Quantity : ");
						int q = sc.nextInt();
						bookCart = b1.removeFromCart(b1, bookCart, q);
						System.out.println("Books are removed successfully...");
						break;
					case 5:
						amount = 0;
						System.out.println("---------------------------");
						System.out.println("Your Cart Contains : ");
						System.out.println("---------------------------");
						if (bookCart.isEmpty())
							System.out.println("Cart is Empty!!!");
						for (Book b : bookCart) {
							System.out.println(b.getTitle() + "  Rs." + b.getPrice());
							amount += b.getPrice();
						}
						System.out.println("Total Amount :  Rs." + amount);
						System.out.println("------------------------------------");
						System.out.println("Thank you for visiting our shop :)");
						System.out.println("------------------------------------");
						System.exit(0);
						break;
					default:
						System.out.println("Wrong Choice please retry....");
						break;
					}
				} catch (Exception e) {
					System.out.println("Error Occured " + e);
					System.out.println("Please retry....");
				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
