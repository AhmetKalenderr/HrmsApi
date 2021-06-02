package com.kalender.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kalender.HRMS.business.abstracts.UsersService;
import com.kalender.HRMS.core.utilities.results.DataResult;
import com.kalender.HRMS.core.utilities.results.SuccessDataResult;
import com.kalender.HRMS.dataaccess.abstracts.UserDao;
import com.kalender.HRMS.entities.concretes.User;

@Service
public class UserManager implements UsersService {

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<User> getById(int id) {
      return new SuccessDataResult<User>(this.userDao.getById(id),"Kişi getirildi");
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Kişiler Getirildi");
	}

}
