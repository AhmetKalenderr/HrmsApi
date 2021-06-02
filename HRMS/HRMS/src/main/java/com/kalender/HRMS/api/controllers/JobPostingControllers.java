package com.kalender.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kalender.HRMS.business.abstracts.JobPostingService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.core.utilities.results.SuccessResult;
import com.kalender.HRMS.entities.concretes.JobPosting;

@RestController
@RequestMapping("/api/jobpostingController")
public class JobPostingControllers {

	private JobPostingService jobPostingService;

	@Autowired
	public JobPostingControllers(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}
	
	
	
	@PostMapping("/update")
	public Result updateStatus(@RequestParam int id,@RequestParam boolean status) {
		return this.updateStatus(id, status);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobPosting>>getAll(){
		return this.jobPostingService.getAll();
	}
	
	@GetMapping("/getById")
	public DataResult<JobPosting>getById(@RequestParam int id){
		return this.jobPostingService.getById(id);
	}
}
