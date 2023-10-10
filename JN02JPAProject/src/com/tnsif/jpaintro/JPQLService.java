package com.tnsif.jpaintro;

import java.util.List;

public interface JPQLService {
	Book getBookById(int bookId);
	List<Book> getBooksByAuthor(String author);
	List<Book> getAllBooks();
	List<Book> getBooksByPrice(float amount);
	List<Book> getBooksByTitle(String title);	
	List<Book> getBooksWithinPriceRange(float startAmt, float endAmt);
	int count();
}
