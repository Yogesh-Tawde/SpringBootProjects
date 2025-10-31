package com.yt.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="PERSON_INFO")
@RequiredArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
public class Person 
{
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@Column(name="P_NAME",length=20)
	@NonNull
	private String pname;
	
	
	@Column(name="P_ADDRESS",length=20)
	@NonNull
	private String paddrs;
	
	@OneToMany(targetEntity=PhoneNumber.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="personInfo")
	//@JoinColumn(name="PERSON_ID",referencedColumnName="PID")
	private Set<PhoneNumber> contactDetails;

	@Override
	public String toString() 
	{
		return  "Person Name: "+pname+" Address: "+paddrs;
	}
	
	
	public Person()
	{
		System.out.println("Person.Person() Zero param Constructor");
	}
	

}
