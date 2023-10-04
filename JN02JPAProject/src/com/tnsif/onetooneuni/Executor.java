//Program to demonstrate One to One Unidirectional Mapping 
package com.tnsif.onetooneuni;

public class Executor {

	public static void main(String[] args) {
		Address addrOne=new Address();
		addrOne.setAddressId(1001);
		addrOne.setStreet("Panchavati");
		addrOne.setCity("Nashik");
		
		Address addrTwo=new Address();
		addrTwo.setAddressId(1002);
		addrTwo.setStreet("Indiranagar");
		addrTwo.setCity("Nashik");
		
		Person personObj=new Person();
		personObj.setId(101);
		personObj.setName("Nikhil");
		personObj.setAge((byte)23);
		personObj.setPersonAddress(addrTwo);
		
		AddressServiceImpl aService=new AddressServiceImpl();
		aService.insert(addrOne);
		aService.insert(addrTwo);
		
		PersonServiceImpl pService=new PersonServiceImpl();
		pService.insert(personObj);

	}

}
