package preetam.junit5.assertions.assertTrue;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertTrueDemo {
	@Test
	public void assertTrueWithNoMessage() {
		BookService bookService= new BookService();
		 List<Book> listOfBook=bookService.books();
		 
		 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
		 bookService.addBook(RichDadPoorDad);
		 
		 assertTrue(listOfBook.isEmpty(),"list of book is not empty");
	}

		@Test
		public void AssertTrueWithmessageSupplier() {
			BookService bookService= new BookService();
			 List<Book> listOfBook=bookService.books();
			 
			 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
			 bookService.addBook(RichDadPoorDad);
			 
			 assertTrue(listOfBook.isEmpty(),()->"list of book is not empty");
		}

		@Test
		public void AssertTrueWithBooleanSupplier() {
			BookService bookService= new BookService();
			 List<Book> listOfBook=bookService.books();
			 
			 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
			 bookService.addBook(RichDadPoorDad);
			 
			 assertTrue(() -> listOfBook.isEmpty());
		}
		@Test
		public void AssertTrueWithBooleanSupplierAndMessages() {
			BookService bookService= new BookService();
			 List<Book> listOfBook=bookService.books();
			 
			 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
			 bookService.addBook(RichDadPoorDad);
			 
			 assertTrue(() -> listOfBook.isEmpty(),"list of book is not empty");
		}


}



