//program to Demonstrate Single Table Inheritance
package com.tnsif.singletableinheritance;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class Executor {

	public static void main(String[] args) 
	{
		Person personObjOne=new Person();
		personObjOne.setCity("Buldhana");
		personObjOne.setName("Nisarga");
		
		Person personObjTwo=new Person();
		personObjTwo.setCity("Nashik");
		personObjTwo.setName("Om");
		
		Student studentObjOne=new Student();
		
		studentObjOne.setName("Nitish");
		studentObjOne.setCity("ShriRampur");
		studentObjOne.setCourse("BE");
		studentObjOne.setPercentage(99);
		
		Employee empObjOne=new Employee();
		empObjOne.setName("Vishal");
		empObjOne.setSalary(8000);
		empObjOne.setDeptName("IT");
		empObjOne.setCity("Chopda");
		 
		EntityManager em=DBUtil.getEm();
		
		em.getTransaction().begin();
		em.persist(personObjOne);
		em.persist(personObjTwo);
		em.persist(studentObjOne);
		em.persist(empObjOne);
		
		em.getTransaction().commit();
		
		
		
		

	}

}
