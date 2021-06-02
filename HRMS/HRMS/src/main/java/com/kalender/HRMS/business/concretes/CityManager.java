package com.kalender.HRMS.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.CityService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.dataaccess.abstracts.CityDao;
import com.kalender.HRMS.entities.concretes.City;


@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<City> getById(int id) {
		return new SuccessDataResult<City>("Kişi seçildi");
	}

}
