//Program to define petAnimal class
package com.tnsif.jointableinheritance;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
public class PetAnimal extends Animal{
	
	private byte age;
	private String color;
	public PetAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetAnimal(int id, String category, String feedCategory, String sound, String color, byte age) {
		super(id, category, feedCategory, sound);
		this.color=color;
		this.age=age;
	}
	@Override
	public String toString() {
		return "PetAnimal [age=" + age + ", color=" + color + "]";
	}
	
}
