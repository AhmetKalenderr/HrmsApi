package com.kalender.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalender.HRMS.business.abstracts.JobTittlesService;
import com.kalender.HRMS.entities.concretes.JobTittles;

@RestController
@RequestMapping("api/jobtittles")
public class JobTittlesControllers {
	
	private JobTittlesService jobTittlesService;

	
	@Autowired
	public JobTittlesControllers(JobTittlesService jobTittlesService) {
		super();
		this.jobTittlesService = jobTittlesService;
	}
	
	@GetMapping("/getAll")
	public List<JobTittles>getAll() {
		return this.jobTittlesService.getAll();
	}

}
