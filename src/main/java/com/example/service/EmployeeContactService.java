package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.EmployeeContact;
import com.example.repository.EmployeeContactRepository;

@Service
public class EmployeeContactService {
	@Autowired
	EmployeeContactRepository empRepository;
	
	public void saveEmployeeContact(EmployeeContact empContact) {
		empRepository.save(empContact);
	}
	
	public List<EmployeeContact> getAll(){
		return (List<EmployeeContact>)empRepository.findAll();
	}

}
