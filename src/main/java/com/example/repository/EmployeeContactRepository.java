package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.EmployeeContact;

public interface EmployeeContactRepository extends CrudRepository<EmployeeContact, Integer> {

}
