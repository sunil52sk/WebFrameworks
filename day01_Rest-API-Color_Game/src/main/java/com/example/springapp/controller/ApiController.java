package com.example.springapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController {
	private String color="Green";
	@GetMapping("/")
	public String getName() {
		return "My favorite color is "+color;
	}

}
