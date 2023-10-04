//Program to define service interface for Person CRUD operations
package com.tnsif.onetooneuni;

public interface PersonService {
	void insert(Person person);

	void update(Person person);

	void delete(Person person);

	Person getPerson(int id);

}
