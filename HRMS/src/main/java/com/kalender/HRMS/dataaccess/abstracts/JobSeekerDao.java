package com.kalender.HRMS.dataaccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kalender.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	
}
