package preetam.junit5.assertion.assertArraysEquals;




import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertArraysEqualsDemo {
	@Test
	public void assertArraysEqualsWithNoMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influence people","Wrox");
		Book InflunceFriend=new Book("2","influence Friend","Atul");
		Book Influncefamily=new Book("3","Influnce family","Wrox");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		bookService.addBook(Influncefamily);
		
		String[] actualBookIds=bookService.getBookIdByPublisher("Wrox");
		assertArrayEquals(new String[] {"3" , "1"}, actualBookIds);
		
		
	
	}
	@Test
	public void assertArraysEqualsWithMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influence people","Wrox");
		Book InflunceFriend=new Book("2","influence Friend","Atul");
		Book Influncefamily=new Book("3","Influnce family","Wrox");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		bookService.addBook(Influncefamily);
		
		String[] actualBookIds=bookService.getBookIdByPublisher("Wrox");
		assertArrayEquals(new String[] {"1" , "3"}, actualBookIds,"Book publishers not matched");
		
		
	
	}
	@Test
	public void assertArraysEqualsWithMessagesSupplier() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influence people","Wrox");
		Book InflunceFriend=new Book("2","influence Friend","Atul");
		Book Influncefamily=new Book("3","Influnce family","Wrox");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		bookService.addBook(Influncefamily);
		
		String[] actualBookIds=bookService.getBookIdByPublisher("Wrox");
		assertArrayEquals(new String[] {"3" , "1"}, actualBookIds,()->"Book didnt  matched");
		
		
	
	}



}
