package preetam.junit5.assertion.assertNull;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertNullDemo {
	@Test
	public void assertNullWithNoMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("4");
		assertNull(actualbook);
	}
	@Test
	public void assertNullWithMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("4");
		assertNull(actualbook,"Book is not null !");
	}
	@Test
	public void assertNullWithMessagesSupplier() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("4");
		assertNull(actualbook,()->"Book is not null !");
	}

}
