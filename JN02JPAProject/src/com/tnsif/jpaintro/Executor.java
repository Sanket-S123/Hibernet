//Program to demonstrate ORM
package com.tnsif.jpaintro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Executor {

	public static void main(String[] args) {
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("PUnit");
		EntityManager em = factory.createEntityManager();
		Book b1;
		/*
		 * b1=new Book(); b1.setBookId(102); b1.setTitle("Eat that frog");
		 * b1.setAuthor("James Clear"); b1.setPrice(1020); em.getTransaction().begin();
		 * em.persist(b1); em.getTransaction().commit();
		 */

		/*
		 * b1=em.find(Book.class,101); if (b1==null)
		 * System.out.println("No such book found"); else { System.out.println(b1);
		 * em.getTransaction().begin(); em.remove(b1); em.getTransaction().commit();
		 * 
		 * b1.setPrice(700); em.getTransaction().begin(); em.merge(b1);
		 * em.getTransaction().commit(); System.out.println(b1);
		 * 
		 * }
		 */
	}

}
