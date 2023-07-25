package preetam.junit5.assertion.assertIterablesEquals;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertIterablesEqualsDemo {
	@Test
	public void assertIterablesEqualsWithNoMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influence people","Wrox");
		Book InflunceFriend=new Book("2","influence Friend","Atul");
		Book Influncefamily=new Book("3","Influnce family","Wrox");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		bookService.addBook(Influncefamily);
		
		List<String> actualTitles=bookService.getBookTitlesByPublisher("Wrox");
		List<String>expectedTitles=new ArrayList<>();
		expectedTitles.add("influence people");
		expectedTitles.add("Influnce family");
		expectedTitles.add("Influnce family and people");
		
		assertIterableEquals(expectedTitles, actualTitles);
		
		
	
	}
	@Test
	public void assertIterablesEqualsWithMessages() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influence people","Wrox");
		Book InflunceFriend=new Book("2","influence Friend","Atul");
		Book Influncefamily=new Book("3","Influnce family","Wrox");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		bookService.addBook(Influncefamily);
		
		List<String> actualTitles=bookService.getBookTitlesByPublisher("Wrox");
		List<String>expectedTitles=new ArrayList<>();
		expectedTitles.add("influence people");
		expectedTitles.add("Influnce family");
		expectedTitles.add("Influnce family and people");
		
		assertIterableEquals(expectedTitles, actualTitles,"Book title didnt match !");
		
		
	
	}
	@Test
	public void assertIterablesEqualsWithMessagesSupplier() {
		BookService bookService=new BookService();
		
		
		Book Influncepeople=new Book("1","influence people","Wrox");
		Book InflunceFriend=new Book("2","influence Friend","Atul");
		Book Influncefamily=new Book("3","Influnce family","Wrox");
		
		
		bookService.addBook(InflunceFriend);
		bookService.addBook(Influncepeople);
		bookService.addBook(Influncefamily);
		
		List<String> actualTitles=bookService.getBookTitlesByPublisher("Wrox");
		List<String>expectedTitles=new ArrayList<>();
		expectedTitles.add("influence people");
		expectedTitles.add("Influnce family");
		
		
		assertIterableEquals(expectedTitles, actualTitles,()->"Book title didnt match !");
		
		
	
	}


}
