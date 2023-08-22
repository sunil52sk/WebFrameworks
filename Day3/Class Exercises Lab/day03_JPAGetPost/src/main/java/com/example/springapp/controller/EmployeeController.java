package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Employee;
import com.example.springapp.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping("add")
	public void add(Employee ee) {
		es.saveinfo(ee);
	}
	@GetMapping("show")
	public List<Employee> show(){
		return es.showinfo();
	}
}
