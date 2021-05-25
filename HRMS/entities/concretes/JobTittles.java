package com.kalender.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="JobTittles")
public class JobTittles {
	
	@Id
	@GeneratedValue
	@Column(name="jobId")
	private int id;
	
	@Column(name="jobPositionName")
	private String jobPositionName;
	
	public JobTittles() {
		
	}

	public JobTittles(int id, String jobPositionName) {
		super();
		this.id = id;
		this.jobPositionName = jobPositionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobPositionName() {
		return jobPositionName;
	}

	public void setJobPositionName(String jobPositionName) {
		this.jobPositionName = jobPositionName;
	}
	


}
