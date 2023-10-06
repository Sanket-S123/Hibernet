//program to define Student Entity Derived from Person
package com.tnsif.singletableinheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeMaster")
@DiscriminatorValue (value = "E")
public class Employee extends Person{
  private int salary;
  private String deptName;
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
@Override
public String toString() {
	return "Employee [salary=" + salary + ", deptName=" + deptName + "]";
}
  
  
}
