package com.kalender.HRMS.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalender.HRMS.entities.concretes.JobTittles;

public interface JobTittlesDao extends JpaRepository<JobTittles, Integer> {

}
