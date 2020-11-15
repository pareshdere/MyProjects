package utils;

import static java.time.LocalDate.parse;

import java.util.HashMap;

import com.app.core.Author;
import com.app.core.Book;
import com.app.core.BookCategory;

import custom_exec.BookShopHandlingException;

public class BookShopCollection {

	public static HashMap<String, Book> populateSampleData() throws BookShopHandlingException {

		HashMap<String, Book> booklist = new HashMap<String, Book>();
		// Book 1
		Book b1 = new Book("BraveNewWorld",BookCategory.FICTION, 500, parse("2014-02-11"), 10, 4);
		Author a1 =  new Author("AldousHuxley", "aldoushuxley@gmail.com");
		Author a12	=  new Author("Aristotle", "aristo@gmail.com");
		b1.addAuthors(a1);
		b1.addAuthors(a12);
		booklist.put("BraveNewWorld", b1);
		// Book 2
		Book b2 = new Book("Physica", BookCategory.SCIENCE, 870, parse("1970-03-18"), 10, 5);
		Author a2 = new Author("Aristotle", "aristo@gmail.com");
		Author a24 = new Author("PeterLynch", "peterlynch@gmail.com");
		b2.addAuthors(a24);
		b2.addAuthors(a2);
		booklist.put("Physica", b2);
		// Book 3
		Book b3 = new Book("Relativity", BookCategory.SCIENCE, 1510, parse("2014-02-11"), 10, 3);
		Author a3 = new Author("AlbertEinstein", "alberteinstein@gmail.com");
		b3.addAuthors(a3);
		booklist.put("Relativity", b3);
		// Book 4
		Book b4 = new Book("LearnToEarn", BookCategory.FINANCE, 1910, parse("2008-09-12"), 10, 4);
		Author a4 = new Author("PeterLynch", "peterlynch@gmail.com");
		b4.addAuthors(a4);
		booklist.put("LearnToEarn", b4);
		// Book 5
		Book b5 = new Book("TheWarrenBuffetWay", BookCategory.FINANCE, 780, parse("2015-01-11"), 10, 6);
		Author a5 = new Author("RobertG", "Robertg123@gmail.com");
		b5.addAuthors(a5);
		booklist.put("TheWarrenBuffetWay", b5);
		// Book 6
		Book b6 = new Book("RajaYoga", BookCategory.YOGA, 280, parse("2011-11-11"), 10, 6);
		Author a6 = new Author("SwamiVivekanand", "vivekanandtrust@gmail.com");
		Author a67 = new Author("OmSwami", "omji@gmail.com");
		Author a68 = new Author("Iyengar", "iyenger@gmail.com");
		b6.addAuthors(a6);
		b6.addAuthors(a67);
		b6.addAuthors(a68);
		booklist.put("RajaYoga", b6);
		// Book 7
		Book b7 = new Book("MillionThoughts", BookCategory.MEDITATION, 880, parse("2018-10-14"), 10, 5);
		Author a7 = new Author("OmSwami", "omji@gmail.com");
		b7.addAuthors(a7);
		booklist.put("MillionThoughts", b7);
		// Book 8
		Book b8 = new Book("Alchemist", BookCategory.FICTION, 384, parse("2011-07-19"), 10, 5);
		Author a8 = new Author("PauloCoelho", "paulocoelho@gmail.com");
		b8.addAuthors(a8);
		booklist.put("Alchemist", b8);
		// Book 9
		Book b9 = new Book("LightOnYoga", BookCategory.YOGA, 170, parse("2001-01-11"), 10, 3);
		Author a9 = new Author("Iyengar", "iyenger@gmail.com");
		b9.addAuthors(a9);
		booklist.put("LightOnYoga", b9);
		// Book 10
		Book b10 = new Book("HowToMeditate", BookCategory.MEDITATION, 584, parse("2014-03-12"), 10, 5);
		Author a10 = new Author("JohnMac", "john@gmail.com");
		b10.addAuthors(a10);
		booklist.put("HowToMeditate", b10);

		return booklist;
	}
}
