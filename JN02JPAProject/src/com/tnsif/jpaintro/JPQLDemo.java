package com.tnsif.jpaintro;

import java.util.List;

public class JPQLDemo {

	public static void main(String[] args) {
		JPQLServiceImpl service=new JPQLServiceImpl();
		List<Book> bookList=service.getAllBooks();
		System.out.println(bookList);
		System.out.println("--------------------------");
		Book b=service.getBookById(2);
		System.out.println(b);
		System.out.println("--------------------------");
		bookList=service.getBooksByAuthor("E Balagurusamy");
		System.out.println(bookList);
		System.out.println("--------------------------");
		bookList=service.getBooksByTitle("Programming%");
		System.out.println(bookList);
		System.out.println("--------------------------");
		bookList=service.getBooksByPrice(500);
		System.out.println(bookList);
		System.out.println("--------------------------");
		bookList=service.getBooksWithinPriceRange(500,800);
		System.out.println(bookList);
		System.out.println(service.count());
	}

}
