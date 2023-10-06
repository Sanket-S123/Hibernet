//Program to define WildAnimal class
package com.tnsif.jointableinheritance;

import javax.persistence.Entity;

@Entity
public class WildAnimal extends Animal {
	private int speed;
	private String habitat;
	public WildAnimal(int id, String category, String feedCategory, String sound, int speed, String habitat) {
		super(id, category, feedCategory, sound);
		this.speed = speed;
		this.habitat = habitat;
	}
	@Override
	public String toString() {
		return "WildAnimal [speed=" + speed + ", habitat=" + habitat + "]";
	}
	public WildAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
