package com.kalender.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kalender.HRMS.business.abstracts.UsersService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserControllers {
	
	private UsersService usersService;

	@Autowired
	public UserControllers(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	 @GetMapping("/getById")
	 public DataResult<User>getById(@RequestParam int id) {
		 return this.usersService.getById(id);
	 }
	 
	 @GetMapping("/getAll")
	public DataResult<List<User>>getAll() {
		 return this.usersService.getAll();
	 }

}
