package preetam.junit5.assertion.assertEquals;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertEqualsDemo {
	@Test
	public void assertEqualsWithNoMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("1");
		assertEquals("1",actualbook.getBookId());
		assertEquals("influencepeople",actualbook.getTitle());
	}
	@Test
	public void assertEqualsMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("1");
		assertEquals("1",actualbook.getBookId());
		assertEquals("influencepeople",actualbook.getTitle(),"Book title didn't match");
	}
	@Test
	public void assertEqualsWithMessagesSypplier() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("1");
		assertEquals("1",actualbook.getBookId());
		assertEquals("influencepeople",actualbook.getTitle(),() -> "book title did not match");
	}
	
}
