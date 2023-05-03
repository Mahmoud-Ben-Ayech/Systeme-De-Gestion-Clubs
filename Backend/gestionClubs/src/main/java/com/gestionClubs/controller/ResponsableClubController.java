package com.gestionClubs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gestionClubs.service.ResponsableClubService;


@RestController
public class ResponsableClubController {

	@Autowired
	private ResponsableClubService responsableClubService;
	@CrossOrigin(origins="http://localhost:4200")
	@GetMapping("responsableclub/{email}/{password}")
	public int responsableclubLogin(@PathVariable("email") String email,@PathVariable("password") String password) {
		int flag =responsableClubService.loginValidation(email, password);
		if(flag==0) {
			return 0;
		}
		return flag;
	}
}
