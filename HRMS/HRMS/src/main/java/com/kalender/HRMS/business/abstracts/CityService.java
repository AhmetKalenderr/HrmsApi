package com.kalender.HRMS.business.abstracts;

import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.entities.concretes.City;

public interface CityService {

	DataResult<City>getById(int id);
}
