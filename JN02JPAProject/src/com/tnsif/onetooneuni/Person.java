//Program to define Person entity
package com.tnsif.onetooneuni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private byte age;

	@OneToOne
	private Address personAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Address getPersonAddress() {
		return personAddress;
	}

	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", personAddress=" + personAddress + "]";
	}

}
