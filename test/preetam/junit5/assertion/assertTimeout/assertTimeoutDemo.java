package preetam.junit5.assertion.assertTimeout;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.awt.print.Book;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import preetam.junit5.bookstore.service.BookService;

public class assertTimeoutDemo {
	@Test
	public void assertTimeoutWithNoMessage(){
		BookService bookService=new BookService();
		
		for(int i =1;i<=10000;i++){
			bookService.addBook(new preetam.junit5.bookstore.model.Book(String.valueOf(i),"learn english","wrox"));
				
		}
		List<String>actualTitles =new ArrayList<String>();
		
		assertTimeout(Duration.ofMillis(1),()->{
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		});
		assertEquals(10000, actualTitles.size());
	}
	@Test
	public void assertTimeoutWithMessageSupplier(){
		BookService bookService=new BookService();
		
		for(int i =1;i<=10000;i++){
			bookService.addBook(new preetam.junit5.bookstore.model.Book(String.valueOf(i),"learn english","wrox"));
				
		}
		List<String>actualTitles =new ArrayList<String>();
		
		assertTimeout(Duration.ofMillis(1),()->{
			actualTitles.addAll(bookService.getBookTitlesByPublisher("Wrox"));
		});
		assertEquals(10000, actualTitles.size());
	}

}
