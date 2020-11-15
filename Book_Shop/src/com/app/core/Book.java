package com.app.core;

import java.time.LocalDate;
import java.util.ArrayList;

public class Book {
	private String title;
	private ArrayList<Author> authors;
	private BookCategory booktype;
	private double price;
	private LocalDate publishDate;
	private int quantity;
	private int rating;

	public Book(String title,BookCategory booktype, double price, LocalDate publishDate, int quantity, int rating) {
		super();
		this.title = title;
		this.setBooktype(booktype);
		this.price = price;
		this.publishDate = publishDate;
		this.quantity = quantity;
		this.rating = rating;
		this.authors =new ArrayList<Author>();
	}

	public Book(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public ArrayList<Author> getAuthor() {
		return authors;
	}
	
	public void addAuthors(Author author) {
		this.authors.add(author);
	}

	public BookCategory getBooktype() {
		return booktype;
	}

	public void setBooktype(BookCategory booktype) {
		this.booktype = booktype;
	}

	
	@Override
	public String toString() {
		String ret = "[title=" + title +", booktype=" + booktype + ", price=" + price
				+ ", publishDate=" + publishDate + ", rating=" + rating + "]";
		for(Author a : authors)
			ret += "\n\t "+a;
		return ret;
	}

	public ArrayList<Book> addToCart(int q, Book b, ArrayList<Book> al) {
		if(q>b.getQuantity()) {
			System.out.println("Invalid Quantity!!! , Only "+b.getQuantity()+" Books are available in store.");
			return al;
		}
		for (int i = 0; i < q; i++) {
			al.add(b);
			b.setQuantity(b.getQuantity() - 1);
		}
		return al;
	}

	public ArrayList<Book> removeFromCart(Book b, ArrayList<Book> al,int q) {
		for (int i = 0; i < q; i++) {
			al.remove(b);
			b.setQuantity(b.getQuantity() + 1);
		}
		return al;
	}
}
