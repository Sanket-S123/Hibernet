//Program to define service interface for Employee CRUD operations
package com.tnsif.onetomanybi;

public interface EmployeeService {
	void insert(Employee employee);

	void update(Employee employee);

	void delete(Employee employee);

	Employee getEmployee(int id);

}
