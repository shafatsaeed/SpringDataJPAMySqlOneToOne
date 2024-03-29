package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRespository;
	
	public Optional<Employee> getEmployee(Integer id) {
		return employeeRespository.findById(id);
	}
	
	public Iterable<Employee> getAll(){
		return employeeRespository.findAll();
	}

}
