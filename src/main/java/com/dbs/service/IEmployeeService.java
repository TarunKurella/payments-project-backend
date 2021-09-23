package com.dbs.service;

import java.util.List;

import com.dbs.beans.Employee;

public interface IEmployeeService {

	Employee addEmployee(Employee employee);

	Employee findById(int id);

	List<Employee> findAll();

	Employee updateEmployee(Employee employee);
	
	Employee deleteEmployee(int id);

}

