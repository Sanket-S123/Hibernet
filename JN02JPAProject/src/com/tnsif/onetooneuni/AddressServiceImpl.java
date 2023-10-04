//Program to implement Address Service
package com.tnsif.onetooneuni;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class AddressServiceImpl implements AddressService {
	EntityManager em;

	public AddressServiceImpl() {
		em = DBUtil.getEm();
	}

	@Override
	public void insert(Address address) {
		em.getTransaction().begin();
		em.persist(address);
		em.getTransaction().commit();
	}

	@Override
	public void update(Address address) {
		em.getTransaction().begin();
		em.merge(address);
		em.getTransaction().commit();

	}

	@Override
	public void delete(Address address) {
		em.getTransaction().begin();
		em.remove(address);
		em.getTransaction().commit();

	}

	@Override
	public Address getAddress(int id) {
		// TODO Auto-generated method stub
		return em.find(Address.class, id);
	}

}
