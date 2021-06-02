package com.kalender.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "job_seekers_id",referencedColumnName = "id")
@Table(name="Job_seekers")
public class JobSeeker {
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String jobSeekerName;
	
	@Column(name="surname")
	private String jobSeekerSurname;
	
	@Column(name="idendity_number")
	private String jobSeekerIdendityNumber;
	
	@Column(name="year_of_birth")
	private String jobSeekerYearOfBirthday;


}
