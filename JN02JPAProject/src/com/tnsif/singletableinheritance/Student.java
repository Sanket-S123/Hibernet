//program to define Student Entity Derived from Person
package com.tnsif.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="StudentMaster")
@DiscriminatorValue (value = "S")
public class Student extends Person{
  private int percentage;
  private String course;
public int getPercentage() {
	return percentage;
}
public void setPercentage(int percentage) {
	this.percentage = percentage;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Student [percentage=" + percentage + ", course=" + course + "]";
}

}
