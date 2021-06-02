package com.kalender.HRMS.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {
	
	
}
