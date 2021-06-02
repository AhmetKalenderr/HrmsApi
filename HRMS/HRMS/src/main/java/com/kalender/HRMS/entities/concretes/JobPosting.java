package com.kalender.HRMS.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="JobPostings")
@AllArgsConstructor
@NoArgsConstructor

public class JobPosting {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_posting_id")
	private int jobPostingId;
	
	@Column(name="Job_details")
	private String jobDetail;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max")
	private int maxSalary;
	
	@Column(name="number_of_open_positions")
	private int numberOfOpenPosition;
	
	@Column(name="deadline")
	private LocalDateTime deadLine;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="city_Id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="job_position_id")
	private JobTittles jobTittles;
}
