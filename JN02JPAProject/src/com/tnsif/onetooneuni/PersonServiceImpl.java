//Program to implement Person Service
package com.tnsif.onetooneuni;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class PersonServiceImpl implements PersonService {
	EntityManager em;

	public PersonServiceImpl() {
		em = DBUtil.getEm();
	}

	@Override
	public void insert(Person person) {
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
	}

	@Override
	public void update(Person person) {
		em.getTransaction().begin();
		em.merge(person);
		em.getTransaction().commit();

	}

	@Override
	public void delete(Person person) {
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();

	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return em.find(Person.class, id);
	}

}
