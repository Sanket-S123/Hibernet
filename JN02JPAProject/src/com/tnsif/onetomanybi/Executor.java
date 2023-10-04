//Program to demonstrate One to Many Bidirectional Mapping
package com.tnsif.onetomanybi;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class Executor {

	public static void main(String[] args) {
		Department deptObj=new Department();
		deptObj.setDeptId(201);
		deptObj.setName("Account");
		
		Employee empOne=new Employee();
		empOne.setEmpId(10);
		empOne.setName("Pooja");
		empOne.setDept(deptObj);
		
		Employee empTwo=new Employee();
		empTwo.setEmpId(20);
		empTwo.setName("Pratiksha");
		empTwo.setDept(deptObj);
		
		Set<Employee> emps=new HashSet<Employee>();
		emps.add(empOne);
		emps.add(empTwo);
		deptObj.setEmployees(emps);
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(deptObj);
		em.persist(empOne);
		em.persist(empTwo);
		em.getTransaction().commit();	
	}

}
