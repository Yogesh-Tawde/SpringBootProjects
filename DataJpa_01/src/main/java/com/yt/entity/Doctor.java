package com.yt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JPA_DOCTOR_TABLE")
@Data
public class Doctor 
{
	@Column(name="ID")
	@Id()
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer docId;
	
	@Column(name="DOCTONAME")
	private String docName;
	
	@Column(name="SPECIALIZATION")
	private String specialization;
	
	@Column(name="INCOME")
	private Double docIncome;
	

}
