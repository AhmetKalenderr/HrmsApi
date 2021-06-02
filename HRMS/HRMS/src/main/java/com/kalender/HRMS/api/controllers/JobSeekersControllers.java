package com.kalender.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kalender.HRMS.business.abstracts.JobSeekersService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.entities.concretes.JobSeeker;


@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersControllers {

		private JobSeekersService jobSeekersService;

		@Autowired
		public JobSeekersControllers(JobSeekersService jobSeekersService) {
			super();
			this.jobSeekersService = jobSeekersService;
		}
		
		
		@GetMapping("/getall")
		public DataResult<List<JobSeeker>> getAll() {
			return this.jobSeekersService.getAll();
		}
		
		
		
		@PostMapping("/add")
		public Result add(@RequestBody JobSeeker jobSeeker) {
			return this.jobSeekersService.add(jobSeeker);
		}
				
}
