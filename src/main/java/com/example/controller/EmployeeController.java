package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping("/all")
	public Iterable<Employee> getAll(){
		return employeeService.getAll();
	}
	
	@RequestMapping("/{id}")
	public Employee getPerson(@PathVariable("id") Integer id) {
		 java.util.Optional<Employee> person = employeeService.getEmployee(id);
		 return person.get();
	}
}
