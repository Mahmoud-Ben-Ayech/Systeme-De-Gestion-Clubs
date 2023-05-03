package com.gestionClubs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gestionClubs.service.AdminService;
@RestController
public class AdminController {
  
	@Autowired
	private AdminService adminService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("admin/{email}/{password}")
	public int adminLogin(@PathVariable("email") String email,@PathVariable("password") String password) {
		int flag =adminService.loginValidation(email, password);
		if(flag==0) {
			return 0;
		}
		return flag;
	}
}
