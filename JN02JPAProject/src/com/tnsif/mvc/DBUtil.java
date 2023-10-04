//Program to define utility class for entity manager object 
package com.tnsif.mvc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	static EntityManager em;
	static
	{
		EntityManagerFactory factory;
		factory=Persistence.createEntityManagerFactory("PUnit");
		em=factory.createEntityManager();
	}
	public static EntityManager getEm()
	{
		return em;
	}

}
