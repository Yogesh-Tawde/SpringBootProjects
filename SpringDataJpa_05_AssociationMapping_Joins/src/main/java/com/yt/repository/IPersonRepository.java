package com.yt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.yt.entity.Person;

public interface IPersonRepository  extends JpaRepository<Person,Integer> 
{
	
	@Query("SELECT pr.pid,pr.pname,pr.paddrs,p.regNo,p.mobileNo,p.provider,p.numberType from Person pr left join contactDetails p")
	public List<Object[]> fetchDataByUsingParent();

}
