//Program to define Service interface for Employee CRUD operation
package com.tnsif.mvc;

public interface EmployeeService {
	void insert(Employee emp);

	void update(Employee emp);

	void delete(Employee emp);

	Employee getEmployee(int empId);
}
