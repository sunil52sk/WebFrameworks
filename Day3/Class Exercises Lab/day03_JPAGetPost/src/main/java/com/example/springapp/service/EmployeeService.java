package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Employee;
import com.example.springapp.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepo er;
	public void saveinfo(Employee e) {
		 er.save(e);
	}
	public List<Employee> showinfo(){
		return er.findAll();
	}
}
