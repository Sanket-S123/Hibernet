//Program to define service interface for Address CRUD operations
package com.tnsif.onetooneuni;

public interface AddressService {
	void insert(Address address);

	void update(Address address);

	void delete(Address address);

	Address getAddress(int id);

}
