package com.kalender.HRMS.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalender.HRMS.core.utilities.results.Result;
import com.kalender.HRMS.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>
{
	
}
