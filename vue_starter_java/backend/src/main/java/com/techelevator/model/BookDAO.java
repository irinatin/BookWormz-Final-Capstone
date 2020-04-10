package com.techelevator.model;

import java.util.List;

public interface BookDAO {
	
	public boolean addNewBook(Book bookie);
	
	public List<Book> getAllBooksPerUser(long userId);
	
	public List<Book> getAllBooks();
	
	public boolean deleteBook(Book bookie);
	
	public String findBookByTitle(String title);
	
	public List<Book> findBookByAuthor(String author);
	
	public String findBookByIsbn(long isbn);
	
	public String findBookById(long id);
	

}
