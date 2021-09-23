package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Employee;
import com.dbs.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping(value="employee")
	public ResponseEntity<List<Employee>> getEmployee() {
		List<Employee> employees = employeeService.findAll();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}
	
	@GetMapping(value="employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) {
		Employee employee = employeeService.findById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@PostMapping(value="employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee resEmp = employeeService.addEmployee(employee);
		return new ResponseEntity<>(resEmp, HttpStatus.OK);
	}
	
	@PutMapping(value="employee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		Employee resEmp = employeeService.updateEmployee(employee);
		return new ResponseEntity<Employee>(resEmp, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "employee/{id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable("id") int id) {
		Employee employee = employeeService.deleteEmployee(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}

}
