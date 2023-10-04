//Program to demonstrate CRUD operations using JPA
package com.tnsif.mvc;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			EmployeeServiceImpl service = new EmployeeServiceImpl();
			int ch;
			do {
				System.out.println("--------Employee Management System-----");
				System.out.println("1. Insert");
				System.out.println("2. Update");
				System.out.println("3. Delete");
				System.out.println("4. Find Employee");
				System.out.println("5. Exit");
				System.out.println("Enter your choice(1..5) : ");
				ch = sc.nextInt();
				int empId;
				String name;
				String post;
				float salary;
				Employee emp;
				switch (ch) {
				case 1:
					System.out.println("Enter Employee id, name, post and salary ");
					empId = sc.nextInt();
					sc.nextLine();
					name = sc.nextLine();
					post = sc.nextLine();
					salary = sc.nextFloat();
					emp = new Employee();
					emp.setEmpId(empId);
					emp.setEmpName(name);
					emp.setDesignation(post);
					emp.setSalary(salary);
					service.insert(emp);
					break;

				case 2:
					System.out.println("Enter Employee Id to update...");
					empId = sc.nextInt();
					emp = service.getEmployee(empId);
					if (emp != null) {
						System.out.println("Enter the updated salary and designation : ");
						salary = sc.nextFloat();
						sc.nextLine();
						post = sc.nextLine();
					
						emp.setDesignation(post);
						emp.setSalary(salary);
						service.update(emp);
					} else
						System.out.println("No such employee found..");
					break;

				case 3:
					System.out.println("Enter Employee Id to delete...");
					empId = sc.nextInt();
					emp = service.getEmployee(empId);
					if (emp != null) {
						service.delete(emp);
					} else
						System.out.println("No such employee found..");
					break;

				case 4:
					System.out.println("Enter Employee Id to search...");
					empId = sc.nextInt();
					emp = service.getEmployee(empId);
					if (emp != null) {
						System.out.println(emp);
					} else
						System.out.println("No such employee found..");

					break;

				case 5:
					break;
				default:
					System.out.println("Invalid Choice");
				}
			} while (ch != 5);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
