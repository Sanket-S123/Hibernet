//Program to demonstrate join table inheritance
package com.tnsif.jointableinheritance;

import javax.persistence.EntityManager;

import com.tnsif.mvc.DBUtil;

public class Executor {

	public static void main(String[] args) {
		Animal animalOne=new Animal(101, "Pet", "Herbicious", "...");
		Animal animalTwo=new Animal(102, "Wild", "Carnivals", "---");
		
		PetAnimal dog=new PetAnimal(103, "Pet", "Carnivals", "Barking", "Brown", (byte)7);
		
		WildAnimal lion=new WildAnimal(104, "Wild", "Carnivals", "Roaring", 143, "Group" );
		
		EntityManager em=DBUtil.getEm();
		em.getTransaction().begin();
		em.persist(animalOne);
		em.persist(animalTwo);
		em.persist(dog);
		em.persist(lion);
		em.getTransaction().commit();
	}

}
