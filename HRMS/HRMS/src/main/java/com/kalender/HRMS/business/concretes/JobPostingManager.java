package com.kalender.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.JobPostingService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.core.utilities.results.SuccessResult;
import com.kalender.HRMS.dataaccess.abstracts.JobPostingDao;
import com.kalender.HRMS.entities.concretes.JobPosting;

@Service
public class JobPostingManager implements JobPostingService {
	
	private JobPostingDao jobPostingDao;
	

	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	@Override
	public Result add(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);
		return new SuccessDataResult<JobPosting>("İş ilanı eklendi");
	}


	@Override
	public Result updateStatus(int id, boolean status) {
		this.jobPostingDao.updateStatus(true, id);
		return new SuccessResult("İlan güncellendi",true);
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		this.jobPostingDao.findAll();
		return new SuccessDataResult<List<JobPosting>>("İlanlar getirildi");
	}

	@Override
	public DataResult<JobPosting> getById(int id) {
		this.jobPostingDao.getById(id);
		return new SuccessDataResult<JobPosting>(id + "Numaralı ilan getirildi");
	}

}
