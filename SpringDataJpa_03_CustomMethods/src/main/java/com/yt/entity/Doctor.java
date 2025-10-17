package com.yt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="JPA_DOCTOR_TABLE")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Doctor 
{
	@Id
	@SequenceGenerator(name="gen1",sequenceName="CN_SQU",initialValue=100,allocationSize=1)
	@Column(name="id")
	private Integer id;
	
	@Column(name="INCOME")
	private Double income;
	
	@Column(name="DOCTONAME")
	private String name;
	
	@Column(name="SPECIALIZATION")
	private String speci;

}
