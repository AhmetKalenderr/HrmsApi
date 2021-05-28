package com.kalender.HRMS.business.abstracts;

import java.util.List;

import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.entities.concretes.User;

public interface UsersService {

	DataResult<User>getById(int id);
	DataResult<List<User>>getAll();
}
