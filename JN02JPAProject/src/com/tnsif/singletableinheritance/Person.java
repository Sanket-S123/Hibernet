//program to define Student Entity Derived from Person
package com.tnsif.singletableinheritance;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="PersonMaster")
@DiscriminatorColumn(name="Type", discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue (value = "P")
public class Person {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int id;
private String name;
private String city;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
}

}
