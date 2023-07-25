package preetam.junit5.assertion.assertNotEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertNotEqualsDemo {
	@Test
	public void assertNotEqualsWithNoMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("1");
		assertNotEquals("1",actualbook.getBookId());
		
	}
	@Test
	public void assertNotEqualsWithMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("1");
		assertNotEquals("1",actualbook.getBookId(),"bookid matches expected value");
		
	}
	@Test
	public void assertNotEqualsWithMessagesSupplier() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("1");
		assertNotEquals("1",actualbook.getBookId(),()->"bookid matches expected value");
		
	}


}
