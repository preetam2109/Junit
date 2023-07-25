package preetam.junit5.assertion.assertNotNull;




import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertNotNull {
	@Test
	public void assertNotNullWithNoMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("4");
		assertNotNull(actualbook);
	}
	@Test
	public void assertNotNullWithMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("4");
		assertNotNull(actualbook,"Book is  null !");
	}
	@Test
	public void assertNotNullWithMessagesSupplier() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influencepeople","Preetam");
		Book InflunceFriend=new Book("2","influenceFriend","Atul");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		
		Book actualbook=bookService.getBookById("4");
		assertNotNull(actualbook,()->"Book is  null !");

}
}
