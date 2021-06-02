package com.kalender.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.JobTittlesService;
import com.kalender.HRMS.dataaccess.abstracts.JobTittlesDao;
import com.kalender.HRMS.entities.concretes.JobTittles;

@Service
public class JobTittlesManager implements JobTittlesService {

	
	private JobTittlesDao jobTittlesDao; 
	
	@Autowired
	public JobTittlesManager(JobTittlesDao jobTittlesDao) {
		super();
		this.jobTittlesDao = jobTittlesDao;
	}

	@Override
	public List<JobTittles> getAll() {
		
		return this.jobTittlesDao.findAll();
	}

}
