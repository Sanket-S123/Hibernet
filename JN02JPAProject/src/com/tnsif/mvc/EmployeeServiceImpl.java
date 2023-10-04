//Program to implement Employee Service operations
package com.tnsif.mvc;

import javax.persistence.EntityManager;

public class EmployeeServiceImpl implements EmployeeService {
	EntityManager em;

	public EmployeeServiceImpl() {
		em = DBUtil.getEm();
	}

	@Override
	public void insert(Employee emp) {
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
	}

	@Override
	public void update(Employee emp) {
		em.getTransaction().begin();
		em.merge(emp);
		em.getTransaction().commit();
	}

	@Override
	public void delete(Employee emp) {
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();

	}

	@Override
	public Employee getEmployee(int empId) {
		Employee emp = em.find(Employee.class, empId);
		return emp;
	}

}
