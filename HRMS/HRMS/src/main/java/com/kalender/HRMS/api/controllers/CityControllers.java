package com.kalender.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kalender.HRMS.business.abstracts.CityService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.entities.concretes.City;

@RestController
@RequestMapping("/api/cityControllers")
public class CityControllers {
	
	private CityService cityService;

	@Autowired
	public CityControllers(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getcity")
	public DataResult<City> getById(@RequestBody int id) {
		return this.cityService.getById(id);
	}
	
	

}
