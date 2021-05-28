package com.kalender.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.EmployersService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.dataaccess.abstracts.EmployerDao;
import com.kalender.HRMS.entities.concretes.Employer;

@Service
public class EmployersManager implements EmployersService {
	
	private EmployerDao employerDao;

	public EmployersManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public Result doğrulaEmployer(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İş verenler getirildi");
	}

	@Override
	public DataResult<Employer> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
