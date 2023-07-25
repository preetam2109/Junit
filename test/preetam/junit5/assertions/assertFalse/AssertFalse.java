package preetam.junit5.assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import preetam.junit5.bookstore.model.Book;
import preetam.junit5.bookstore.service.BookService;

public class AssertFalse {
	
	@Test
	public void assertFalseWithNoMessage() {
		BookService bookService= new BookService();
		 List<Book> listOfBook=bookService.books();
		 
		 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
		 bookService.addBook(RichDadPoorDad);
		 
		 assertFalse(listOfBook.isEmpty());
	}

		@Test
		public void AssertFalseWithmessageSupplier() {
			BookService bookService= new BookService();
			 List<Book> listOfBook=bookService.books();
			 
			 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
			 bookService.addBook(RichDadPoorDad);
			 
			 assertFalse(listOfBook.isEmpty(),()->"list of book is  empty");
		}

		@Test
		public void AssertFalseWithBooleanSupplier() {
			BookService bookService= new BookService();
			 List<Book> listOfBook=bookService.books();
			 
			 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
			 bookService.addBook(RichDadPoorDad);
			 
			 assertFalse(() -> listOfBook.isEmpty());
		}
		@Test
		public void AssertFalseWithBooleanSupplierAndMessages() {
			BookService bookService= new BookService();
			 List<Book> listOfBook=bookService.books();
			 
			 Book RichDadPoorDad=new Book("1","RichDadPoorDad","Dale Carnage");
			 bookService.addBook(RichDadPoorDad);
			 
			 assertFalse(() -> listOfBook.isEmpty(),"list of book is not empty");
		}


}
