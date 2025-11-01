package com.yt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_PHONENUMBERS")
@RequiredArgsConstructor
@Getter
@Setter
public class PhoneNumber
{

	@Id
	@SequenceGenerator(name="gen1",sequenceName="REG_NO_SQU",initialValue=100,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer regNo;
	
	@Column(name="MOBILE_NO")
	@NonNull
	private Long mobileNo;
	
	@Column(name="PROVIDER",length=30)
	@NonNull
	private String provider;
	
	@Column(name="NUMBER_TYPE",length=30)
	@NonNull
	private String numberType;
	
	@ManyToOne(targetEntity=Person.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="PERSON_ID",referencedColumnName="PID")
	private Person personInfo;
	
	
	public PhoneNumber()
	{
		System.out.println("PhoneNumber.PhoneNumber()");
	}


	@Override
	public String toString() 
	{
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", numberType="
				+ numberType + "]";
	}


	
}
