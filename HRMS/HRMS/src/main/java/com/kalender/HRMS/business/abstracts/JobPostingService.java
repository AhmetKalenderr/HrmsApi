package com.kalender.HRMS.business.abstracts;

import java.util.List;

import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.entities.concretes.JobPosting;

public interface JobPostingService {
	
	Result add(JobPosting jobPosting);
	
	
	Result updateStatus(int id,boolean status);
	
	DataResult<List<JobPosting>>getAll();
	
	DataResult<JobPosting>getById(int id);
	
	
	
	

}
