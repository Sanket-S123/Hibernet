package com.tnsif.classpertableinheritance;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vObj1=new Vehicle(500000,"hach_b");
		Vehicle vObj2=new Vehicle(1600000,"sedan");
		
		Car cObj1=new Car(5500000, "MUV", "Black", "Rudba");
		Car cObj2=new Car(30000000, "MUV", "Golden", "Systummm..");
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(vObj1);
		em.persist(vObj2);
		em.persist(cObj1);
		em.persist(cObj2);
		em.getTransaction().commit();
		
	}

}
