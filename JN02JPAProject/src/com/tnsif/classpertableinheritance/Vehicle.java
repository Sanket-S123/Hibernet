//Program to define vehicle entity
package com.tnsif.classpertableinheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vId;
	private int vPrice;
	private String vType;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle( int vPrice, String vType) {
		super();
		 
		this.vPrice = vPrice;
		this.vType = vType;
	}
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vPrice=" + vPrice + ", vType=" + vType + "]";
	}
	
	
	
	

}
