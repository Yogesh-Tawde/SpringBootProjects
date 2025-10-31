package com.yt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yt.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> 
{
	

}


