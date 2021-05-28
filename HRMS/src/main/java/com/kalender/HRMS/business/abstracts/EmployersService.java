package com.kalender.HRMS.business.abstracts;

import java.util.List;

import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.entities.concretes.Employer;

public interface EmployersService {

	Result doğrulaEmployer(Employer employer);
	DataResult<List<Employer>>getAll();
	DataResult<Employer>getById(int id);
	
}
