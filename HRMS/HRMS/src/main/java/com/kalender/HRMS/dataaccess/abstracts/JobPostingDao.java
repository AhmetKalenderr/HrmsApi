package com.kalender.HRMS.dataaccess.abstracts;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.kalender.HRMS.entities.concretes.JobPosting;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {

	
	@Transactional
    @Modifying
    @Query("update JobPosting j set is_active=:is_active where job_posting_id=:id")
    void updateStatus(boolean is_active, int id);
}
