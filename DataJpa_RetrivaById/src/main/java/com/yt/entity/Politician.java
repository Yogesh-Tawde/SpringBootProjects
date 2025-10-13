package com.yt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="POLITICIAN_TABLE")
@Data
public class Politician 
{ 
	
	@Column(name="P_ID")
	@Id
	@SequenceGenerator(name="gen1",sequenceName="CN_SQU",initialValue=100,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.AUTO)
     private Integer p_id;
     
	@Column(name="POLITICIAN_NAME",length=25)
     private String p_name;
	@Column(name="POLITICIAN_ADDR",length=25)
     private String p_addrs;
	@Column(name="POLITICIAN_INCOME")
     private Double p_income;
}
