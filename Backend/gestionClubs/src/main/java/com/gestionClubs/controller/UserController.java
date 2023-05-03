package com.gestionClubs.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gestionClubs.service.UserService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController{
	@Autowired
	private UserService userService;
	@GetMapping("user/{email}/{password}")
	public int userLogin(@PathVariable("email") String email,@PathVariable("password") String password) {
		int flag =userService.loginValidation(email, password);
		if(flag==0) {
			return 0;
		}
		return flag;
	}
	

	
	
	
	
	
	
	
}

