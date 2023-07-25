package preetam.junit5.bookstore.service;

import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

import preetam.junit5.bookstore.model.Book;

public class BookService {
	private List<Book> listOfBook= new ArrayList<>();
	
	public void addBook(Book book) {
		listOfBook.add(book);
	}
	
	public List<Book>books() {
		return Collections.unmodifiableList(listOfBook);
	}
	public Book getBookById(String bookId) {
		for(Book book:listOfBook) {
			if(bookId.equals(book.getBookId())) {
				return book;
			}
		}
		return null;
		
	}
	public String[] getBookIdByPublisher(String publisher) {
		List<String>bookIds = new ArrayList<>();
		for(Book book:listOfBook) {
			if(publisher.equals(book.getPublisher())) {
			bookIds.add(book.getBookId());
			}
		}
		return bookIds.toArray(new String[bookIds.size()]);
		
	}
	public List<String> getBookTitlesByPublisher(String publisher) {
		List<String>bookTitles = new ArrayList<>();
		for(Book book:listOfBook) {
			if(publisher.equals(book.getPublisher())) {
				bookTitles.add(book.getTitle());
			}
		}
		return bookTitles;
		
	}
	
}
