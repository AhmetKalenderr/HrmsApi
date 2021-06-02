package com.kalender.HRMS.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalender.HRMS.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
