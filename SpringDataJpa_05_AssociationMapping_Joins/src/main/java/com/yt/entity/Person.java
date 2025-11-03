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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PERSON_INFO")
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Person 
{
	
	@Id
	@GeneratedValue
    private Integer pid;
    
	@Column(name="P_NAME")
    @NonNull
    private String pname;
    
    @Column(name="P_ADDRESS")
    @NonNull
    private String paddrs;
    
    @OneToMany(targetEntity=PhoneNumber.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="personInfo")
    private Set<PhoneNumber> contactDetails;
    
    
    public String toString()
    {
    	return "Person Id: "+pid+"Person name :"+pname+"Person Address: "+paddrs;
    	
    }
}
