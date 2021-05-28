package com.kalender.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.JobSeekersService;
import com.kalender.HRMS.core.utilities.mernis.UserCheckService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.core.utilities.results.SuccessResult;
import com.kalender.HRMS.dataaccess.abstracts.JobSeekerDao;
import com.kalender.HRMS.entities.concretes.JobSeeker;

@Service
public class JobSeekersManager implements JobSeekersService {
	
	private JobSeekerDao jobSeekersDao;

	@Autowired
	public JobSeekersManager(JobSeekerDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
		
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>
		(this.jobSeekersDao.findAll(),"İş arayanlar getirildi");
	}

	@Override
	public DataResult<JobSeeker> getById(int id) {
		return new SuccessDataResult<JobSeeker>
		(this.jobSeekersDao.getById(id),id+"Numaralı iş arayan getirildi");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		return new SuccessResult(true);
	}



	

}
