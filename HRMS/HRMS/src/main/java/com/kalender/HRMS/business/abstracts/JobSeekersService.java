package com.kalender.HRMS.business.abstracts;

import java.util.List;

import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.entities.concretes.JobSeeker;

public interface JobSeekersService {
	
	Result add(JobSeeker jobSeeker);
	DataResult<List<JobSeeker>>getAll();
	DataResult<JobSeeker>getById(int id);
	
	

}
