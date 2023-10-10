package com.tnsif.jpaintro;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.tnsif.mvc.DBUtil;

public class JPQLServiceImpl implements JPQLService {
	EntityManager em;
	Query query;
	
	public JPQLServiceImpl()
	{
		em=DBUtil.getEm();
	}
	
	@Override
	public Book getBookById(int bookId) {
		Book b=em.find(Book.class, bookId);
		return b;
	}

	@Override
	public List<Book> getBooksByAuthor(String author) {
		List<Book> bookList;
		String str="SELECT b FROM Book b WHERE author='"+author+"'";
		query=em.createQuery(str);
		bookList=query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> bookList;
		/*
		 * String str="SELECT b FROM Book b"; query=em.createQuery(str);
		 * bookList=query.getResultList();
		 */
		bookList=em.createNamedQuery("getAllBooks",Book.class).getResultList();
		return bookList;
	}

	@Override
	public List<Book> getBooksByPrice(float amount) {
		List<Book> bookList;
		String str="SELECT b FROM Book b WHERE price>="+amount;
		query=em.createQuery(str);
		bookList=query.getResultList();
		return bookList;
	}

	@Override
	public List<Book> getBooksByTitle(String title) {
		List<Book> bookList;
		String str="SELECT b FROM Book b WHERE title LIKE '"+title+"'";
		query=em.createQuery(str);
		bookList=query.getResultList();
		return bookList;
	}

	@Override
	public int count() {
		int c;
		query=em.createQuery("SELECT count(b.bookId) FROM Book b");
		c=(int) query.getFirstResult();
		return c;
	}

	@Override
	public List<Book> getBooksWithinPriceRange(float startAmt, float endAmt) {
		TypedQuery<Book> q=(TypedQuery<Book>) em.createQuery("SELECT b FROM Book b WHERE b.price BETWEEN :start AND :end");
		q.setParameter("start", startAmt);
		q.setParameter("end", endAmt);
		List<Book> bookList=q.getResultList();
		return bookList;
	}

}
