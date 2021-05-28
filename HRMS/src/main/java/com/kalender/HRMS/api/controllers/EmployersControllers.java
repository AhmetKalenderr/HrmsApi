package com.kalender.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalender.HRMS.business.abstracts.EmployersService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {
	
	private EmployersService employersService;

	@Autowired
	public EmployersControllers(EmployersService employersService) {
		this.employersService = employersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>>getAll() {
		return null;
	}
	
	
}
