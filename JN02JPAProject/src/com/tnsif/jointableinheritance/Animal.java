//Program to define animal entity
package com.tnsif.jointableinheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy =InheritanceType.JOINED)

public class Animal {
	@Id
	private int id;
	private String category;
	private String feedCategory;
	private String sound;
	public Animal(int id, String category, String feedCategory, String sound) {
		super();
		this.id = id;
		this.category = category;
		this.feedCategory = feedCategory;
		this.sound = sound;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", category=" + category + ", feedCategory=" + feedCategory + ", sound=" + sound
				+ "]";
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
