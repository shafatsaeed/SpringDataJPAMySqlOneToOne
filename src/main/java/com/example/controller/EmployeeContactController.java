package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.model.EmployeeContact;
import com.example.service.EmployeeContactService;

@RestController
@RequestMapping("/employeeContact")
public class EmployeeContactController {
	@Autowired
	EmployeeContactService empContactService;
	
	@GetMapping("/update/{name}")
	public List<EmployeeContact> updateEmployeeContact(@PathVariable String name) {
		EmployeeContact empContact = new EmployeeContact(); 
		empContact.setPhone("1111");
		
		Employee emp = new Employee();
		emp.setFirstName(name);
		
		empContact.setEmployee(emp);
		
		empContactService.saveEmployeeContact(empContact);
		
		return empContactService.getAll();
	}
}
