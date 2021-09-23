package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Employee;
import com.dbs.repo.EmployeeRepo;

// All operations asked by the business

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	@Override
	public Employee findById(int id) {
		return employeeRepo.findById(id).get();
	}
	
	@Override
	public List<Employee> findAll(){
		return employeeRepo.findAll();
	}
	
	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> optEmployee = employeeRepo.findById(employee.getId());
		if(optEmployee.isPresent()) {
			return employeeRepo.save(employee);
		}
		else {
			return null;
		}
	}

	@Override
	public Employee deleteEmployee(int id) {
		Optional<Employee> optEmployee = employeeRepo.findById(id);
		if(optEmployee.isPresent()) {
			Employee employee = optEmployee.get();
			employeeRepo.deleteById(id);
			return employee;
		}
		else {
			return null;
		}
	}

}
