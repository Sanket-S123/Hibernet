//Program to implement Employee Service
package com.tnsif.onetomanybi;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class EmployeeServiceImpl implements EmployeeService {
	EntityManager em;

	public EmployeeServiceImpl() {
		em = DBUtil.getEm();
	}

	@Override
	public void insert(Employee employee) {
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();
	}

	@Override
	public void update(Employee employee) {
		em.getTransaction().begin();
		em.merge(employee);
		em.getTransaction().commit();

	}

	@Override
	public void delete(Employee employee) {
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();

	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, id);
	}

}
