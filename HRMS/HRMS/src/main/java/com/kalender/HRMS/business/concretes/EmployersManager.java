package com.kalender.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.EmployersService;
import com.kalender.HRMS.core.utilities.mernis.MernisAdapter;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.core.utilities.results.SuccessResult;
import com.kalender.HRMS.dataaccess.abstracts.EmployerDao;
import com.kalender.HRMS.entities.concretes.Employer;

@Service
public class EmployersManager implements EmployersService {
	
	private MernisAdapter mernisAdapter;
	private EmployerDao employerDao;

	public EmployersManager(MernisAdapter mernisAdapter) {
		super();
		this.mernisAdapter = mernisAdapter;
	}
	
	@Autowired
	public EmployersManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"İş verenler getirildi");
	}

	@Override
	public DataResult<Employer> getById(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Employer>("İş veren getirildi");
	}

	@Override
	public Result doğrulaEmployer(Employer employer) {
		return new SuccessResult(this.mernisAdapter.checkIfReal(employer.getCompanyName(),employer.getEmail(),employer.getPassword(),employer.getWebAddress()));
	}

	

}
